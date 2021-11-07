package com.galeeva.homeworkIfElse;

/*Даны два прямоугольных треугольника. Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
        Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
        Для этого понадобится написать 2 функции.
        Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
        Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
        Учитывать, что площадь может быть вещественным числом.*/

public class Triangle {

    public static void main(String[] args) {
        int a1 = 5;
        int b1 = 7;
        int a2 = 6;
        int b2 = 4;
        double s1 = area(a1, b1);
        double s2 = area(a2, b2);
        System.out.println(compareArea(s1, s2));
    }

    public static double area(int a, int b) {
        return 0.5 * a * b;
    }

    public static double compareArea(double s1, double s2) {
        if (s1>s2){
            return s1;
        }else {
            return s2;
        }
    }
}
