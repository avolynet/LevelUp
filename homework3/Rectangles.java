package org.levelup.homework3;

import org.levelup.lesson4.Point;

public class Rectangles extends Point {

    //класса прямоугольников со сторонами, параллельными осям координат.
    int x1; // х верхней левой точки
    int y1; // y верхней левой точки
    int a; // сторона а - параллельна абсциссе
    int b; // сторона b - параллельная ординате
    Point [] points;
    Point Point1;
    Point Point2;
    Point Point3;
    Point Point4;

    /*public Rectangles (int x1, int y1, int a, int b){
    this.x1=x1;
    this.y1=y1;
    this.a=a;
    this.b=b;
    }*/

    public Rectangles(int x1, int y1, int a, int b){
        this.Point1= new Point(x1,y1);
        //super(x1,y1);
        this.a=a;
        this.b=b;
        this.Point2= new Point((x1+a),y1);
        this.Point3= new Point ((x1+a),(y1-b));
        this.Point4= new Point(x1, (y1-b));
        this.points=new Point[]{Point1,Point2,Point3,Point4};

    }
    //Перемещения прямоугольников на плоскости, изменение размеров
   int aa,bb;

    public Point[] moveRectangleX(int aa, int bb){

        this.aa =aa;
        this.bb =bb;
        x1=x1+this.aa;
        y1=y1+this.bb;
        Point1=new Point(x1,y1);
        this.Point2= new Point((x1+a),y1);
        this.Point3= new Point ((x1+a),(y1-b));
        this.Point4= new Point(x1, (y1-b));
        return points;
    }

   /* public int moveRectangleY(int bb){
        //this.aa =aa;
        this.bb =bb;
        //x1=x1+aa;
        y1=y1+this.bb;
        return y1;
    }*/
    //изменение размеров прямоугольника
    int a1,b1;

 /* Не понял как изменить объект, если результатом метода у меня новые параметры объекта выходят.

  public int changeRectangle(Rectangles r1, int a1, int b1){

        this.a1 =a1;
        this.b1 =b1;
        r1.a = a+this.a1;
        r1.b = b+this.b1;

    }*/


    public int changeRectangleX(int a1){ //по оси х
        this.a1 =a1;
        a=a+this.a1;
        return a;
    }

    public int changeRectangleY(int b1){ // по оси у
        this.b1 =b1;
        b=b+this.b1;
        return b;
    }


    //проверка пересечения двух прямоугольников

    public void rectanglesIntersect(Rectangles r1, Rectangles r2) {

        boolean R1LeftOfR2 = (r1.x1+r1.a) < r2.x1;// первый левее
        boolean R1RightOfR2 = r1.x1 > (r2.x1+r2.a);//первый правее
        boolean R1AboveR2 = (r1.y1-r1.b) > r2.y1;// первый выше
        boolean R1BelowR2 = r1.y1 < (r2.y1-r2.b);// первый ниже

        if (R1LeftOfR2 || R1RightOfR2 || R1AboveR2 || R1BelowR2 ){
            System.out.println("don't intersect");
        }else{
            System.out.println("rectangles intersect");
        }

    }
}
