package com.example.v2.server;

import com.example.v1.service.HelloService;
import com.example.v1.service.Impl.HelloServiceImpl;
import com.example.v2.registry.Impl.DefaultServiceRegistry;
import com.example.v2.registry.ServiceRegistry;

/**
 * @Author li
 * @Date 9/21/22 10:16 PM
 * @Version 1.0
 * 描述 ：
 * 名称：TestServer
 */
public class TestServer {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        ServiceRegistry serviceRegistry = new DefaultServiceRegistry();
        serviceRegistry.register(helloService);
        RpcServer rpcServer = new RpcServer(serviceRegistry);
        rpcServer.start(9000);
    }
}

