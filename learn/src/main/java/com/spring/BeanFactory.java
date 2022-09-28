package com.spring;

import java.util.HashMap;

//这是Bean存放的房子，里面的HashMap存放Bean
public class BeanFactory {
    //用来存储Bean对象（实际是由BeanDefinition包装起来的，key是Bean的名字，value是Bean）
    private HashMap<String,BeanDefinition> hashMap = new HashMap();

    //初始化啥都不用干
    public BeanFactory(){

    }

//    通过类名获取真正的Bean
    public Object getBean(String className){
        return hashMap.get(className).getBean();
    }

    //注册Bean（让这个房子中存放着Bean）
    public void registerBean(String className,Object object){
        hashMap.put(className,new BeanDefinition(object));
    }

}
