package org.levelup.homework3;

import java.util.Scanner;

public class Calculator {
    //класс Calculator

//калькулятор int
int result;
int calculator (int a, int b, char operation){

if (operation == '+'){
    result =a+b;
}else if (operation == '-'){
    result = a-b;
}else if (operation == '*'){
    result = a*b;
}else if (operation == '/'){
    result = a/b;
}else{
        System.out.println("операция не распознана");
    }
return result;

}
    //калькулятор long
    long resultlong;
    long calculator (long a, long b, char operation) {

        if (operation == '+') {
            resultlong = a + b;
        } else if (operation == '-') {
            resultlong = a - b;
        } else if (operation == '*') {
            resultlong = a * b;
        } else if (operation == '/') {
            resultlong = a / b;
        } else {
            System.out.println("операция не распознана");
        }
        return resultlong;
    }
    //калькулятор double
    double resultdouble;
    double calculator (double a, double b, char operation) {

        if (operation == '+') {
            resultdouble = a + b;
        } else if (operation == '-') {
            resultdouble = a - b;
        } else if (operation == '*') {
            resultdouble = a * b;
        } else if (operation == '/') {
            resultdouble = a / b;
        } else {
            System.out.println("операция не распознана");
        }
        return resultdouble;
    }
}
