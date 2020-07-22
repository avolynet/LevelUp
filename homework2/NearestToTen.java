package org.levelup.homework2;

import java.util.Scanner;

public class NearestToTen {

    //Создать программу, выводящую на экран ближайшее к 10 из двух положительных чисел, записанных в переменные m и n
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        double n = in.nextDouble();
        System.out.println("input m");
        double m = in.nextDouble();

        if (n<=0 || m<=0){
            System.out.println("input contains negative number");
        }else if(Math.abs(10-n)<Math.abs(10-m)){
            System.out.println("nearest to 10 is" + n);
        }else if(Math.abs(10-n)>Math.abs(10-m)) {
            System.out.println("nearest to 10 is " + m);
        }else {
            System.out.println("equal");
        }
    }
}
