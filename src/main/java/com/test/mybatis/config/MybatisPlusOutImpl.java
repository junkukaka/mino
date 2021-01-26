package com.test.mybatis.config;


import org.apache.ibatis.logging.Log;

public class MybatisPlusOutImpl implements Log {
    public MybatisPlusOutImpl(String clazz) {
        System.out.println("MybatisPlusOutImpl::"+clazz);
    }

    public boolean isDebugEnabled() {
        return true;
    }

    public boolean isTraceEnabled() {
        return true;
    }

    public void error(String s, Throwable e) {
        System.err.println(s);
        e.printStackTrace(System.err);
    }

    public void error(String s) {
        System.err.println("MybatisPlusOutImpl::"+s);
    }

    public void debug(String s) {
        System.out.println("MybatisPlusOutImpl::"+s);
    }

    public void trace(String s) {
        System.out.println("MybatisPlusOutImpl::"+s);
    }

    public void warn(String s) {
        System.out.println("MybatisPlusOutImpl::"+s);
    }

}
