package com.pan.controller;

public class ServletUserAdd {
    private  int age;
    private  String name;
    public  void run(){
        System.out.println("run......");
    }

    public void stop(){
        System.out.println("stop...");
    }

    @Override
    public String toString() {
        return "ServletUserAdd{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
