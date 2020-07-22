package org.levelup.homework2;

import java.util.Random;

public class RightNumber {

    //Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155] целое число в интервал (25;100) и сообщать результат на экран.
    public static void main(String[] args) {

        int min = 5;
        int max = 155;
        int d = max - min;

        Random randomizer = new Random();
        int n = randomizer.nextInt(d+1);
        n=n+min;
        if (n>25 && n<100){
            System.out.println("Число "+ n + " содержится в интервале (25,100)");
        } else {
            System.out.println("Число " + n +" не попало в интервал (25,100)");
        }

    }
}
