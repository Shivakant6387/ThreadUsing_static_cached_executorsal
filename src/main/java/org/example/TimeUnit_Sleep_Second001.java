package org.example;

import java.util.concurrent.TimeUnit;

public class TimeUnit_Sleep_Second001 {
    public static void main(String[] args) {
        long timeToSleep=0L;
        TimeUnit time=TimeUnit.SECONDS;
        try{
            System.out.println("Going to sleep for"+timeToSleep+"second");
            time.sleep(timeToSleep);
            System.out.println("Sleep for "+timeToSleep+"Seconds");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
