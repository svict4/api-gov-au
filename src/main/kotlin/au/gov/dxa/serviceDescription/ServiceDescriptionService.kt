package au.gov.dxa.serviceDescription

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ServiceDescriptionService {

    @Autowired
    lateinit var service: ServiceDescriptionRepository

    fun get(id:String): ServiceDescription? {
        return service.get(id)
    }

    fun list(): List<ServiceListVM> = service.list()
}