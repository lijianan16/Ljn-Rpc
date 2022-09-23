package com.example.v1.server;


import com.example.v1.service.HelloService;
import com.example.v1.service.Impl.HelloServiceImpl;

/**
 * @Author li
 * @Date 9/19/22 10:04 AM
 * @Version 1.0
 * 描述 ：服务端测试
 * 名称：TestServer
 */
public class TestServer {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        RpcServer rpcServer = new RpcServer();
        rpcServer.register(helloService,9000);
    }
}
