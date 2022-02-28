package com.exen.skills.controller;

import com.exen.skills.entity.Programmer;
import com.exen.skills.service.ProgrammerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/programmers")
public class ProgrammerController {

    private ProgrammerService programmerService;

    @Autowired
    public ProgrammerController(ProgrammerService programmerService) {
        this.programmerService = programmerService;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Programmer programmer){
        return ResponseEntity.ok(programmerService.save(programmer));
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        Optional<Programmer> programmerById = programmerService.findById(id);
        return Objects.isNull(programmerById)
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(programmerById);
    }

    @GetMapping
    public ResponseEntity findAll(){
        return ResponseEntity.ok(programmerService.findAll());
    }
}
