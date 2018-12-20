package com.example.demo.controller;

import com.example.demo.service.FundProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FundController {

    @Autowired
    FundProfileService fundProfileService;

    @RequestMapping("/getFundName")
    private String getFundName(@RequestParam("fundCode") String fundCode) {
        return fundProfileService.getFundNameByFundCode(fundCode);
    }
}
