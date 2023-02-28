package lessons.lessons3;

public class Car {
    private int price;       //Поля
    private double speed;
    private String brand;
    private short age;

    //Создаём конструктор:

    public Car(int price, double speed, String brand, short age) {
        this.price = price;
        this.speed = speed;
        this.brand = brand;
        this.age = age;
    }

    //Создаём аксессоры (геттеры и сеттеры):

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    // Функция для вывода полей:
    public String print(){
        return  "price: " + price + " speed: " + speed + " brand: " + brand + " age: " + age;
    }

    //Процедура для вывода полей:
    public  void printOut(){
        System.out.println("price: " + price + " speed: " + speed + " brand: " + brand + " age: " + age);
    }




}

