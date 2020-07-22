package org.levelup.homework2;

import java.util.Scanner;

public class FiftyFiveElements {
    //Программа выводящая на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 …

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input 55");
        short n = scanner.nextShort();
        short i =1;
        while (i<2*n) {
            System.out.print(i +" ");
            i+=2;
        }
    }
}
