package homeWork.HW_6;
//    4) Создать метод для возведения в степень числа
//    и * извлечения корня 3 степени из числа.

public class Math {

    public static void main(String[] args) {
        int number = 4;
        int power = 2;
        int result = power(number,power);

    //выводим на консоль :

        System.out.println(number + " в степени " + power + " = " + result);
    }

    // Создать метод для возведения в степень числа:
    public static int power(int number, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }
}
