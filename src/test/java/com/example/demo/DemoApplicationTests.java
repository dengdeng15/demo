package com.example.demo;

import com.example.demo.model.Company;
import com.example.demo.model.Dog;
import com.example.demo.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@EnableConfigurationProperties
public class DemoApplicationTests {

    @Autowired
    Dog dog;

    @Autowired
    Person person;

    @Autowired
    private Company company;

    @Test
    public void contextLoads() {
        System.out.println(dog.toString());
        System.out.println(person.toString());
        System.out.println(company.toString());
    }

}
