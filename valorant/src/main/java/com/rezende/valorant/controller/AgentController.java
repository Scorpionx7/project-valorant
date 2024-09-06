package com.rezende.valorant.controller;

import com.rezende.valorant.entity.Agent;
import com.rezende.valorant.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agents")
public class AgentController {

    @Autowired
    private AgentService agentService;

    @GetMapping
    public ResponseEntity<List<Agent>> listAll(){
        return ResponseEntity.ok(agentService.listAll());
    }

    @PostMapping
    public ResponseEntity<Agent> save(@RequestBody Agent agent){
        return ResponseEntity.ok(agentService.save(agent));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Agent> searchById(@PathVariable Long id){
        return ResponseEntity.ok(agentService.searchById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        agentService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
