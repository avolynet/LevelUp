package org.levelup.homework3;

public class ArrayUtilApp {
    // test Array util
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 7, 4, 5}; //инициализация массива
        //вывести массив
        //for (int i = 0; i < arr.length; i++) {
           // System.out.print("index: " + i + " value: " + arr[i]);
      //  }

    ArrayUtil array1 = new ArrayUtil(arr);
    //ArrayUtil array2 = new ArrayUtil(arr);
       //int min = array1.minarray();
        System.out.println("min value = " + array1.minarray() + " max value = " +array1.maxarray());

    }
}
