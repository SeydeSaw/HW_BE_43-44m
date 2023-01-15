package HW_4;

/*
    01.12.2022

    1) Работа со String
    2) Продемонстировать явное и неявное приведение типов
    3) Показать переполнение
    4) Показать работу с методами и классами
    5*) Сделать реверс строки

 */

public class Main {


    public static String reverse(String str1) {
        return new StringBuilder(str1).reverse().toString();
    }

    public static void main(String[] args) {

        //1) Работа со String:

        String str;
        str = "Работа";
        str += " со";
        str += " S";
        str += "t";
        str += "r";
        str += "i";
        str += "n";
        str += "g";

        str = "  '~*. " + str + " .*~'  ";
        System.out.println(str);

        String subStr = str.substring(7, 23);
        System.out.println(subStr);


        //2) Продемонстировать явное и неявное приведение типов:

        //явное приведение:
        byte b;
        double d;
        d = 77.7;
        b = (byte) d;
        System.out.println(b);

        //неявное приведение:
        b = -120;
        d = b;
        System.out.println(d);

        //3) Показать переполнение:

        long l = 5000000000000000000L + 5000000000000000000L;
        System.out.println(l);


        //4*) Показать работу с методами и классами:
        // Не совсем уверена, что правильно поняла задание. Сделала, как поняла :)

        Schitalochka schitalochka = new Schitalochka("1, ","2, ", "3, ","4, ","5, ",
                "я иду искать.");

        schitalochka.printOut();


        //5**) Сделать реверс строки:

        String str1 = "! хындохыв маВ хишороХ";

        str1 = reverse(str1);

        System.out.println("Готово: " + str1);

    }

}
