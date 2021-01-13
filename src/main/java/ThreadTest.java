package main.java;

public class ThreadTest {


    private void threadMethod(){
       Thread t = new Thread(new Runnable() {
           @Override
           public void run() {
               System.out.println(1);
           }
       });
       t.start();


}
