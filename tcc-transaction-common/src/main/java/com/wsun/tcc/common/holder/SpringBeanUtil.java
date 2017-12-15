package com.wsun.tcc.common.holder;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBeanUtil implements ApplicationContextAware {
    private final static SpringBeanUtil SPRING_BEAN_UTIL = new SpringBeanUtil();


    public static SpringBeanUtil getInstance() {
        return SPRING_BEAN_UTIL;
    }




    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }


    private SpringBeanUtil() {

    }
}
