package org.Example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguration{
    @Bean (name="ApplicationName")
    public String ApplicationName() {
        return "Sistema de Vendas";
    }
    }

