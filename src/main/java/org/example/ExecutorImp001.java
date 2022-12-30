package org.example;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

class ExecutorDemo implements Executor {

    @Override
    public void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
class NewThread implements Runnable{
    public void run(){
        System.out.println("Thread executed under an executor");
    }
}
public class ExecutorImp001 {
    public static void main(String[] args) {
    ExecutorDemo executorDemo=new ExecutorDemo();
    try{
        executorDemo.execute(new NewThread());
    }catch (RejectedExecutionException |NullPointerException executor){
        System.out.println(executor);
    }
    }
}
