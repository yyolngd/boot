package com.atguigu.config;

public class BaseConfig {

    private static final ThreadLocal<Long> threadLocal = new ThreadLocal<Long>();



    public static void setThreadLocal(Long id){
        threadLocal.set(id);
    }

    public static Long getThreadLocal() {
        return threadLocal.get();
    }
}