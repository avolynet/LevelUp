package org.levelup.homework2;

import java.util.Scanner;

public class TwentyElements {

    //Програма, выводящая на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input 1");
        int n = scanner.nextInt();
        int i;
        System.out.println("input 1");
        int m = scanner.nextInt();

        while (m<=20){
            i=2*n;
            System.out.print(i+" ");
            n=2*n;
            m++;
        }

        }
    }



