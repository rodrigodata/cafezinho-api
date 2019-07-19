package com.wirecard.apitest.config

import com.wirecard.apitest.interfaces.ProcessadorNumeroInterface
import com.wirecard.apitest.service.ProcessamentoService
import com.wirecard.apitest.service.ProcessamentoSuperiorService
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AppConfig {

    @Bean(name = ["implementacaoUm"])
    fun implementacaoUm(): ProcessadorNumeroInterface {
        return ProcessamentoSuperiorService();
    }

    @Bean(name = ["implementacaoDois"])
    fun implementacaoDois(): ProcessadorNumeroInterface {
        return ProcessamentoService();
    }
}