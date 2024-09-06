package com.rezende.valorant.controller;


import com.rezende.valorant.entity.Skill;
import com.rezende.valorant.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/habilidades")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping
    public ResponseEntity<List<Skill>> listAll(){
        return ResponseEntity.ok(skillService.listSkill());
    }

    @PostMapping
    public ResponseEntity<Skill> save(@RequestBody Skill skill){
        return ResponseEntity.ok(skillService.save(skill));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Skill> searchById(@PathVariable Long id){
        return ResponseEntity.ok(skillService.searchById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        skillService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
