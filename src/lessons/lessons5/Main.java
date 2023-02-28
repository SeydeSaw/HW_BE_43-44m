package lessons.lessons5;
import java.util.Scanner;

public class Main {
    /*
    1.Циклы    -     for
    2.Условные операторы      -   if


   if - условный оператор, направляющий исполнение программы по тому или иному пути в зависимости от условия.
   if(условие) {
   тело
   }
   else{
   тело
   }
   Операторы сравнения
   ==  - равно
   >   -больше
   <   -меньше
   >=  -больше либо равно
   <=  -меньше либо равно
   !=  -неравно
   $$  -и
   ||  -или
   ^ - исключающее или   xor(иксор)

   циклы - многократное повторение действий
   цикл for состоит из трёх компонентов
   for(пемененная счетчик цикла(итератор) ; условие завершения цикла ; шаг цикла)
   ++  икремент(увеличение на 1)
   --  декремент(уменьшение на 1)
     */

    public static void main(String[] args) { //главный метод, с него начинается исполнение кода. Может быть в любом классе

        //создаем сканнер:
        Scanner scanner = new Scanner(System.in);

        /*
        int c = scanner.nextInt();      //демонстрация if

        if (c < 1 || c > 5) {
            System.out.println("оценка вне диапазона");
        }

        else {

            if (c == 5) {
                System.out.println("отлично");
            } else if (c == 4) {
                System.out.println("хорошо");
            } else if (c == 3) {
                System.out.println("худовлетворительно");
            } else {
                System.out.println("плохо");
            }
        }
        */
/*
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        String str = "Hello";

        System.out.println();
        System.out.println("Длина строки: " + str.length());

        for (int i = str.length()-1; i >= 0 ; i--) {
            System.out.print(str.charAt(i) + " ");
        }

 */

        // Ничего не меняется
        int x = 10, z = 10;
        x++;
        ++z;

        //System.out.println();
        System.out.println("x: " + x + ", z: " + z);

        // Форма имеет значение
        int x1 = 10, c1 = 10;
        final int y1 = 13 - x1++;
        final int z1 = 13 - ++c1;

        System.out.println("y1: " + y1 + ", z1: " + z1);


        MyClass myClass = new MyClass(3);

        //оценивание группы:

        char ex;

        int mark = 0;

        /*
        for (; ; ) {  //Оцениваем группу. Пример бесконечного цикла
            //for (int i = 0; i < 10; i++) {
            System.out.println("Введите оценку: ");
            int c = scanner.nextInt();
            mark += c;
            System.out.println("summa ocenok: " + mark);

            if (c < 1 || c > 5) {
                System.out.println("оценка вне диапазона");
            } else {

                if (c == 5) {
                    System.out.println("отлично");
                } else if (c == 4) {
                    System.out.println("хорошо");
                } else if (c == 3) {
                    System.out.println("худовлетворительно");
                } else {
                    System.out.println("плохо");
                }
            }






            System.out.println("Выберите операцию: " +
                    "\n c - продолжить" +
                    "\n e - выход");

            ex = scanner.next().charAt(0);  //считываем нулевой символ ввода

            if (ex == 'e') {  //проверяем ввод
                break;  //выход из цикла
            }


        } */





        //цикла в цикле:
        /*for (int i = 0; i <2; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    System.out.println(i + ": " + j + ": " + k);
                //Thread.sleep(1000); // замедлить вывод
                }
            }
        }*/


        //Массивы:

        //Создание массива:
        //     тип [] переменная = new тип[размер массива];
        //     int [] arr = new int[10];

        /*
        int [] arr = new int[10]; //создаем массив
        int [] arr1 = {1, 2, 3}; //инициализация массива при декларации

        for (int i = 0; i < arr.length; i++) { //присваиваем значение элементов массива
            arr[i] = i;
        }

        System.out.println("Вывод первого массива: ");
        print(arr);

        System.out.println("Вывод второго массива: ");
        print(arr1);
        */


        double [] dArr = new double[15]; //создали массив double


    }

    //создаем универсальный метод, который будет выводить массив на консоль:
    /*
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }*/




}
