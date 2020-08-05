package org.levelup.homework5;

public class CarsApp {

    public static void main(String[] args) {

        Cars car1=new Cars("VAZ", 10, 76,140,40);
        Cars car2=new Cars("UAZ", 20, 100,130,40);
        Cars car3=new Cars("BMW", 15, 90,200,40);
        Cars car4=new Cars("GAZ", 15, 80,140,40);
        Cars car5=new Cars("MAZ", 40, 150,120,100);
        Cars car6=new Cars("MAZ", 40, 150,120,100);

        Cars[]arrayCars = new Cars[] {car1,car2,car3,car4,car5,car6};
        Cars[]arrayCars1 = new Cars[] {car5,car2,car3,car4,car5,car6};

        Cars car7 =car3;

        System.out.println(car1.getFuelconsumption());

        car1.setMaxspeed(120);

        System.out.println("new speed for car: "+car1.getMaxspeed());

        //1 задачка поиск элемента в массиве
        int j=0;
        for(int i=0; i<arrayCars.length;i++){

            if (car7.equals(arrayCars[i]) &&
                    (car7.hashCode()==arrayCars[i].hashCode())){
                System.out.println("car7 equals: " + arrayCars[i].model + " with index: " + i);
                //break;
            }else if (j>=arrayCars.length){
                j++;
                System.out.println("no matches");
                }

        }

        System.out.println("Task #2");

 //2 задачка: отфильтровать значение: у вас есть массив объектов и на вход метода вам еще подается объект.
// найти этот объект в массиве и удалить объект из него.
// Удаление через присваивание элементу значения null.
// Т.е. Если элемент в массиве, то array[index] = null
// все null в конец массива, а в начале существующие элементы.



       for (int k=0;k<arrayCars1.length;k++) {
           if (arrayCars1[k].dEquals(car7)==true){
               arrayCars1[k]=null;
           }
           System.out.println(arrayCars1[k]);
       }
        System.out.println("end null");

        Cars temp;

        for(int g=0; g<arrayCars1.length; g++){
            //boolean is_sorted=true;// проверка на отсортированность массива
            for (int h=1; h<(arrayCars1.length - g); h++){
                if (arrayCars1[h-1]==null){
                    temp=arrayCars1[h];
                    arrayCars1[h]=arrayCars1[h-1];
                    arrayCars1[h-1]=temp;
                }
            }
        }
        for(int m=0;m<arrayCars1.length;m++) {
            System.out.println(arrayCars1[m]);
        }

    }

}
