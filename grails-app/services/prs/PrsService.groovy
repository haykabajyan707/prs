package prs

import grails.transaction.Transactional
import grails.web.servlet.mvc.GrailsParameterMap
import org.springframework.validation.BindingResult
import util.PrsUtil

@Transactional
class PrsService {

    def save(GrailsParameterMap params) {
        Prs prs = new Prs(params)
        def response = PrsUtil.saveResponse(false, params)
        if (prs.validate()) {
            prs.save(flush: true)
            if (!prs.hasErrors()) {
                response.isSuccess = true
            }
        }
    }

    def update(Prs prs, GrailsParameterMap params) {
        prs.properties = params as BindingResult
        def response = PrsUtil.saveResponse(false, prs)
        if (prs.validate()) {
            prs.save(flush: true)
            if (!prs.hasErrors()) {
                response.isSuccess = true
            }
        }
        return response
    }

    def getById(Serializable id) {
        return Prs.get(id)
    }

    def list(GrailsParameterMap params){
        params.max = params.max?: PrsUtil.itemPerPage()
        List<Prs> prsList = Prs.createCriteria().list(params) {
            if (params?.colName && params?.colValue){
                like(params.colName,  "%" + params.colValue + "%")
            }
            if (!params.sort()){
                order("id", "desc")
            }
        } as List<Prs>
        return [list: prsList, count: prsList.size()]
    }

    def delete(Prs prs) {
        try {
            prs.delete(flush: true)
        } catch (Exception e) {
            println(e.getMessage())
            return false
        }
        return true
    }
}
