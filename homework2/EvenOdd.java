package org.levelup.homework2;

import java.util.Scanner;

//является ли целое число записанное в переменную n, чётным либо нечётным
public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        if (n==0){
            System.out.println("zero is zero");
        }else if (n%2==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
