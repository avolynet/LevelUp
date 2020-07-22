package org.levelup.homework3;

public class ArraySortingApp {

    //проверка вывода массива и создание объекта
    //проверка работы метода bubbleSort
    public static void main(String[] args) {
        int[] a =new int[]{1,2,3,4,5};
        int i;
        ArraySorting arr =new ArraySorting(a);
        for (i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        int[] arr1=arr.bubbleSort();
        for (i=0;i<arr1.length;i++){
            System.out.print(arr1[i] +" ");
        }

    }
}
