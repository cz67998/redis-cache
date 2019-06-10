package com.example.rediscache.domain;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/6/10
 * Time:10:15
 **/
@Data
public class RedisDo implements Serializable {

    private static final long serialVersionUID = 1780731002220192639L;
    private int id;
    private String name;
    private String age;
    private Date time;
}
