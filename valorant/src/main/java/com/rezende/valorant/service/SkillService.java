package com.rezende.valorant.service;

import com.rezende.valorant.entity.Skill;
import com.rezende.valorant.repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    @Autowired
    private SkillsRepository skillsRepository;

    public List<Skill> listSkill(){
        return skillsRepository.findAll();
    }

    public Skill save(Skill skill){
        return skillsRepository.save(skill);
    }

    public Skill searchById(Long id){
        return skillsRepository.findById(id).orElseThrow(()-> new RuntimeException("skills not found"));
    }

    public void delete(Long id){
        skillsRepository.deleteById(id);
    }
}
