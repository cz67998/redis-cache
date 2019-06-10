package com.example.rediscache.controller;

import com.example.rediscache.domain.RedisDomain;
import com.example.rediscache.domain.RedisDomainVO;
import com.example.rediscache.service.RedisDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/6/9
 * Time:22:04
 **/
@RestController
@RequestMapping("/cache")
public class RdisCacheController {
    @Autowired
    private RedisDomainService redisDomainService;

    @GetMapping("/get")
    @Cacheable(cacheNames = "product",key = "123")
    public RedisDomainVO get() {
        RedisDomainVO redisDomainVO=new RedisDomainVO();
        redisDomainVO.setCode("200");
        redisDomainVO.setDiscrible("成功");
        redisDomainVO.setRedisDomainList( redisDomainService.findAll());
        return redisDomainVO;
    }
    @GetMapping("/set")
    //@CachePut( cacheNames = "product",key = "123")
    //删除缓存
    @CacheEvict( cacheNames = "product",key = "123")
    public RedisDomainVO set(@RequestParam(value="age") String age) {

        RedisDomain redisDomain1 = redisDomainService.findByName("tom");
        redisDomain1.setAge(age);
        redisDomainService.update(redisDomain1);
        RedisDomainVO redisDomainVO=new RedisDomainVO();
        redisDomainVO.setCode("200");
        redisDomainVO.setDiscrible("成功");
        redisDomainVO.setRedisDomainList( redisDomainService.findAll());
        return redisDomainVO;
    }
    @GetMapping("/get1")
    //条件成立才会对结果进行缓存
    //unless判定条件
    @Cacheable(cacheNames = "product1",key = "#id",condition ="#id.length()>3" ,unless = "#result.getCode()==200")
    public RedisDomainVO get1(@RequestParam(value = "id") String id) {
        RedisDomainVO redisDomainVO=new RedisDomainVO();
        redisDomainVO.setCode("200");
        redisDomainVO.setDiscrible("成功");
        redisDomainVO.setRedisDomainList( redisDomainService.findAll());
        return redisDomainVO;
    }
    @GetMapping("/find")
    public RedisDomainVO find() {
        RedisDomainVO redisDomainVO=new RedisDomainVO();
        redisDomainVO.setCode("200");
        redisDomainVO.setDiscrible("成功");
        redisDomainVO.setRedisDomainList( redisDomainService.findAll());
        return redisDomainVO;
    }
}
