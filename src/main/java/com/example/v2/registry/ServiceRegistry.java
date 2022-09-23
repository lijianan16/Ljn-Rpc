package com.example.v2.registry;

/**
 * @Author li
 * @Date 9/21/22 8:30 PM
 * @Version 1.0
 * 描述 ：
 * 名称：ServiceRegistry
 */
public interface ServiceRegistry {
    <T> void register(T service);
    Object getService(String serviceName);
}
