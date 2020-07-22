package org.levelup.homework2;

public class PositiveElementsSequence {
    /*Создайте программу,
     выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….*/
    public static void main(String[] args) {
        int i;
        for (i=90; i>=0; i-=5){
            System.out.print(i+" ");
        }
    }
}
