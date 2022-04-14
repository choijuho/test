package com.example.test.demo.util;

import java.util.LinkedList;

public class Singleton {
    static LinkedList<String> que = new LinkedList<>();


    private static Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return singleton;
    }

    public static LinkedList<String> getQue() {
        return que;
    }

    public static void addString(String s) {
        que.add(s);
    }
}
