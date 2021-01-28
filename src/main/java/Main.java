package main.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private int add(int a, int b){
        return a + b;
    }

    private float add(float a, float b, float c){
        return a + b + c;
    }



    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.add(1, 2));
        System.out.println(main.add(2,3,4.5f));
    }
}


