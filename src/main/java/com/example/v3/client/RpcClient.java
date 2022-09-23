package com.example.v3.client;

import com.example.v1.core.RpcRequest;

/**
 * @Author li
 * @Date 9/23/22 9:02 AM
 * @Version 1.0
 * 描述 ：
 * 名称：RpcClient
 */
public interface RpcClient {
    Object sendRequest(RpcRequest rpcRequest);
}
