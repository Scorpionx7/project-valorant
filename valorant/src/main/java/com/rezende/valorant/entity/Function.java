package com.rezende.valorant.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Function {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "function")
    private List<Agent> agents;

    public Function(){

    }

    public Function(Long id, String name, String description, List<Agent> agents) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.agents = agents;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Agent> getAgents() {
        return agents;
    }

    public void setAgents(List<Agent> agents) {
        this.agents = agents;
    }

}
