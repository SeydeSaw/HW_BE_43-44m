package lessons.lessons7;

public class Utils {

    //поля класса:
    public int[] arr;
    public int count;
    public int[] sub;

    //конструктор, в который принимаем массив
    public Utils(int[] arr) {
        //присваиваем массиву, переданный массив
        this.arr = arr;
    }


    //создаем метод, который возвращает и принимает массив типа int
    public int[] sort(int[] arr) {
        //создаем временную переменную для хранения числа при его перемещении:
        int temp;
        //создаем 2 цикла для перебора всего массива в каждом из них:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                //сравниваем каждый элемент со всеми элементами и меняем их местами, если достигнуто условие:
                if (arr[i] > arr[j]) {
                    //записываем во временную переменную перемещаемое значение:
                    temp = arr[i];
                    //записываем в позицию новое значение перемещаемого значение:
                    arr[i] = arr[j];
                    //записываем в позицию перемещенного значения запомненную переменную:
                    arr[j] = temp;
                }
            }
        }
        //возвращаем отсортированный массив:
        return arr;
    }


    //выводим массив:
    public void arrayOut(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        //переход на новую строку:
        System.out.println("\n");
    }

    public void defineLength(){
        for (int i = 0; i < arr.length; i++) {
            //проверяем кратно ли число 3
            if(arr[i] % 3 == 0 && arr[i] != 0){
                System.out.println("элемент кратный 3: " + arr[i]);
                count++; //если число кратно 3увеличиваем счетчик
                System.out.println("счетчик, определяющий размер подмассива: " + count);
            }
        }
        //создаем массив с опеределенным выше количеством элементов
        sub = new int[count];
    }

    public void fillArray(){
        count= 0;
        //проходим массив и добавляем числа кратные 3 в подмассив:
        for (int i = 0; i < arr.length; i++) {
            //проверяем кратно ли число 3:
            if(arr[i] % 3 == 0 && arr[i] != 0){
                //добавляем эелемен:
                sub[count] = arr[i];
                System.out.println("добавленный элемент: " + sub[count]);
                //увеличиваем индекс:
                count++;
            }
        }
    }


    public double average(){
        //переменная, суммирующая элементы массива:
        double av = 0;

        for (int i = 0; i < sub.length; i++) {
            //суммируем элементы:
            av += sub[i];
        }
        //возвращаем среднеарифметическое:
        return av/ sub.length;
    }



    //аксессоры - методы для доступа к переменным
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int[] getSub() {
        return sub;
    }

    public void setSub(int[] sub) {
        this.sub = sub;
    }
}
