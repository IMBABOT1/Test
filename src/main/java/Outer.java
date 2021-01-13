package main.java;

public class Outer {

    public  class Inner{
        public int x;

        public Inner(int x){
            this.x = x;
        }

        public void method(){
            System.out.println("method");
            y = 10;
            method1();
        }

    }


    public static void main(String[] args) {
        Outer.Inner inner = new Outer(1).new Inner(1);
    }

    public int y;

    public Outer(int y){
        this.y = y;
    }

    public void method1(){
        System.out.println("method");
    }
}
