package com.rezende.valorant.config;

import com.rezende.valorant.entity.Agent;
import com.rezende.valorant.entity.Function;
import com.rezende.valorant.service.AgentService;
import com.rezende.valorant.service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;

public class DatabaseSeeder {

    @Autowired
    private AgentService agentService;

    @Autowired
    private FunctionService functionService;

    @Bean
    public CommandLineRunner seedDatabase(){
        return args -> {

            //Functions
            Function function1 = new Function(null,"Duelista", "matar");
            Function function2 = new Function(null, "Sentilena", "proteger");

            functionService.save(function1);
            functionService.save(function2);

            // Agents and Skills

            

        };
    }
}
