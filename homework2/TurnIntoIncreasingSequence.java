package org.levelup.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class TurnIntoIncreasingSequence {
/*5. В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
Создать программу, которая переставит числа в переменных таким образом,
чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.
 */
public static void main(String[] args) {
    //ввод данных
    Scanner scanner = new Scanner(System.in);
    System.out.println("input a");
    int a = scanner.nextInt();
    System.out.println("input b");
    int b = scanner.nextInt();
    System.out.println("input c");
    int c = scanner.nextInt();

    //сортировка
    int [] array = {a, b, c};

    /*for (int i = 0; i < 3; i++) {
        System.out.println(array[i]);
    }
    System.out.println(array.length);*/

    int n;//обменная переменная
        for (int i = 0; i < (array.length-1); i++){
            if (array[i] > array[i+1]){
                n=array[i];
                array[i]=array[i+1];
                array[i+1] =n;
            }
        }
    System.out.println("Исходная последовательность "+a+" "+b+" "+c+" "+"Возрастающая последовательность: " + Arrays.toString(array));
}
}
