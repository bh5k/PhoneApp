package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="ATT")
    public SimCard getAtt() {
        return new ATT();
    }

    @Bean(name="Verizon")
    public SimCard getVerizon() {
        Verizon verizon = new Verizon();
        verizon.setRate(25);
        return verizon;
    }
}
