package org.levelup.homework5;

import org.levelup.lesson4.Point;
import org.levelup.lesson5.Triangle;

public class RectangularTriangle extends Triangle {

    //класс прямоугольных треугольников

        public RectangularTriangle(Point A, Point B, Point C){
            super(A,B,C);

        }

        private double a = points[0].calculatedistance(points[1]);
        private double c = points[1].calculatedistance(points[2]);
        private double b = points[0].calculatedistance(points[2]);
        private double S;

        @Override
        public  double calculateSquare(){
            S=a*c/2;
            return S;
        }
}
