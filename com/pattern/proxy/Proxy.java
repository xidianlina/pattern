package com.pattern.proxy;

/**
 * 代理类
 */
public class Proxy implements Subject{
    // 保存一个引用，使得代理可以访问真实实体
    Subject subject;

    public Proxy(){
        subject=new RealSubject();
    }

    @Override
    public void request() {
        if(subject==null){
            subject=new RealSubject();
        }
        subject.request();
    }
}