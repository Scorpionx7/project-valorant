package com.rezende.valorant.service;

import com.rezende.valorant.entity.Function;
import com.rezende.valorant.repository.FunctionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunctionService {

    @Autowired
    private FunctionsRepository functionsRepository;

    public List<Function> listFunction(){
        return functionsRepository.findAll();
    }

    public Function save (Function function){
        return functionsRepository.save(function);
    }

    public Function searchById(Long id){
        return functionsRepository.findById(id).orElseThrow(()-> new RuntimeException("function not found"));
    }

    public void delete(Long id){
        functionsRepository.deleteById(id);
    }

}
