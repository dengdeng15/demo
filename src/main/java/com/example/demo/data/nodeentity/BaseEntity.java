package com.example.demo.data.nodeentity;

import org.neo4j.ogm.annotation.GraphId;

public abstract class BaseEntity {

    @GraphId
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
