package com.example.demo.test;

import com.example.demo.DemoApplicationTests;
import com.example.demo.data.Repository.UserRepository;
import com.example.demo.data.nodeentity.UserNode;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryTest extends DemoApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Test
    public void createUserNode() {
        System.out.println(userRepository);
        UserNode userNode = new UserNode();
        userNode.setName("xupan");
        userNode.setUserId("123");
        UserNode save = userRepository.save(userNode);
    }
}
