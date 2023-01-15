package HW_5;
import java.util.Scanner;

/*
    05.12.2022

    1) Создать массивы типа: int, double и создать методы, для их вывода на консоль
    2) Сделать программу, которая будет складывать или вычитать введенные числа многократно,
    пока не будет дана команда на выход из цикла
    3) Сделать процедуру для вывода из массива чисел со значением кратным 3. Найти в другой функции их среднее
    арифметическое значение
    4) Перевернуть массив(реверсировать) и вывести из него все значения на нечетных позициях.
    5**) Создать метод, который будет применять строку и выводить из нее только гласные буквы

 */

public class Main {


    static int[] sub;
    static int count;


    public static void main(String[] args) {
        //    1) Создать массивы типа: int, double и создать методы, для их вывода на консоль

        byte[] arr = new byte[3];

        for (byte i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        System.out.println("Вывод первого массива: ");
        print(arr);


        //_________________
        //2) Сделать программу, которая будет складывать или вычитать введенные числа
        //   многократно пока не будет дана команда на выход из цикла:

        Scanner scanner = new Scanner(System.in);

        char ex;
        double sum = 0;
        for (; ; ) {

            System.out.println("Введите число: ");
            double a = scanner.nextDouble();
            sum += a;
            System.out.println("Сумма= " + sum);

            System.out.println("Выберите операцию: " +
                    "\n c - продолжить " +
                    "\n e - выход");

            ex = scanner.next().charAt(0);

            if(ex == 'e'){
                break;
            }
        }

        //__________________________
        //    3*) Сделать процедуру для вывода из массива чисел со значением кратным 3.
        //    Найти в другой функции их среднее арифметическое значение

        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.print(a[i] + " ");
        }

        System.out.println();
        fillArray(a);

        System.out.println("Среднее арифметическое: " + average());

        //    4*) Перевернуть массив(реверсировать) и
        //    вывести из него все значения на нечетных позициях.

        String[] strings = new String[6];
        strings[0] = "Один";
        strings[1] = "Два";
        strings[2] = "Три";
        strings[3] = "Четыре";
        strings[4] = "Пять";
        strings[5] = "Шесть";

        printArray(strings);
        revertArray(strings);
        printArray(strings);

        printOdd(strings);


    }


    //___________________задача 1:
    public static void print(byte[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //___________________задача 3:
    public static void fillArray(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 3 == 0 && arr1[i] != 0) {
                System.out.println("Элемент кратный трём: " + arr1[i]);
                count++;
                System.out.println("Счётчик, определяющий размер подмассива: " + count);
            }

        }
        sub = new int[count];
        count = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 3 == 0 && arr1[i] != 0) {
                sub[count] = arr1[i];
                System.out.println("Добавленный элемент: " + sub[count]);
                count++;
            }
        }
    }
    //Находим среднее арифметическое:
    public static double average(){
        double av = 0;
        for (int i = 0; i < sub.length; i++) {
            av += sub[i];
        }
        return  av/ sub.length;
    }

    //____________________Задача 4:_________________________

    private static void printArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println();
    }

    private static void revertArray(String[] strings) {
        String tmpString;
        for (int i = 0; i < strings.length / 2; i++) {
            tmpString = strings[i];
            strings[i] = strings[strings.length -1 - i ];
            strings[strings.length - 1 - i ] = tmpString;
        }
    }

    //находим все значения на нечетных позициях:
    private static void printOdd(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (i % 2 == 1){
                System.out.println(strings[i]);
            }
        }
    }


}
