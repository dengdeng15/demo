package com.example.demo.data.mapper;

import com.example.demo.data.entity.FndManager;

public interface FndManagerMapper {
    int insert(FndManager record);

    int insertSelective(FndManager record);
}