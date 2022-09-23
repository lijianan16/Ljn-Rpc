package com.example.v3.server;

import com.example.v1.service.HelloService;
import com.example.v1.service.Impl.HelloServiceImpl;
import com.example.v2.registry.Impl.DefaultServiceRegistry;
import com.example.v2.registry.ServiceRegistry;

/**
 * @Author li
 * @Date 9/23/22 10:36 AM
 * @Version 1.0
 * 描述 ：
 * 名称：NettyTestServer
 */
public class NettyTestServer {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        ServiceRegistry registry = new DefaultServiceRegistry();
        registry.register(helloService);
        NettyServer server = new NettyServer();
        server.start(9999);
    }
}
