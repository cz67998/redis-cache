package com.example.rediscache.service;

import com.example.rediscache.domain.RedisDo;
import com.example.rediscache.domain.RedisDomain;

import java.util.List;
import java.util.Optional;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/6/10
 * Time:10:20
 **/
public interface RedisDomainService {
    RedisDomain update(RedisDomain redisDomain);

    List<RedisDo> findAll();

    Optional<RedisDomain> findById(Integer id);

    RedisDomain findByName(String name);
}
