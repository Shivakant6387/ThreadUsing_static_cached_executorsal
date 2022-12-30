package org.example;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread implements Runnable{
    String name;
    CountDownLatch latch;
    MyThread(CountDownLatch latch, String name){
        this.name=name;
        this.latch=latch;
        new Thread(this);
    }
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println(name+":"+i);
            latch.countDown();
        }
    }
}
public class SimpleExecutor002 {
    public static void main(String[] args) {
        CountDownLatch countDownLatch=new CountDownLatch(5);
        CountDownLatch countDownLatch2=new CountDownLatch(5);
        CountDownLatch countDownLatch3=new CountDownLatch(5);
        CountDownLatch countDownLatch4=new CountDownLatch(5);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        System.out.println("Starting");
        executorService.execute(new MyThread(countDownLatch,"A"));
        executorService.execute(new MyThread(countDownLatch2,"B"));
        executorService.execute(new MyThread(countDownLatch3,"C"));
        executorService.execute(new MyThread(countDownLatch4,"D"));
        try{
            countDownLatch.await();
            countDownLatch2.await();
            countDownLatch3.await();
            countDownLatch4.await();
        }catch (InterruptedException e){
            System.out.println(e);
        }
        executorService.shutdown();
        System.out.println("Done");

    }
}
