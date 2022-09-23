package com.example.v1.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author li
 * @Date 9/17/22 11:11 AM
 * @Version 1.0
 * 描述 ：
 * 名称：RpcRequest
 */
@Data
@Builder
@AllArgsConstructor
public class RpcRequest implements Serializable {

    public RpcRequest() {

    }

    /**
     * 待调用接口名称
     */
    private String interfaceName;
    /**
     * 待调用方法名称
     */
    private String methodName;
    /**
     * 调用方法的参数
     */
    private Object[] parameters;
    /**
     * 调用方法的参数类型
     */
    private Class<?>[] paramTypes;
}