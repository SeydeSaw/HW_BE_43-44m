package lessons.lessons6;
import java.util.Random;
import java.util.Scanner;

public class Main {

    /*
    1) Создать калькулятор(+, -, *, /) в бесконечном цикле, но считать в функции
    2) Создать методы, для создания массива, заполнения его случайными числами и вывода на консоль.
    3) Метод для сортировки массива пузырьком по возрастанию и убыванию
    4) Создать метод для возведения в степень числа и *извлечения корня 3 степени из числа.

5*) Реалиовать игру "Камень, ножницы, бумага"
     */


    //создаём объект класса Random
    static Random random = new Random();

    public static void main(String[] args) {
        /*
        //способ создания и вывода на консоль массива со случайными числами.
        //нехороший способ
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " "); // Не делает переход на новую строку

        }
        */
        //___________

        System.out.println(); //переход на новую строку

        int[] arr1 = createArray(10, 16);
        System.out.println("массив до сортировки: ");
        printArray(arr1);

        arr1 = sortArr(arr1); //сортировка массива
        System.out.println("Массив после сортировки: ");
        printArray(arr1);

        Scanner scanner = new Scanner(System.in);

        while (true) {// Классический пример бесконечного цикла
            System.out.println("Введите операцию: \n" +      // Выводим варианты запросов
                    "Умножение - *\n" +
                    "Деление - /\n"  +
                    "Возведение в степень - ^\n" +
                    "Извлечение квадратного корня - s\n" +
                    "Выход - e \n");
            char ch = scanner.next().charAt(0);          // Считываем запрос
            if (ch == '*') {                  //Обрабатываем запросы
                System.out.println("Введите первое число: ");
                int i = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int i1 = scanner.nextInt();
                multiply(i, i1);
            }
            else if(ch == '/'){
                System.out.println("Введите первое число: ");
                int i = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int i1 = scanner.nextInt();
                div(i, i1);
            }
            else if(ch == '^'){
                System.out.println("Введите число: ");
                int i = scanner.nextInt();
                System.out.println("Введите степень: ");
                int i1 = scanner.nextInt();
                power(i, i1);
            }
            else if(ch == 's'){
                System.out.println("Введите первое число: ");
                int i = scanner.nextInt();
                sqrt(i);
            }

            if(ch == 'e'){     // Выходим из цикла
                break;
            }
        }


    }

    private static void sqrt(int i) {
        System.out.println("Корень: " + Math.sqrt(i));   // Извлекаем корень
    }


    private static void power(int i, int i1) {
        System.out.println("Степень: " + Math.pow(i, i1)); // Возводим в степень
    }

    private static void div(int i, int i1) {
        System.out.println("Частное: " + i/i1);
    }

    private static void multiply(int i, int i1) {
        System.out.println("Умноженные значения: " + i*i1);
    }




    //сортировка пузырьком:
    private static int[] sortArr(int[] arr) {
        int temp; //вспомогательная переменная, которая будет хранить в себе значение замененной переменной
        for (int i = 0; i < arr.length; i++) { //перебираем массив
            for (int j = 0; j < arr.length; j++) { //во втором цикле сравниваем каждый элемент со всеми элементами
                if (arr[i] < arr[j]){ // сравниваем элемент с каждым элементом, если удовлетворено условие,делаем замену
                    temp = arr[i]; // заменяем переносимое значение
                    arr[i] = arr[j]; //меняем значение
                    arr[j] = temp; //записываем запомненное значение в новую позицию
                }
            }
        }
        return arr;
    }


    //создаем метод который выводит массив на консоль
    public static void printArray(int[] arr){ // принимаем массив
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  //выводим элемент на консоль с пробелом
        }
        System.out.println(); // В конце вывода переходим на новую строку
    }


    //создаем метод для генерации случайных чисел в массиве.
    //передаем размер массива и диапазон случайных чисел.
    public static int[] createArray(int size, int bound){
        //создаем массив указанного размера:
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            //заполняем элемент массива случайным числом в указанном диапазоне:
            arr[i] = random.nextInt(bound);
        }
        return arr;
    }
}