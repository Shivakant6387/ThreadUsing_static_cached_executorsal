package org.example;

import java.util.concurrent.*;

class ThreadImpl implements  Runnable{
    public void run(){
        try {
        Long num =(long)(Math.random()*30);
        System.out.println("Thread name :"+Thread.currentThread().getName());

            TimeUnit.SECONDS.sleep(num);
            System.out.println("After sleeping Thread name:"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class ExecutornewFixedThreadPoolExample002 {
    public static void main(String[] args)throws InterruptedException {
        ThreadFactory threadFactory= Executors.defaultThreadFactory();
        ExecutorService executorService=Executors.newFixedThreadPool(5,threadFactory);
        ThreadPoolExecutor myPool=(ThreadPoolExecutor)  executorService;
        System.out.println("size  of mypool"+myPool.getPoolSize());
        executorService.submit(new ThreadImpl());
        executorService.shutdown();
    }
}
