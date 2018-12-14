package com.example.demo.controller;

import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class PersonController {

    @Autowired
    Person person;

    @RequestMapping("/hello")
    public String hello(Model model) {
        System.out.println("hello test");
        model.addAttribute("test", "hello");

        person.setName("Lucy");
        person.setAge(18);
        person.setBirth(new Date());
        model.addAttribute("p", person);

        List<Person> list = new ArrayList<>();
        for (int i = 1; i <= 10 ; i++) {
            Person person1 = new Person();
            person1.setName("Lucy" + i);
            person1.setAge(18 + i);
            person1.setBirth(new Date());
            list.add(person1);
        }
        model.addAttribute("list", list);
        return "test";
    }

    @RequestMapping("/toLogin")
    public String toLogin(@RequestParam(name = "name") String name,
                          Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @RequestMapping("/login")
    public String login(@ModelAttribute Person person,
                        Model model) {
        model.addAttribute("name", person.getName());
        return "test";
    }
}
