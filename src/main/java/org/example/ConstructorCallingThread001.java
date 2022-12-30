package org.example;
class Super{
    public Super(){
        new Thread(){
            public void run(){
                System.out.println(Super.this.toString());
            }
        }.start();
    }
    public String toString(){
        return "hello";
    }
}

public class ConstructorCallingThread001 extends Super{
    private  String name;
    public ConstructorCallingThread001(String name){
        this.name=name;

    }
    public String toString(){
        return super.toString()+" "+name;
    }

    public static void main(String[] args) {
        new ConstructorCallingThread001("Sakshi");
    }
}
