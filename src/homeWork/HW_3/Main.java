package homeWork.HW_3;
/*
    30.11.2022

    1) Метод(процедура), которая будет считывать значения и выводить их на консоль
    2) Метод(Функция), которая будет считывать 3 значения и возвращать их сумму
    3*) Сделать глобальную переменную static Scanner и считать два значения в метоже main,
    передать их в функцию, вычислить
    их разность и вывести на консоль их метода main

 */

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        // 1) Метод(процедура), которая будет считывать значения и выводить их на консоль:

        byte a;

        System.out.println("Введите  число от - 128 до 128: ");
        a = scanner.nextByte();
        System.out.println(a);

        System.out.println("Сумма = " + sum());

        System.out.println("Введите первое число: ");
        int q = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int w = scanner.nextInt();

        int e = calculateDiff(q, w);

        System.out.println("Итого: " + e);

    }

    //2) Метод(Функция), которая будет считывать 3 значения и возвращать их сумму
    public static double sum() {
        System.out.println("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.println("Введите второе число: ");
        double b = scanner.nextDouble();

        System.out.println("Введите третье число: ");
        double c = scanner.nextDouble();

        return a+b+c;
    }


    //  3*) Сделать глобальную переменную static Scanner и считать два значения в метоже main, передать их в функцию, вычислить
    //    их разность и вывести на консоль из метода main:

    static int calculateDiff(int q, int w) {
        return q - w;
    }


}
