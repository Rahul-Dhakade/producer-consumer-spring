package com.producerconsumer.producerconsumer.service;

import com.producerconsumer.producerconsumer.config.ExecutorThreadPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService {

    @Autowired
    private ExecutorThreadPoolService executorThreadPoolService;

    public void queueConsumer(){
        
    }

    public void queueProducer(){

    }
}
