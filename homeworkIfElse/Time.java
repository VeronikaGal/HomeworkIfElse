package com.galeeva.homeworkIfElse;

/*В переменной minutes лежит число от 0 до 59.Написать функцию, которая принимает в качестве параметра значение
переменной minutes и выводит на консоль в какую четверть часа попадает это число
(в первую, вторую, третью или четвертую). Протестировать функцию в main.*/

public class Time {
    public static void main(String[] args) {
        int minutes = 59;
        quarter(minutes);
    }

    public static void quarter(int minutes) {
        if (minutes >= 0 && minutes <= 14) {
            System.out.println("It's the first quarter.");
        } else if (minutes >= 15 && minutes <= 29) {
            System.out.println("It's the second quarter.");
        } else if (minutes >= 30 && minutes <= 44) {
            System.out.println("It's the third quarter.");
        } else if (minutes >= 45 && minutes <= 59) {
            System.out.println("It's the fourth quarter.");
        }
    }
}
