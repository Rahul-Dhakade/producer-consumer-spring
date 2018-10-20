package com.producerconsumer.producerconsumer.service;

import com.producerconsumer.producerconsumer.config.ExecutorThreadPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService {

    @Autowired
    private ExecutorThreadPoolService executorThreadPoolService;


    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    public void queueConsumer(){
        
    }


    public void queueProducer(){

    }
}
