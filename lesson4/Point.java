package org.levelup.lesson4;

import java.util.Objects;

//Модификатор доступа обязательно public, поскольку конструктор всегда вызывается вне класса.
public class Point {// создаем класс объектов расширяет класс object

    public int x;// field class, class variable, field / поле класса
    public int y;
    private String name;

    public double x1;
    public double y1;

  public Point(){
       System.out.println("Constructor Point ...");
  }

    //создаем объект
    //constructor - for fields initialization - конструктор - это метод
   // в классе может быть несколько конструкторов
    public Point(int newX, int newY){ //parameters
        x=newX;
        y=newY;

    }
    public Point(double newX, double newY){
      this.x1 =newX;
      this.y1 =newY;
    }

    public Point(int x, int y, String name){
      this.x=x;
      this.y=y;
      this.name=name;

    }

    //Methods
    //<модификатор доступа>< returning value type> <method name>(<type of parameter1> <parameter1 name>) {method body}
    //void - method returns nothing (there is no result of method work)
   public void printPoint() {
        System.out.println("(" + x +", " + y +")");
    }

    //Сигнатура метода - название + параметры (важен порядок типов)
    //Перегрузка метода (перегруженный метод, overload)
    public void printPoint(boolean verbose) {
        if (verbose) {
            System.out.println("Point Coordinates (" + x + ", " + y +")");
        }else{
            printPoint();
        }
    }
//Homework
    //flip() - получить новый объект класса Point c -x и -y
    // вопрос почему public Point flip?
public Point flip(){
      int xx = (-1)*x;
      int yy = (-1)*y;
    System.out.println("new x: " + xx + " new y: "+yy);
return new Point(xx,yy);
}
    // quadrant()
    //2 | 1
    // - - -
    //3 | 4
    public int quadrant() {
        if (x>0 && y>0) {
            return 1;// если метод возвращает значение
        }else if (x<0 && y>0){
            return 2;
        }else if (x<0 && y<0){
            return 3;
        }else if (x>0 && y<0){
            return 4;
        } return 0;//- если ни одно условие не выполнено
    }

    //p1 (3,6)
    //p2 (5,8)

    //point1.calculatedistance(point1, point2);
    public double calculatedistance (Point p1, Point p2){
      double k1 = Math.pow(p1.x - p2.x, 2);
      double k2 = Math.pow(p1.y - p2.y, 2);
      return Math.sqrt(k1+k2);
    }

    //инкапсуляция
    //point1.calculatedistance(point2);
    /*public double calculatedistance (Point p2){
        double k1 = Math.pow(x - p2.x, 2);
        double k2 = Math.pow(y - p2.y, 2);
        return Math.sqrt(k1+k2);
    }*/
    public double calculatedistance (Point p2){
        double k1 = Math.pow(x1 - p2.x1, 2);
        double k2 = Math.pow(y1 - p2.y1, 2);
        return Math.sqrt(k1+k2);
    }

    public int getX(){
      return x;
 }
    public int getY(){
      return y;
}

@Override
    public boolean equals(Object o){

      if(this == o) return  true;
      if (o == null || this.getClass() !=o.getClass())
          return false;
      //if (!(o instanceof Point)) return  false;
      Point other = (Point) o; // object --> Point привели класс объектов к классу поинт
    //может произойти ClassCastException
    return x==other.x && y==other.y &&//NullPointerException
           Objects.equals(name,other.name);
            //name.equals(other.name);//NullPointerException
}

    @Override
    public int hashCode() {
      //int result = 17;
      //result = 31*result + x;
      //result = 31*result+name.hashCode();
        return Objects.hash(x,y,name);
    }
}
