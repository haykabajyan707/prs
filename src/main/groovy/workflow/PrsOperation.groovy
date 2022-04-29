package workflow

import com.fipsoft.api.workflow.model.OperationType
import com.google.common.collect.ImmutableList
import org.springframework.security.core.GrantedAuthority

import static com.fipsoft.api.workflow.model.OperationType.SEARCH
import static workflow.PrsRole.*


enum PrsOperation implements WorkflowOperation {


    CREATE("create"){
        @Override
        Collection<PrsRole> getAuthorities() {
            return ImmutableList.of(ROLE_PRS_OFFICER, ROLE_PRS_PERSON)
        }

        @Override
        OperationType getOperationType() {
            return SUBMIT
        }
    },


    VIEW_IN_CREATED_STATUS("viewInCreatedStatus"){
        @Override
        Collection<PrsRole> getAuthorities() {
            return ImmutableList.of(ROLE_PRS_OFFICER, ROLE_PRS_PERSON)
        }

        @Override
        OperationType getOperationType() {
            return SEARCH
        }
    },

    DELETE_IN_CREATED_STATUS("deleteInCreatedStatus"){
        @Override
        Collection<PrsRole> getAuthorities() {
            return ImmutableList.of(ROLE_PRS_OFFICER, ROLE_PRS_PERSON)
        }

        @Override
        OperationType getOperationType() {
            return SUBMIT
        }
    },

    SUBMIT("submit"){
        @Override
        Collection<PrsRole> getAuthorities() {
            return ImmutableList.of(ROLE_PRS_OFFICER, ROLE_PRS_PERSON)
        }

        @Override
        OperationType getOperationType() {
            return SUBMIT
        }
    },

    VIEW_IN_SUBMITTED_STATUS("viwInSubmittedStatus"){
        @Override
        Collection<PrsRole> getAuthorities() {
            return ImmutableList.of(ROLE_PRS_OFFICER, ROLE_PRS_PERSON)
        }

        @Override
        OperationType getOperationType() {
            return SEARCH
        }
    },

    REGISTER("register"){
        @Override
        Collection<PrsRole> getAuthorities() {
            return ImmutableList.of(ROLE_PRS_OFFICER, ROLE_PRS_PERSON)
        }

        @Override
        OperationType getOperationType() {
            return SUBMIT
        }
    },

    VIEW_IN_REGISTERED_STATUS("viewInRegisteredStatus"){
        @Override
        Collection<PrsRole> getAuthorities() {
            return ImmutableList.of(ROLE_PRS_OFFICER, ROLE_PRS_PERSON)
        }

        @Override
        OperationType getOperationType() {
            return SEARCH
        }
    },

    APPROVE("approve"){
        @Override
        Collection<PrsRole> getAuthorities() {
            return ImmutableList.of(ROLE_PRS_CHIEF_OFFICER, ROLE_PRS_MANAGER)
        }

        @Override
        OperationType getOperationType() {
            return SUBMIT
        }
    },

    VIEW_IN_APPROVED_STATUS("viewInApprovedStatus"){
        @Override
        Collection<PrsRole> getAuthorities() {
            return ImmutableList.of(ROLE_PRS_CHIEF_OFFICER, ROLE_PRS_MANAGER)
        }

        @Override
        OperationType getOperationType() {
            return SEARCH
        }
    },

    REJECT("reject"){
        @Override
        Collection<PrsRole> getAuthorities() {
            return ImmutableList.of(ROLE_PRS_CHIEF_OFFICER, ROLE_PRS_MANAGER)
        }

        @Override
        OperationType getOperationType() {
            return SUBMIT
        }
    },

    VIEW_IN_REJECTED_STATUS("reject"){
        @Override
        Collection<PrsRole> getAuthorities() {
            return ImmutableList.of(ROLE_PRS_CHIEF_OFFICER, ROLE_PRS_MANAGER)
        }

        @Override
        OperationType getOperationType() {
            return SEARCH
        }
    },

    RE_CREATE("reCreate"){
        @Override
        Collection<PrsRole> getAuthorities() {
            return ImmutableList.of(ROLE_PRS_CHIEF_OFFICER, ROLE_PRS_MANAGER)
        }

        @Override
        OperationType getOperationType() {
            return SUBMIT
        }
    },

    private final String operationId


    PrsOperation(String operationId) {
        this.operationId = operationId
    }

    @Override
    String getId() {
        return this.operationId;
    }

    @Override
    String getI18Code() {
        return null
    }

    @Override
    String getCustomStyleToApply() {
        return null
    }

    @Override
    boolean confirmationRequired() {
        return false
    }

    @Override
    boolean validationRequired() {
        return false
    }

    @Override
    boolean submitForm() {
        return false
    }

    @Override
    String getButtonStyle() {
        return null
    }

    @Override
    OperationType getOperationType() {
        return null
    }

    @Override
    String getController() {
        return null
    }

    @Override
    boolean isCrudAction() {
        return false
    }

    @Override
    String getAction() {
        return null
    }

    @Override
    String getIcon() {
        return null
    }

    @Override
    Collection<? extends GrantedAuthority> getAuthorities() {
        return null
    }

    @Override
    int getWeight() {
        return 0
    }
}