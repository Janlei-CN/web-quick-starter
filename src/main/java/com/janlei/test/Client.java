package com.janlei.test;

import com.janlei.aop.Target;

public class Client {

    public static void main(String[] args) {
        new Target().handle();
    }
}
