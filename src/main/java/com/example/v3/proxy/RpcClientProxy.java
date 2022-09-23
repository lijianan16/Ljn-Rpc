package com.example.v3.proxy;

import com.example.v1.core.RpcRequest;
import com.example.v3.client.RpcClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author li
 * @Date 9/23/22 10:26 AM
 * @Version 1.0
 * 描述 ：
 * 名称：RpcClientProxy
 */
public class RpcClientProxy implements InvocationHandler {
    private static final Logger logger = LoggerFactory.getLogger(com.example.v3.proxy.RpcClientProxy.class);
    private final com.example.v3.client.RpcClient client;

    public RpcClientProxy(RpcClient client) {
        this.client = client;
    }
    @SuppressWarnings("unchecked")
    public <T> T getProxy(Class<T> clazz) {
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class<?>[]{clazz}, this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        RpcRequest rpcRequest = new RpcRequest(method.getDeclaringClass().getName(),
                method.getName(), args, method.getParameterTypes());
        return client.sendRequest(rpcRequest);
    }
}

