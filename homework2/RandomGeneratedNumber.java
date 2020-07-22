package org.levelup.homework2;

import java.util.Random;

public class RandomGeneratedNumber {
    // Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру

    public static void main(String[] args) {

        int min = 100;
        int max = 1000;
        int d = max - min;

        Random randomizer = new Random();
        int n = randomizer.nextInt(d);
        n=n+min;
        /*int a = (n/100);
        int b =(n - a*100)/10;
        int c =(n-a*100-b*10);
        System.out.println("трехзначное число " + n+ " " +c+b+a );*/

        int m =n%10;
        //System.out.println(m);
        int e=n/10;
        //System.out.println(e);
        while (e>0){
            if (e%10 > m){
                m=e%10;
                //System.out.println(m);
            }
            e=e/10;
           //System.out.println(e);
       }
        System.out.println("three-digit number " + n+ " max number " + m);

    }
}
