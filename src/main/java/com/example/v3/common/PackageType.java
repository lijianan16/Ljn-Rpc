package com.example.v3.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author li
 * @Date 9/23/22 9:48 AM
 * @Version 1.0
 * 描述 ：
 * 名称：PackageType
 */
@AllArgsConstructor
@Getter
public enum PackageType {

    REQUEST_PACK(0),
    RESPONSE_PACK(1);

    private final int code;

}