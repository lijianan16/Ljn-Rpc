package com.example.v3.client;

import com.example.v1.common.HelloObject;
import com.example.v1.service.HelloService;
import com.example.v3.proxy.RpcClientProxy;

/**
 * @Author li
 * @Date 9/23/22 10:39 AM
 * @Version 1.0
 * 描述 ：
 * 名称：NettyTestClient
 */
public class NettyTestClient {

    public static void main(String[] args) {
        RpcClient client = new NettyClient("127.0.0.1",9999);
        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);//这里构造器传入client为了方便以后扩展，并且用于
        //invoke方法增增
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        HelloObject helloObject = new HelloObject(12,"this is message");
        String res = helloService.hello(helloObject);
        System.out.println(res);
    }
}
