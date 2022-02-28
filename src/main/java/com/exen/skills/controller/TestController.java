package com.exen.skills.controller;

import com.exen.skills.entity.Test;
import com.exen.skills.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/tests")
public class TestController {

    private TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Test test){
        return ResponseEntity.ok(testService.save(test));
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        Optional<Test> testById = testService.findById(id);
        return Objects.isNull(testById)
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(testById);
    }

    @GetMapping
    public ResponseEntity findAll(){
        return ResponseEntity.ok(testService.findAll());
    }

}
