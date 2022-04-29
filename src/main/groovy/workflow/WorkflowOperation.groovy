package workflow

import com.fipsoft.api.workflow.model.OperationType
import org.codehaus.groovy.transform.trait.Traits
import org.springframework.security.core.GrantedAuthority

interface WorkflowOperation {

    String getId();

    @Traits.Implemented
    String getI18Code();

    @Traits.Implemented
    String getCustomStyleToApply();

    @Traits.Implemented
    boolean confirmationRequired();

    @Traits.Implemented
    boolean validationRequired();

    @Traits.Implemented
    boolean submitForm();

    @Traits.Implemented
    String getButtonStyle();

    @Traits.Implemented
    OperationType getOperationType();

    @Traits.Implemented
    String getController();

    @Traits.Implemented
    boolean isCrudAction();

    @Traits.Implemented
    String getAction();

    @Traits.Implemented
    String getIcon();

    @Traits.Implemented
    Collection<? extends GrantedAuthority> getAuthorities();

    @Traits.Implemented
    int getWeight();

}