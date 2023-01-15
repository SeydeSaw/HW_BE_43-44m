package HW_2;
/*
    29.11.2022

    1) Создать процедуру
    2) Создать функцию.
    3) Создать класс
    4) Добавить геттеры и сеттеры, продемонстрировать их работу
    5*) Добавить в класс функцию для вывода свойств класса. Вызвать ее в методе main
 */

public class Main {
    public static void main(String[] args) {

        numb(30, 40.8);

        System.out.println(sum(40, 7.7));

        Human human = new Human("Seyde ",32, 167);
        System.out.println("name = " + human.getName() + " age = " + human.getAge() + " growth = " + human.getGrowth());

        Human human1 = new Human("Katja ",37, 172);
        human1.printOut();
        Human human2 = new Human("Anna ",25, 162);
        human2.printOut();
        Human human3 = new Human("Sveta ",57, 176);
        human3.printOut();

    }

    //1)Создать процедуру:
    static  void numb(int a, double b){
        System.out.println("num1 = " + a + " , num2 " + b);
    }
    //2)Создать функцию:
    static double sum(int a, double b){
        return a+b;
    }


}
