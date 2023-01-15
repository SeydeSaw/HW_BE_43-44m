package HW_6;

/*
    06.12.2022

    1) Создать калькулятор(+, -, *, /) в бесконечном цикле, но считать в функции

    5*) Реализовать игру "Камень, ножницы, бумага"

 */

import java.util.Scanner;

public class CalculatorDemo {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //1) Создать калькулятор(+, -, *, /) в бесконечном цикле, но считать в функции

        while (true){
            System.out.println("Выберите операцию: \n" +
                    "Сложение:  +  \n" +
                    "Вычетание: -  \n" +
                    "Умножение: *  \n" +
                    "Деление:   /  \n" +
                    "Выход: +   e  \n" );
            char ch = CalculatorDemo.sc.next().charAt(0);       // Работаем со статической переменной из класса Main

            switch (ch){
                case '+':
                    sum();
                    break;

                case '-':
                    sub();
                    break;

                case '*':
                    mul();
                    break;

                case '/':
                    div();
                    break;

                case 'e':
                    System.exit(0);    // Выход из программы
                    break;

            }

        }
    }
    private static void div() {
        double a = CalculatorDemo.sc.nextDouble();
        double b = CalculatorDemo.sc.nextDouble();
        System.out.println("Частное: " + a/b);

    }

    private static void mul() {
        int a = CalculatorDemo.sc.nextInt();
        int b = CalculatorDemo.sc.nextInt();
        System.out.println("Произведение: " + a*b);
    }

    private static void sub() {
        int a = CalculatorDemo.sc.nextInt();
        int b = CalculatorDemo.sc.nextInt();
        System.out.println("Разность: " + (a-b));
    }

    private static void sum() {
        int a = CalculatorDemo.sc.nextInt();
        int b = CalculatorDemo.sc.nextInt();
        System.out.println("Сумма: " + (a+b));
    }
}
