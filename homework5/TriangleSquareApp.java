package org.levelup.homework5;

//3 задачка
// метод принимает массив Triangle и находит треугольник с максимальной площадью.

import org.levelup.lesson4.Point;
import org.levelup.lesson5.EquilateralTriangle;
import org.levelup.lesson5.Triangle;

public class TriangleSquareApp {
    public static void main(String[] args) {

        double abc =3* (Math.sqrt(3.0));
        Triangle Triangle1 = new IsoscelesTriangle(
                new Point(0.0,0.0),
                new Point(0.0,4.0),
                new Point(2.0,2.0)
        );
        Triangle Triangle2 = new RectangularTriangle(
                new Point(0.0,0.0),
                new Point(0.0,2.0),
                new Point(3.0,0.0)
        );

        Triangle Triangle3 = new EquilateralTriangle(
                new Point(0.0,0.0),
                new Point(3.0,abc),
                new Point(6.0,0.0)
        );

        Triangle[]triangles = {Triangle1,Triangle2,Triangle3};
        double[]Squares = new double[triangles.length];
        double Square;
        int j=0;
        double maxS =Squares[0];
        int maxSIndex=0;


        for (int i =0; i<triangles.length && j<triangles.length+1;i++){
            Squares[j] =triangles[i].calculateSquare();
                System.out.println( Squares[j]);
                j++;

        }

        for (int index =0; index<Squares.length;index++){
            if(Squares[index]>maxS){
                maxS=Squares[index];
                maxSIndex =index;
            }
        }
        System.out.println("индекс треугольника с максимальной площадью: " + maxSIndex +
                " S= " + maxS + " " + triangles[maxSIndex]);




        //System.out.println("triangle square: " + Triangle1.calculateSquare() + "class: "+
        //Triangle1.getClass());


    }
}
