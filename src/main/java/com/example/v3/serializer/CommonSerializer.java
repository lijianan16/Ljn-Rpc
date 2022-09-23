package com.example.v3.serializer;

/**
 * @Author li
 * @Date 9/23/22 9:40 AM
 * @Version 1.0
 * 描述 ：
 * 名称：CommonSerializer
 */
public interface CommonSerializer {
    byte[] serialize(Object obj);

    Object deserialize(byte[] bytes, Class<?> clazz);

    int getCode();

    static CommonSerializer getByCode(int code) {
        switch (code) {
            case 1:
                return new JsonSerializer();
            default:
                return null;
        }
    }

}
