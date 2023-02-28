package lessons.lessons2;


public class Main {
    /*
    Файл с расширением java, то этот файл содержит java-код.
    Файл с расширением class, такой файд содержит скомпилированный java код - байт
    код(код для jvm)
    IDE - автоматически собирает проект.
    Если мы пишем в блокноте, то проект необходимо собирать вручную.
    Название файла должно совпадать с названием класса в файле.
    Java всегда состоит из классов
    Java классы после компиляции имеют расширение class. Это значит, что фалй переведен в байт-код
    Проект - Логически связанная между собой сущность для программы(набор папок, файлов, ресурсов и т.д.)
    Пакет  - логически связанный между собой набор данных
    Класс  - тип, представляет из себя объект реального мира

    Метод  - подпрограмма(часть кода, которая может вызываться многократно), существует понятие функции и процедуры
    Функция - подпрограмма, которая возвращает значение в точку вызова, а процедура - подпрограмма, которая выполняет
    какие-то действия.
    В Java оба вида подпрограмм называются методами, чтобы определить является ли метод функцией или процедурой,
    необходимо посмотреть на его сигнатуру:
     модификатор доступа    модификатор принадлежности   определитель    название         аргументы
          public                    static                  void            main      (String[] args) (сигнатура)

     void  - процедура
     что-либо другое - функция, должна иметь в теле метода слова return и значение
     {} - тело метода.

    ДЗ
    1) Создать процедуру
    2) Создать функцию.
    3) Создать класс
    4*) Добавить геттеры и сеттеры, продемонстрировать их работу
    5**) Добавить в класс функцию для вывода свойств класса. Вызвать ее в методе main


     */





    public static void main(String[] args) {
        print(10, 15);
        print(13, 17);

        printDouble(12.3, 2.5);

        System.out.println(sum(12, 5));

        System.out.println(sub(20, 15));

        Car car = new Car(10000, 200, "Audi");
        System.out.println("price = " + car.getPrice() + " speed = " + car.getSpeed() + " brand = " + car.getBrand());
        car.setPrice(15000);
        System.out.println("price = " + car.getPrice() + " speed = " + car.getSpeed() + " brand = " + car.getBrand());

        car.printOut();

        Car car1 = new Car(20000, 220, "BMW");
        car1.printOut();

    }

    static void print(int a, int b){
        System.out.println("a = " + a + " b = " + b);
    }

    static void printDouble(double a, double b){
        System.out.println("a = " + a + " b = " + b);

    }

    static int sum(int a, int b){
        return a+b;
    }

    static int sub(int a, int b){
        return a-b;
    }

}