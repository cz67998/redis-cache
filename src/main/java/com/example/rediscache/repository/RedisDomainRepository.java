package com.example.rediscache.repository;

import com.example.rediscache.domain.RedisDomain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/6/10
 * Time:10:08
 **/
public interface RedisDomainRepository extends JpaRepository<RedisDomain,Integer> {
    Optional<RedisDomain> findById(Integer id);
    RedisDomain findTopByName(String name);
}
