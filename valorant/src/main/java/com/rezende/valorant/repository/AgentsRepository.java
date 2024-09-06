package com.rezende.valorant.repository;

import com.rezende.valorant.entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentsRepository extends JpaRepository<Agent, Long> {
}
