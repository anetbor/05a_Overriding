package com.cc.java;

public class Parent extends GrandParent {

    public void sayHello() {
        System.out.println("Hello from Parent!");
        
    }

    public String sayHello(String str){
        return "hello from " + str;
    }
    
}
