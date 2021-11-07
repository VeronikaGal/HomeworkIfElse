package com.galeeva.homeworkIfElse;

/*Даны 3 переменные:
        - operand1 (double)
        - operand2 (double)
        - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
        Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
        Протестировать функцию в main.
        Например:
        Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
        Результат: 34.5 (24.4 + 10.1)*/

public class Function {

    public static void main(String[] args) {
        double operand1 = 24.4;
        double operand2 = 10.1;
        char operation = '+';
        result(operand1, operand2, operation);
    }

    public static void result(double operand1, double operand2, char operation) {
        switch (operation) {
            case '+' -> System.out.println(operand1 + operand2);
            case '-' -> System.out.println(operand1 - operand2);
            case '*' -> System.out.println(operand1 * operand2);
            case '/' -> System.out.println(operand1 / operand2);
            case '%' -> System.out.println(operand1 % operand2);
        }
    }
}
