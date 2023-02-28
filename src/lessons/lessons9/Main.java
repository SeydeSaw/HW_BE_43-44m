package lessons.lessons9;

import java.util.Scanner;

public class Main {

    static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
//----создаем объект и выводим класс Example:
        Example example = new Example();
        example.printHello();
//-----

//задача: 1. Разработать метод в классе Solver для решения линейного уравнения
//-----Решаем уравнение: 2x = 10
        Solver solver = new Solver();
        System.out.println("Korenj: " + solver.linearEquation(2,10));
//----------
//задача 2. решение квадратного уравнения:
// ax^2 + bx + c = 0;
// D = b^2 - 4ac;

        System.out.println("Введите первый параметр: ");
        int a = scanner.nextInt();
        System.out.println("Введите второй параметр: ");
        int b = scanner.nextInt();
        System.out.println("Введите третий параметр: ");
        int c = scanner.nextInt();

        if(solver.isRoots(solver.findDiscriminant(a, b, c))){
            if(solver.isTwoRoots(solver.findDiscriminant(a, b, c))){
                double[] arr = solver.doubleRoot(a, b, solver.findDiscriminant(a, b,c));
                System.out.println("Pervqi korenj: " + arr[0]);
                System.out.println("Vtoroi korenj: " + arr[1]);
            }
            else {
                System.out.println("Odin korenj: " + solver.SingleRoot(a, b, solver.findDiscriminant(a, b, c)));
            }

        }
        else {
            System.out.println("Kornej net");
        }

    }


}
