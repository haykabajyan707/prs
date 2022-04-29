package prs

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_PRS_OFFICER', 'ROLE_PRS_PERSON', 'ROLE_PRS_CHIEF_OFFICER', 'ROLE_PRS_MANAGER'])
class PrsController {

    PrsService  prsService

    def index() {
        def response = prsService.list(params)
        [prs: response.list, total: response.count]
    }

    def show(Integer id) {
        def response = prsService.getById(id)
        if (!response) {
            redirect(controller: "prs", action: "index")
        } else {
            [prs: response]
        }
    }

    def create() {
        [prs: flash.redirectParams]
    }

    def save() {
        def response = prsService.save(params)
        if (!response.isSuccess) {
            flash.redirectParams = response.model
            redirect(controller: "prs", action: "create")
        } else {
            redirect(controller: "prs", action: "index")
        }
    }

    def edit(Integer id) {
        if (flash.redirectParams) {
            [prs: flash.redirectParams]
        } else {
            def response = prsService.getById(id)
            if (!response) {
                redirect(controller: "prs", action: "index")
            } else {
                [prs: response]
            }
        }
    }

    def update() {
        def response = prsService.getById(params.id)
        if (!response) {
            redirect(controller: "prs", action: "index")
        } else {
            response = prsService.update(response, params)
            if (!response.isSuccess){
                flash.redirectParams = response.model
                redirect(controller: "prs", action: "edit")
            }else{
                redirect(controller: "prs", action: "index")
            }
        }
    }


    def delete(Integer id){
        def response = prsService.getById(id)
        if (!response){
            redirect(controller: "prs", action: "index")
        }else {
            response = prsService.delete(response)
            redirect(controller: "prs", action: "index")
        }
    }

}
