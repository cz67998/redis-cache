package com.example.rediscache.service.impl;

import com.example.rediscache.domain.RedisDomain;
import com.example.rediscache.service.RedisDomainService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/6/10
 * Time:11:20
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisDomainServiceImplTest {
    @Autowired
    private RedisDomainService redisDomainService;

    @Test
    public void update() {
       Optional<RedisDomain>  redisDomain=redisDomainService.findById(1);
        redisDomain.get().setAge("20");
        redisDomainService.update(redisDomain.get());

    }

    @Test
    public void findByName() {
        redisDomainService.findByName("tom");
    }
}