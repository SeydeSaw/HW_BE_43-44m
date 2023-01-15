package HW_6;
//    2) Создать методы, для создания массива,
//    заполнения его случайными числами и вывода на консоль.
//    3) Метод для сортировки массива пузырьком по возрастанию и убыванию


import java.util.Random;

public class ArrayWorking {
    static Random random = new Random();

    public static void main(String[] args) {

        // Создаем массив, задаём параметры:
        int[] arr = createArray(5, 10);
        //выводим на консоль задачу 2:
        System.out.println("массив до сортировки: ");
        printArray(arr);


        //выводим на консоль задачу 3:
        arr = sortArr(arr); //сортировка массива по возрастанию
        System.out.println("Массив после сортировки по возрастанию: ");
        printArray(arr);

        arr = sortArr2(arr); //сортировка массива по убыванию
        System.out.println("Массив после сортировки по убыванию: ");
        printArray(arr);


    }

    //    2) Создать методы, для создания массива,
    //    заполнения его случайными числами и вывода на консоль.

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

    //создаем метод который выводит массив на консоль
    public static void printArray(int[] arr){ // принимаем массив
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  //выводим элемент на консоль с пробелом
        }
        System.out.println(); // В конце вывода переходим на новую строку
    }


    //    3) Метод для сортировки массива пузырьком по возрастанию и убыванию

    //сортировка пузырьком по возрастанию :
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

    //сортировка пузырьком по убыванию:
    private static int[] sortArr2(int[] arr) {
        int temp; //вспомогательная переменная, которая будет хранить в себе значение замененной переменной
        for (int i = 0; i < arr.length; i++) { //перебираем массив
            for (int j = 0; j < arr.length; j++) { //во втором цикле сравниваем каждый элемент со всеми элементами
                if (arr[i] > arr[j]){ // сравниваем элемент с каждым элементом, если удовлетворено условие,делаем замену
                    temp = arr[i]; // заменяем переносимое значение
                    arr[i] = arr[j]; //меняем значение
                    arr[j] = temp; //записываем запомненное значение в новую позицию
                }
            }
        }
        return arr;
    }





}
