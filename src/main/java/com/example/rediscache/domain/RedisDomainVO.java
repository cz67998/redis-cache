package com.example.rediscache.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/6/10
 * Time:10:15
 **/
@Data
public class RedisDomainVO implements Serializable {

    private static final long serialVersionUID = 7334462148674296713L;
    private String code;
    private String discrible;
    private List<RedisDo> redisDomainList;
}