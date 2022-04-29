package workflow

import com.fipsoft.api.security.model.FipsApplicationAuthority

enum PrsRole implements FipsApplicationAuthority{

    ROLE_PRS_OFFICER,
    ROLE_PRS_PERSON,
    ROLE_PRS_CHIEF_OFFICER,
    ROLE_PRS_MANAGER

    @Override
    String getAuthority() {
        return this.name();
    }

    @Override
    String toString() {
        return this.name()
    }

    @Override
    String getAssociatedApp() {
        return "prs"
    }

    static final List<PrsRole> ALL_ROLES = values().toList().asImmutable()
    static final List<String> ALL_ROLES_IDS = ALL_ROLES.collect { it.authority }

}