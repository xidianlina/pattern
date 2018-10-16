package com.pattern.observer;

/**
 *具体观察者,实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题的状态相协调。
 *具体观察者角色可以保存一个指向具体主题对象的引用。
 */
public class ConcreteObserver extends Observer{
    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject,String name){
        this.subject=subject;
        this.name=name;
    }
    @Override
    public void update() {
        observerState=subject.getSubjectState();
        System.out.println("观察者" + this.getName() + "的新状态是"
                + this.getObserverState());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObserverState() {
        return observerState;
    }

    public void setObserverState(String observerState) {
        this.observerState = observerState;
    }

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
}