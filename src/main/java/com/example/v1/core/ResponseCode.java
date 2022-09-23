package com.example.v1.core;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author li
 * @Date 9/17/22 11:14 AM
 * @Version 1.0
 * 描述 ：方法调用的响应状态码
 * 名称：ResponseCode
 */
@AllArgsConstructor
@Getter
public enum ResponseCode {

    SUCCESS(200,"调用方法成功"),
    FAIL(500,"调用方法失败"),
    NOT_FOUND_METHOD(500,"未找到指定方法"),
    NOT_FOUND_CLASS(500,"未找到指定类");

    private final int code;
    private final String message;

}
