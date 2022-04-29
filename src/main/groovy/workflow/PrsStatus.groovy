package workflow

import com.fipsoft.api.workflow.model.WorkflowStatus
import groovy.transform.Memoized

enum PrsStatus implements WorkflowStatus{

    NEW(""),
    CREATED("Created"),
    SUBMITTED("Submitted"),
    REGISTERED("Registered"),
    APPROVED("Approved"),
    REJECTED("Rejected")


    private final String id

    PrsStatus(String id) {
        this.id = id;
    }

    @Override
    String getId() {
        return id
    }

    @Override
    String getI18Code() {
        return "default.status.${name().toLowerCase()}.message"
    }

    static List<String> list() {
        return values().collect { it.id }
    }

    @Memoized
    static PrsStatus byId(String id) {
        values().find { it.id.equalsIgnoreCase(id) }
    }
}

