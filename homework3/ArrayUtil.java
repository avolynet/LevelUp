package org.levelup.homework3;

public class ArrayUtil {
int[] array;

int min;
int max;
    public ArrayUtil (int []Newarray){
        array = Newarray;

    }
//класс ArrayUtil. два метода - min(int[] array) и max(int[] array).
//должен возвращать вам минимум и максимум из переданного массива.
// в метод min вы передаете массив, а в ответ вам возвращается число, которое является минимум из переданного массива.
// объявление массива


    protected int minarray(){
        min =array[0];
for (int i =1; i<array.length; i++){
  if (min > array[i]){
      min = array [i];
  }
}
return min;
}

//
    protected int maxarray(){
        max=array[0];
        for (int i =1; i<array.length; i++){
            if (array[i] > max){
                max= array [i];
            }
        }
        return max;
    }
}
