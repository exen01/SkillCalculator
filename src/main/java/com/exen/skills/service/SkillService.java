package com.exen.skills.service;

import com.exen.skills.entity.Skill;
import com.exen.skills.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillService {
    private SkillRepository skillRepository;

    @Autowired
    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public Skill save(Skill skill){
        return skillRepository.save(skill);
    }

    public Optional<Skill> findById(Long id){
        return skillRepository.findById(id);
    }

    public List<Skill> findAll(){
        return skillRepository.findAll();
    }

    public Skill findByTitle(String title){
        return skillRepository.findByTitle(title).orElse(null);
    }
}
