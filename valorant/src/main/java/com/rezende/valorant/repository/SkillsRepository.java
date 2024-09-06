package com.rezende.valorant.repository;

import com.rezende.valorant.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillsRepository extends JpaRepository<Skill, Long> {

}
