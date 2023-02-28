package lessons.lessons3;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner((System.in));

    public static void main(String[] args) {


        Car car = new Car(20000,220, "Audi", (short)5);

        //вызываем процедуру
        car.printOut();

        //вызываем функцию
        System.out.println(car.print());

        //создаем переменную типа String и присваиваем ей значение полей объекта при помощи функции print:
        // получаем значение полей в строку
        String str = car.print();

        // добавляем строку к полям объекта
        str = str + " прибавляем что нам необходимо ";

        //выводим новую строку
        System.out.println(str);




        /*
    Для консольного ввода в Java существует класс Scanner
    Чтобы ввести данные необходимо создать объект класса Scanner:
    Scanner scanner = new Scanner(System.in);

         */


    /*
        //объявляем переменную( деклорация переменной)
        int a ;

        //создать объект для ввода:
        //Scanner scanner = new Scanner((System.in));

        System.out.println("Введите значение типа int: ");

        //считываем переменную о введении значения(инициализация):
        a = scanner.nextInt();

        //выводим введенную переменную на консоль:
        System.out.println("Вы ввели: " + a);

        //Scanner scanner = new Scanner((System.in));
        double b ;
        System.out.println("Введите значение типа double: ");
        b = scanner.nextDouble();
        System.out.println("Вы ввели: " + b);

        //Scanner scanner = new Scanner((System.in));
        char c;
        System.out.println("Введите значение типа Char: ");
        c = scanner.next().charAt(0);
        System.out.println("Вы ввели: " + c);

        //Scanner scanner = new Scanner((System.in));
        char c1;
        System.out.println("Введите значение типа Char: ");
        c1 = scanner.next().charAt(1);
        System.out.println("Вы ввели: " + c1);

        //Scanner scanner = new Scanner((System.in));
        //декларируем строку:
        String str1 = " ";
        System.out.println("Введите значение типа String: ");
        //считываем строку:
        str1 = scanner.next();
        //выводим строку:
        System.out.println("Вы ввели: " + str1);

        //Scanner scanner = new Scanner((System.in));
        //декларируем строку:
        String str2 = " ";
        System.out.println("Введите значение типа String: ");
        //считываем строку:
        str2 = scanner.nextLine();
        //выводим строку:
        System.out.println("Вы ввели: " + str2);
*/
        System.out.println(sum());
    }

    public static int sum(){
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        return a+b;
    }

        /*
    1) Метод(процедура), которая будет считывать значения и выводить их на консоль
    2) Метод(Функция), которая будет считывать 3 значения и возвращать их сумму
    3*)Сделать глобальную переменную static Scanner и считать два значения в метоже main, передать их в функцию,
    вычислить их разность и вывести на консоль их метода main
         */

}
