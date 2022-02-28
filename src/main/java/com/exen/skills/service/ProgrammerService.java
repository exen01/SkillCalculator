package com.exen.skills.service;

import com.exen.skills.entity.Programmer;
import com.exen.skills.repository.ProgrammerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgrammerService {

    private ProgrammerRepository programmerRepository;

    @Autowired
    public ProgrammerService(ProgrammerRepository programmerRepository){
        this.programmerRepository = programmerRepository;
    }

    public Programmer save(Programmer programmer){
        return programmerRepository.save(programmer);
    }

    public Optional<Programmer> findById(Long id){
        return programmerRepository.findById(id);
    }

    public List<Programmer> findAll(){
        return programmerRepository.findAll();
    }
}
