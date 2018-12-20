package com.example.demo.controller;

import com.example.demo.data.Repository.CoderRepository;
import com.example.demo.data.nodeentity.Coder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CoderController {

    @Autowired
    CoderRepository coderRepository;

    @RequestMapping("/getName")
    public Coder getCoderByName(@RequestParam(value = "name") String name) {
        return coderRepository.findByName(name);
    }

    @PostMapping("/save")
//    @Transactional
    public String createCoder(@RequestBody Coder coder) {
        Coder result = coderRepository.save(coder);
        if (result != null) {
            return result.getName() + "节点创建成功！";
        }
        return result.getName() + "节点创建失败！";
    }
}
