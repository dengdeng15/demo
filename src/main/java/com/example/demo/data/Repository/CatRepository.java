package com.example.demo.data.Repository;

import com.example.demo.data.nodeentity.Cat;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CatRepository extends Neo4jRepository<Cat, Long> {
}
