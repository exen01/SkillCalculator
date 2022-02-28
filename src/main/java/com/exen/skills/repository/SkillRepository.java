package com.exen.skills.repository;

import com.exen.skills.entity.Skill;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SkillRepository extends CassandraRepository<Skill, Long> {

    @Query("select * from sckeyspace.skills where title = ?0 ALLOW FILTERING")
    Optional<Skill> findByTitle(String title);
}
