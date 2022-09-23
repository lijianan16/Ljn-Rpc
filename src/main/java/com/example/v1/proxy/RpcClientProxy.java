package com.example.v1.proxy;



import com.example.v1.client.RpcClient;
import com.example.v1.core.RpcRequest;
import com.example.v1.core.RpcResponse;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author li
 * @Date 9/19/22 8:47 AM
 * @Version 1.0
 * 描述 ：rpc客户端动态代理
 * 名称：RpcClientProxy
 */
public class RpcClientProxy implements InvocationHandler {

    private String host;
    private int port;

    public RpcClientProxy(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @SuppressWarnings("unchecked")
    public <T> T getProxy(Class<T> clazz) {
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class<?>[]{clazz}, this);
    }

    //增强代理方法的类
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        RpcRequest rpcRequest = RpcRequest.builder()
                .interfaceName(method.getDeclaringClass().getName())
                .methodName(method.getName())
                .parameters(args)
                .paramTypes(method.getParameterTypes())
                .build();
        System.out.println("request"+rpcRequest);
        RpcClient rpcClient = new RpcClient();
        return ((RpcResponse)rpcClient.sendRequest(rpcRequest,host,port)).getData();
    }
}
