package com.pattern.prototype;

/**
 * 原型模式客户端
 */
public class PrototypeClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a=new Resume("daniao");
        a.setPersonInfo("male",29);
        a.setWorkExperience("1998-2000","xx company");
        Resume b= (Resume) a.clone();
        b.setWorkExperience("2018-2020","yy company");
        Resume c= (Resume) a.clone();
        c.setWorkExperience("2000-2005","zz company");
        a.display();
        b.display();
        c.display();
    }
}