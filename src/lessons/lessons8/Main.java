package lessons.lessons8;

import java.util.Scanner;

public class Main {

    /*
    План занятия
    1) Практика
    2) Логические операторы
    3) switch case

     */

    /*
    Теория
    Пример работы условных выраений:
            while (true){      Цикл, принимает логическое выражение для своей работы

        }

        if(true){        Условный оператор принимает логическое выражение для своей работы

        }

        printOut(12, 10);    Аналогия для логического выражения
        int a = 12;

    while(a > 10){                      a > 10 = true
      System.out.println("True");
    }
     */

    /*
    Заметки
    Число без точки воспринимается как целое, а с точкой как вещественное(дробное) - int и double
    boolean(логический тип) - примитивный тип, который принимает всего два значение: true или false: явно или неявно управляет условными
    операторами и циклами. Он занимает всего один бит.
    bool или boolean во всех языках программирования относится к логическим выражениям. Это отсылка к булевой алгебре, которая
    названа по имени ученого сформировавшего ее понятия.
    static - принадлежащий классу
     */

    boolean isFlag = false;                               // Создание логической переменной
    static Scanner sc = new Scanner(System.in);      // Создание потока ввода

    public static void main(String[] args) {         // Главный метод
//        int a = sc.nextInt();       // Вводим переменные
//        int b = sc.nextInt();
//
//        if(a>= 10 && b < 5){       // Условие достижения true
//            System.out.println("Попали в диапазон");
//        }
//        else {                   // Противный случай
//            System.out.println("Не попали в диапазон");
//        }
//               //          Логическое выражение
//        System.out.println(a>= 10 && b < 5);
//
//        if(a == 10  b > 15){                 // Новый блок if
//            System.out.println(a == 10  b > 15);  // Вывод логического выражения
//        }
//        else  {                                     // В противном случае
//            System.out.println(a == 10 || b > 15);     // Вывод логического выражения
//        }
//
//        if(a> 10){                                 // Еще один блок if
//            System.out.println("a > 10");           // Вывод ответа
//        }
//        else if(b< 5){                            // Дополнительные случаи
//            System.out.println("b<5");
//        }
//        else if(a < 3){
//            System.out.println("a<3");
//        }
//
//
//        switch (a){       // Открываем блок switch(переключатель) и принимаем переменную состояния которой будем проверять
//
//            case 5:                                     // case - одно состояние
//                System.out.println("a = 5 из switch");
//                break;                                 // Завершаем обработку состояния
//            case 6:
//                System.out.println("a = 6 из switch");
//                break;
//            case 7:
//                System.out.println("a = 7 из switch");
//                break;
//            case 8:
//                System.out.println("a = 8 из switch");
//                break;
//
//            default:                                             // Реакция, если не одно состояние не было обработано
//                System.out.println("Значение не опознано");
//        }

//        int[] arr = new int[10];           Пример exit code с ошибкой
//
//        System.out.println(arr[11]);
//
//        Calculator calculator = new Calculator(); // По умолчанию у каждого класса есть пустой конструктор. Создаем объект, чтобы вызвать метод
//
//        calculator.starCalculations(); // Вызываем метод. Выход прекращает исполнение программы, поэтому нужно закомментировать, если дальше что-то нужно

        //Calculator.starCalculations(); Ошибка. Потому что методы нестатические. К ним можно получить доступ только через объект

        Game game = new Game();

        int i = 0;
        while (i < 10) {
            game.randomGame();
            i++;
        }

        game.singleGame();

    }
}