package com.rezende.valorant.service;


import com.rezende.valorant.entity.Agent;
import com.rezende.valorant.repository.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentService {

    @Autowired
    private AgentsRepository agentsRepository;

    public List<Agent> listAll(){
        return agentsRepository.findAll();
    }

    public Agent save(Agent agent){
        return agentsRepository.save(agent);
    }
    public Agent searchById(Long id){
        return agentsRepository.findById(id).orElseThrow(()-> new RuntimeException("Agent not found"));
    }

    public void delete (Long id){
        agentsRepository.deleteById(id);
    }
}
