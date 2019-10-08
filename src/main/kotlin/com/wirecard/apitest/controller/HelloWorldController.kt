package com.wirecard.apitest.controller

import com.wirecard.apitest.interfaces.ProcessadorNumeroInterface
import com.wirecard.apitest.service.ProcessamentoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @Qualifier("implementacaoDois")
    @Autowired
    lateinit var processadorNumeroService: ProcessadorNumeroInterface

    data class Processamento(val numeroProcessado: Int)
    data class QueroCafe(val resposta: String)

    @GetMapping("/coffee")
    fun queroCafe(@RequestParam(value = "acucar", defaultValue = "sim") acucar: String): QueroCafe {
        return QueroCafe("$acucar")
    }


    @GetMapping("/processing")
    fun processamento(@RequestParam(value = "numero") numero: Int): Processamento {
       return Processamento(processadorNumeroService.processarNumero(numero))
    }

}