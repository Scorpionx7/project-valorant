package com.rezende.valorant.entity;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String country;

    @ManyToOne
    @JoinColumn(name = "funcao_id")
    private Function function;

    @OneToMany(mappedBy = "agent", cascade = CascadeType.ALL)
    private List<Skill> skills;

    public Agent(){

    }

    public Agent(Long id, String name, String country, Function function, List<Skill> skills) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.function = function;
        this.skills = skills;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

}
