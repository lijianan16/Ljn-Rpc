package com.example.v1.client;


import com.example.v1.common.HelloObject;
import com.example.v1.proxy.RpcClientProxy;
import com.example.v1.service.HelloService;

/**
 * @Author li
 * @Date 9/19/22 9:20 AM
 * @Version 1.0
 * 描述 ：测试消费者（客户端）
 * 名称：TestClient
 */
public class TestClient {
    public static void main(String[] args) {
        RpcClientProxy rpcClientProxy = new RpcClientProxy("127.0.0.1",9000);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        HelloObject helloObject = new HelloObject(12,"this is a message");
        String res = helloService.hello(helloObject);
        System.out.println(res);
    }
}
