package com.example.test.demo.service;

import com.example.test.demo.util.Singleton;

@org.springframework.stereotype.Service
public class Service {
    private Singleton singleton;
    public String test(String v) {

        singleton.addString(v);

        String result = new String();
        for (String s : singleton.getQue()) {
            result += s;
        }

        return result;
    }
}
