package com.pattern.prototype;

/**
 * 简历类
 */
public class Resume implements Cloneable{
    private String name;
    private String sex;
    private Integer age;
    private WorkExperience work;

    public Resume(String name){
        this.name=name;
        work=new WorkExperience();
    }
    private Resume(WorkExperience work) throws CloneNotSupportedException {
        this.work=(WorkExperience)work.clone();
    }
    public void setPersonInfo(String sex,Integer age){
        this.sex=sex;
        this.age=age;
    }
    public void setWorkExperience(String workDate,String company){
        work.setWorkDate(workDate);
        work.setCompany(company);
    }
    public void display(){
        System.out.print("name is "+name+", sex is "+sex+", age is "+age);
        System.out.println(", 工作经历:"+work.getWorkDate()+" "+work.getCompany());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Resume obj=new Resume(this.work);
        obj.name=this.name;
        obj.sex=this.sex;
        obj.age=this.age;
        return obj;
    }
}