package com.example.demo.data.Repository;

import com.example.demo.data.nodeentity.Coder;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Component;

@Component
public interface CoderRepository extends Neo4jRepository<Coder, Long> {
    Coder findByName(@Param("name") String name);
}
