package attachment

import java.time.LocalDate

class Attachment {

    Integer sequenceNumber
    String documentType
    String documentNote
    LocalDate documentDate
    String documentRef

    static constraints = {
        documentNote(nullable: false, blank: true, maxSize: 500)
        documentType(nullable: false, blank: false, maxSize: 50)
        documentRef(blank: false, nullable: false, maxSize: 100)
        sequenceNumber(nullable: false)
        documentDate(nullable: false)
    }

    static mapping = {
        version false
        dynamicUpdate true

        table 'PRS_ATTACHMENT'
        id generator: 'org.hibernate.id.enhanced.SequenceStyleGenerator', params: [sequence_name: 'PRS_ATTACHMENT_SEQUENCE']


    }
}
