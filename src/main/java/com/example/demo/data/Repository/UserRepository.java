package com.example.demo.data.Repository;

import com.example.demo.data.nodeentity.UserNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UserRepository extends Neo4jRepository<UserNode, Long> {

}
