package com.cc.java;

public class App {

    public static void main(String[] args) {
  
        Child child = new Child();
        child.sayHello();
        output(child.sayHello("Parent"));
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }
    
}
