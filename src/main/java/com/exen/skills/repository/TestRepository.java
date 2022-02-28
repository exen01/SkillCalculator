package com.exen.skills.repository;

import com.exen.skills.entity.Test;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends CassandraRepository<Test, Long> {
}
