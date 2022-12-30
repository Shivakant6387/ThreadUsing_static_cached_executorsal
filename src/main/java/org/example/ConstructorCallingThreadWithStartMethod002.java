package org.example;
class Supers{
    Thread thread;
    public Supers(){
        thread=new Thread(){
            public void run(){
                System.out.println( Supers.this.toString());
            }
        };
    }
    public void start(){
        thread.start();
    }
    public String toString(){
        return "Hello are you here";
    }
}
public class ConstructorCallingThreadWithStartMethod002 extends Supers {
        private String name;
        public ConstructorCallingThreadWithStartMethod002(String name){
            this.name=name;
        }
        public String toString(){
            return  super.toString()+" "+name;
        }

    public static void main(String[] args) {
        ConstructorCallingThreadWithStartMethod002 t=new ConstructorCallingThreadWithStartMethod002("Amrita");
        t.start();
    }
}
