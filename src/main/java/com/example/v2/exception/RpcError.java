package com.example.v2.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author li
 * @Date 9/21/22 8:54 PM
 * @Version 1.0
 * 描述 ：
 * 名称：RpcError
 */
@AllArgsConstructor
@Getter
public enum RpcError {



    SERVICE_NOT_FOUND("找不到对应的服务"),
    SERVICE_NOT_IMPLEMENT_ANY_INTERFACE("注册的服务未实现接口");

    private final String message;



}