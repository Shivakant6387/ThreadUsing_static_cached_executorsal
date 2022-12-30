package org.example;

import java.util.ArrayList;

public class TimeUnitSleepMilisecond001 {
    public static void main(String[] args) {
        Long start=System.currentTimeMillis();
        ArrayList a=new ArrayList();
        for(int i=1; i<1000;i++){
            a.add(i);
        }
        Long end=System.currentTimeMillis();
        System.out.println(start+end);
    }
}
