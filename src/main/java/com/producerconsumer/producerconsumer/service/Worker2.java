package com.producerconsumer.producerconsumer.service;

import java.util.concurrent.Callable;

public class Worker2 implements Callable<String> {

    @Override
    public String call(){
        System.out.println("retun string");
        return String.valueOf(Math.random());
    }
}
