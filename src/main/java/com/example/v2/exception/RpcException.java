package com.example.v2.exception;

/**
 * @Author li
 * @Date 9/21/22 8:56 PM
 * @Version 1.0
 * 描述 ：
 * 名称：RpcException
 */
public class RpcException extends RuntimeException {
    public RpcException(RpcError error, String detail) {
        super(error.getMessage() + ": " + detail);
    }
    public RpcException(String message, Throwable cause) {
        super(message, cause);
    }
    public RpcException(com.example.v3.common.RpcError error) {
        super(error.getMessage());
    }
}
