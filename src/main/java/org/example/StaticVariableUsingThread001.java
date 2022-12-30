package org.example;

public class StaticVariableUsingThread001 extends Thread{
    private static int counter;
    public void run(){
        for (int i=1;i<=10;i++){
            increment();
        }
    }
    private synchronized  void increment(){
        String tName=Thread.currentThread().getName();
        System.out.println(tName);
        counter++;
    }
    public static int getCounter(){
        return counter;
    }

    public static void main(String[] args) {
    StaticVariableUsingThread001 thread001=new StaticVariableUsingThread001();
    StaticVariableUsingThread001 thread002=new StaticVariableUsingThread001();
    thread001.start();
    thread002.start();
    try{
        thread001.join(3000);
        thread002.join(3000);
    }catch (InterruptedException e){
        e.printStackTrace();
    }
        System.out.println("Counter final value :"+StaticVariableUsingThread001.getCounter());
    }
}
