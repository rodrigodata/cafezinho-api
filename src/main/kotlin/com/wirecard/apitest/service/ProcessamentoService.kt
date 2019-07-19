package com.wirecard.apitest.service

import com.wirecard.apitest.interfaces.ProcessadorNumeroInterface
import org.springframework.stereotype.Service

@Service
class ProcessamentoService: ProcessadorNumeroInterface {

    override fun processarNumero(numero: Int): Int {
        return numero * 2
    }
}