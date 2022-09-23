package com.example.v1.common;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author li
 * @Date 9/17/22 11:06 AM
 * @Version 1.0
 * 描述 ：
 * 名称：HelloObject
 */
@Data
@AllArgsConstructor
public class HelloObject implements Serializable {

    public HelloObject(){

    }
    private Integer id;
    private String message;
}
