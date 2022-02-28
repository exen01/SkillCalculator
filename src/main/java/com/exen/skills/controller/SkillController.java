package com.exen.skills.controller;

import com.exen.skills.entity.Skill;
import com.exen.skills.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/skills")
public class SkillController {
    private SkillService skillService;

    @Autowired
    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Skill skill){
        return ResponseEntity.ok(skillService.save(skill));
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        Optional<Skill> skillById = skillService.findById(id);
        return Objects.isNull(skillById)
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(skillById);
    }

    @GetMapping
    public ResponseEntity findAll(){
        return ResponseEntity.ok(skillService.findAll());
    }

    @GetMapping("/by/{title}")
    public ResponseEntity findByTitle(@PathVariable String title){
        Skill skillByTitle = skillService.findByTitle(title);
        return Objects.isNull(skillByTitle)
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(skillByTitle);
    }
}
