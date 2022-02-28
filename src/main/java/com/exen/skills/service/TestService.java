package com.exen.skills.service;

import com.exen.skills.entity.Test;
import com.exen.skills.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestService {

    private TestRepository testRepository;

    @Autowired
    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public Test save(Test test){
        return testRepository.save(test);
    }

    public Optional<Test> findById(Long id){
        return testRepository.findById(id);
    }

    public List<Test> findAll(){
        return testRepository.findAll();
    }
}
