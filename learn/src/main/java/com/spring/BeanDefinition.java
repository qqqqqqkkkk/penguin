package com.spring;

//里面封装着一个Bean对象，这个Bean不能轻易示人，这个BeanDefinition就相当于一个bean
public class BeanDefinition {

    private Object object;//存放bean

    public BeanDefinition(Object object){
        this.object = object;
    }

    //获取Bean对象
    public Object getBean(){
        return object;
    }

}
