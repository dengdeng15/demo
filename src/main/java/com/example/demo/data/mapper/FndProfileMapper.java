package com.example.demo.data.mapper;

import com.example.demo.data.entity.FndProfile;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FndProfileMapper {
    int insert(FndProfile record);

    int insertSelective(FndProfile record);

    String findFundName(String fundCode);
}