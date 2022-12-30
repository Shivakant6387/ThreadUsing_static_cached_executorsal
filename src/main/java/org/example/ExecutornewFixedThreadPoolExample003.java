package org.example;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
 class Threadimpl implements Runnable {
    public void run() {
        try {
            Long num = (long) (Math.random() * 30);
            System.out.println("Thread Name: " + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(num);
            System.out.println("after sleep Thread Name: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
    public class ExecutornewFixedThreadPoolExample003 {
    public static void main(String[] args) throws InterruptedException{
        ExecutorService excr = Executors.newFixedThreadPool(5);
        ThreadPoolExecutor mypool = (ThreadPoolExecutor) excr;
        System.out.println("size of mypool: " + mypool.getPoolSize());
        excr.submit(new Threadimpl());
        excr.shutdown();
    }
}
