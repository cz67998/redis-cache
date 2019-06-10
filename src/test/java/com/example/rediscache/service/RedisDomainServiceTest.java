package com.example.rediscache.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/6/10
 * Time:10:22
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisDomainServiceTest {
    @Autowired
    private RedisDomainService redisDomainService;
    @Test
    public void findByName() {
        redisDomainService.findByName("tom");
    }
}