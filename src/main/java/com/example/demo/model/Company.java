package com.example.demo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;

@Component
@ConfigurationProperties(prefix = "company")
@Validated
public class Company {

    @Value("#{5 + 5}")  //支持EL表达式
    private int age;

    @Value("${company.name}")
    private String name;

    @Value("${company.boss}")
    private String boss;

    @Value("${company.addr}")
    private String addr;

    @Email  //打开@Validated注解后，可以校验字段
    @Value("${company.email}")
    private String email;

    @Override
    public String toString() {
        return "Company{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", boss='" + boss + '\'' +
                ", addr='" + addr + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBoss() {
        return boss;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
