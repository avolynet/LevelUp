package org.levelup.homework5;

import org.levelup.lesson4.Point;
import org.levelup.lesson5.Triangle;

public class IsoscelesTriangle extends Triangle {

    //равнобедренный треугольник

    public IsoscelesTriangle(Point A, Point B, Point C){
        super(A,B,C);

    }

    private double a=points[0].calculatedistance(points[1]);
    private double c = a;
    private double b=points[0].calculatedistance(points[2]);
    private double S;

    @Override
    public  double calculateSquare(){
        double p = (a + c + b) / 2;
        S=Math.sqrt(p * (p-a) * (p-c) * (p-b));
        return S;
    }

    public double getA() {
        return a;
    }

    public double getC() {
        return c;
    }
}
