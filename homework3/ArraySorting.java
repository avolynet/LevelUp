package org.levelup.homework3;

public class ArraySorting {

    //класс ArraySorting, в котором будет метод bubbleSort.
    // bubbleSort на вход принимает массив целых чисел (int),
    // на выход отдает новый массив с отсортированными по возрастанию значениями.
int [] array;
public ArraySorting(int [] NewArray) {
    array = NewArray;
}

// метод принт
public void printSort() {
    System.out.println("sorted");

}

    //метод сортировки bubbleSort
    int[] bubbleSort(){
    int i;
    int j;
    int c;

     for(i=0; i<array.length; i++){
         boolean is_sorted=true;// проверка на отсортированность массива
       for (j=array.length-1; j>i; j--){
         if (array[j-1]>array[j]){
             c=array[j-1];
             array[j-1]=array[j];
             array[j]=c;
             is_sorted=false;
         }
       }if (is_sorted) {
           printSort();
           break;
            }
        }return array;
    }
}
