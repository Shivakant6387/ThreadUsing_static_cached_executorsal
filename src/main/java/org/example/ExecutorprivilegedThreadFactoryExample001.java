package org.example;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

class MyThread1 implements  Runnable{
    public void run(){
        System.out.println("Running thread concurrently");
    }
}
public class ExecutorprivilegedThreadFactoryExample001 {
    public static void main(String[] args) {
        ThreadFactory threadFactory= Executors.defaultThreadFactory();
        Thread t=threadFactory.newThread(new MyThread1());
        t.start();
    }
}
