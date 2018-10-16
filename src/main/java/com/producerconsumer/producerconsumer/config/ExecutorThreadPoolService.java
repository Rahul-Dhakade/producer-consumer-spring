package com.producerconsumer.producerconsumer.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
public class ExecutorThreadPoolService {

    private static int THREADS_MULTIPLE_PER_CORE = 2;

    @Bean(name = "executorThreadPoolService")
    public ExecutorService executorThreadPoolService(){
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * THREADS_MULTIPLE_PER_CORE);
        return executorService;
    }

}
