package com.example.demo.data.Repository;

import com.example.demo.data.nodeentity.Player;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PlayerRepository extends Neo4jRepository<Player, Long> {
}
