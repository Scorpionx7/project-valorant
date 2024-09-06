package com.rezende.valorant.controller;

import com.rezende.valorant.entity.Function;
import com.rezende.valorant.service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/funcoes")
public class FunctionController {

    @Autowired
    private FunctionService functionService;

    @GetMapping
    public ResponseEntity<List<Function>> listAll(){
        return ResponseEntity.ok(functionService.listFunction());
    }

    @PostMapping
    public ResponseEntity<Function> save(@RequestBody Function function){
        return ResponseEntity.ok(functionService.save(function));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Function> searchById(@PathVariable Long id){
        return ResponseEntity.ok(functionService.searchById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        functionService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
