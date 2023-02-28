package lessons.lessons8;

public class Calculator {

//1) Правильно создать сканнер - минус подхода: расход
// 2) Правильно* передать scanner в метод startCalculations


    public void starCalculations(){
        while (true){
            System.out.println("Выберите операцию: \n" +
                    "Сложение:  +  \n" +
                    "Вычетание: -  \n" +
                    "Умножение: *  \n" +
                    "Деление:   /  \n" +
                    "Выход: +   e  \n" );
            char ch = Main.sc.next().charAt(0);       // Работаем со статической переменной из класса Main



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
    private void div() {
        double a = Main.sc.nextDouble();
        double b = Main.sc.nextDouble();
        System.out.println("Частное: " + a/b);

    }

    private void mul() {
        int a = Main.sc.nextInt();
        int b = Main.sc.nextInt();
        System.out.println("Произведение: " + a*b);
    }

    private void sub() {
        int a = Main.sc.nextInt();
        int b = Main.sc.nextInt();
        System.out.println("Разность: " + (a-b));
    }

    private void sum() {
        int a = Main.sc.nextInt();
        int b = Main.sc.nextInt();
        System.out.println("Сумма: " + (a+b));
    }
}