package prs

import com.fipsoft.api.workflow.model.WorkflowDomain

import dom.Region


class Prs implements  WorkflowDomain{

    Long id
    String name
    String lastName
    String middleName
    Region region
    String address
    String phoneNumber
    String email
    String comment
    String ssn



    static constraints = {
        name(nullable: false, maxSize: 30, blank: false)
        lastName(nullable: false, maxSize: 30, blank: false)
        middleName(nullable: false, maxSize: 30, blank: false)
        region(nullable: false)
        address(nullable: false, maxSize: 50, blank: false)
        phoneNumber(nullable: false, maxSize: 12, blank: false)
        comment(nullable: true, maxSize: 500, blank: true)
        ssn(nullable: false, maxSize: 10, blank: false)
        email(nullable: false, maxSize: 50, blank: false, unique: true)
    }

    static  mapping = {
        dynamicUpdate(true)

//        table 'PRS'
//        id generator: 'org.hibernate.id.enhanced.SequenceStyleGenerator', params: [sequence_name: 'PRS_SEQUENCE']

        name column: "NAME", sqlType: "char", length: 30
        lastName column: "LAST_NAME", sqlType: "char",length : 30
        lastName column: "MIDDLE_NAME", sqlType: "char",length : 30
        region column: "REGION"
        address column: "ADDRESS", sqlType: "char",length : 50
        comment column: "ADDRESS", sqlType: "char",length : 500
        phoneNumber column: "PHONE_NUMBER", sqlType: "char",length : 12
        ssn  column: "SSN" , sqlType: "char", length: 10
        email column: "EMAIL", sqlType: "char", length: 50
    }
}
