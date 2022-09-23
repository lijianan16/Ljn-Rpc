package com.example.v1.service.Impl;


import com.example.v1.common.HelloObject;
import com.example.v1.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author li
 * @Date 9/17/22 11:07 AM
 * @Version 1.0
 * 描述 ：
 * 名称：HelloServiceImpl
 */
public class HelloServiceImpl implements HelloService {
    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);
    @Override
    public String hello(HelloObject object) {
        logger.info("接收到：{}", object.getMessage());
        return "这是掉用的返回值，id=" + object.getId();
    }

}
