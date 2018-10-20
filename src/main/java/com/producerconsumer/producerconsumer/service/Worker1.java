package com.producerconsumer.producerconsumer.service;

public class Worker1 implements Runnable {
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
