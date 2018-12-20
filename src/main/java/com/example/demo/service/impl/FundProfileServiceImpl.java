package com.example.demo.service.impl;

import com.example.demo.data.mapper.FndProfileMapper;
import com.example.demo.service.FundProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("FundProfileService")
public class FundProfileServiceImpl implements FundProfileService {

    @Autowired
    FndProfileMapper fndProfileMapper;

    @Override
    public String getFundNameByFundCode(String fundCode) {
        return fndProfileMapper.findFundName(fundCode);
    }
}
