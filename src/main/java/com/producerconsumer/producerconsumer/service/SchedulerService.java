package com.producerconsumer.producerconsumer.service;

import com.producerconsumer.producerconsumer.config.ExecutorThreadPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService {

    @Autowired
    private ExecutorThreadPoolService executorThreadPoolService;


    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Scheduled(fixedDelay = 5000)
    public void queueConsumer(){
        threadPoolTaskExecutor.execute(new Worker1());
    }

    @Scheduled(fixedDelay = 8000)
    public void queueProducer(){
        threadPoolTaskExecutor.submit(new Worker2());
    }
}
