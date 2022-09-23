package com.example.v3.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author li
 * @Date 9/23/22 9:52 AM
 * @Version 1.0
 * 描述 ：
 * 名称：SerializerCode
 */
@AllArgsConstructor
@Getter
public enum SerializerCode {

    KRYO(0),
    JSON(1),
    HESSIAN(2),
    PROTOBUF(3);

    private final int code;

}