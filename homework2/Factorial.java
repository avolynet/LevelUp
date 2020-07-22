package org.levelup.homework2;

import java.util.Scanner;

public class Factorial {
    //программа, вычисляющая факториал натурального числа n, которое пользователь введёт с клавиатуры

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input natural including 0");
        int n = scanner.nextInt();
        int m =1;
        int fact =1;

        if (n<0){
            System.out.println("wrong number");
        }else {
            for (m=1;m <= n;m++) {
                    fact = m * (fact);
            }
            System.out.println("factorial " + n + "=" + fact);
        }

    }
}
