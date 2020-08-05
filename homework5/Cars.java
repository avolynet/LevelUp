package org.levelup.homework5;

import java.util.Objects;

public class Cars {

    //Создайте класс любой сущности на выбор. Определите у нее несколько полей, конструктор с параметрами, геттеры/сеттеры
   String model;
   private int fuelconsumption;
   private int power;
   private int maxspeed;
   private int fueltankvolume;

    public Cars(String model, int fuelconsumption,int power,int maxspeed,int fueltankvolume){
       this.model=model;
       this.fuelconsumption = fuelconsumption;
       this.fueltankvolume = fueltankvolume;
       this.power=power;
       this.maxspeed = maxspeed;
    }

    //get
    public String getModel(){return model;}
    public int getFuelconsumption(){return fuelconsumption;}
    public int getPower(){return power;}
    public int getMaxspeed(){return maxspeed;}
    public int getFueltankvolume(){return fueltankvolume;}

    //set
    public void setFuelconsumption(int fuelconsumption){
        if(fuelconsumption<=0){
            System.out.println("Error");
        }else {
            this.fuelconsumption = fuelconsumption;
        }
    }
    public void setPower(int power){
        if(power<=0){
            System.out.println("Error");
        }else{
            this.power=power;
        }
    }

    public void setMaxspeed(int maxspeed){
        if (maxspeed<=0){
            System.out.println("Error");
        }else {
            this.maxspeed = maxspeed;
        }
    }

    public void setFueltankvolume(int fueltankvolume){
        if(fueltankvolume<=0){
            System.out.println("Error");
        }else {
            this.fueltankvolume = fueltankvolume;
        }
    }

    //переопределить методы equals и hasCode
    @Override

    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj==null||this.getClass() !=obj.getClass())
            return false;
        Cars simplecar = (Cars) obj;
        return fuelconsumption ==simplecar.fuelconsumption &&
        power==simplecar.power &&
        maxspeed ==simplecar.maxspeed &&
        fueltankvolume == simplecar.fueltankvolume &&
                Objects.equals(model,simplecar.model);
    }

    @Override
    public int hashCode() {
    return Objects.hash(model,fuelconsumption,power,maxspeed,fueltankvolume);
    }

    //2 задачка: отфильтровать значение: у вас есть массив объектов и на вход метода вам еще подается объект.
    // найти этот объект в массиве и удалить объект из него.
    // Удаление через присваивание элементу значения null.
    // Т.е. Если элемент в массиве, то array[index] = null.
    // все null в конец массива, а в начале существующие элементы.

    Cars[]arrayCarsN;
    Cars simplecar1;

    /*public Cars[] dEquals(Cars simplecar1){
        this.simplecar1 =simplecar1;
        Cars t;
        for(int k=0; k<arrayCarsN.length;k++){
            if (this.simplecar1.equals(arrayCarsN[k]) &&
                    (this.simplecar1.hashCode()==arrayCarsN[k].hashCode())) {
                arrayCarsN[k] = null;
            }
        }
        for (int i=0; i<arrayCarsN.length; i++){
            for (int j=arrayCarsN.length -1; j>i;j--){
                if(arrayCarsN[j-1]==null){
                t = arrayCarsN[j];
                arrayCarsN[j]=arrayCarsN[j-1];
                arrayCarsN[j-1]=t;
                }
            }
        }
        return arrayCarsN;
    }*/

    // если правильно понял, то метод на выходе должен просто выдавать единичное значение
    public boolean dEquals(Cars simplecar1){
        this.simplecar1 =simplecar1;
        if (this.equals(this.simplecar1) &&
               (this.hashCode()==this.simplecar1.hashCode())) {
            return true;
       }else{
return false;}
    }


}
