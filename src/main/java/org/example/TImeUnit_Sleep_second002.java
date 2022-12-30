package org.example;

import java.util.concurrent.TimeUnit;

public class TImeUnit_Sleep_second002 {
    public static void main(String[] args) {
        long timeToSleep=10L;
        TimeUnit timeUnit=TimeUnit.SECONDS;
        try{
            System.out.println("Going to sleep for"+timeToSleep+"Seconds");
            timeUnit.sleep(timeToSleep);
            System.out.println("Sleep for "+timeToSleep+"seconds");
        }catch (InterruptedException e){
            System.out.println("There is throw Interruption Exception"+e);
        }
    }
}
