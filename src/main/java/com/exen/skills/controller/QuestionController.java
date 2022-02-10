package com.exen.skills.controller;

import com.exen.skills.entity.Question;
import com.exen.skills.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    private QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Question question){
        return ResponseEntity.ok(questionService.save(question));
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        Optional<Question> questionById = questionService.findById(id);
        return Objects.isNull(questionById)
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(questionById);
    }

    @GetMapping
    public ResponseEntity findAll(){
        return ResponseEntity.ok(questionService.findAll());
    }


}
