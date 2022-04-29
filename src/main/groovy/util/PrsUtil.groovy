package util

import org.grails.web.util.WebUtils

class PrsUtil {

    static saveResponse(Boolean isSuccess, def model){
        return [isSuccess: isSuccess, model: model]
    }

    static getAppSession(){
        return WebUtils.retrieveGrailsWebRequest().session;
    }

    static infoMessage(String message, boolean status = true){
        return [info: message, success: status]
    }

    static  Integer itemPerPage(){
        return 10
    }
}
