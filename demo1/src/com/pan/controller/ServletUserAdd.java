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
}
