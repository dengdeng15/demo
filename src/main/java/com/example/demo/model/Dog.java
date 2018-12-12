package com.example.demo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/*
 * 使用@PropertySource引入外部配置文件时，只能是properties的文件不能是yml文件
 * 当外部配置文件和默认的application.properties/application.yml文件中有相同前缀的属性，
 * 则application中属性会覆盖外部配置文件中相同前缀的属性
 */
@Component
@PropertySource(value = {"classpath:dog.properties"})
@ConfigurationProperties(prefix = "dog")
public class Dog {

//    @Value("#{person.name}")
    private String name;

//    @Value("#{person.age}")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
