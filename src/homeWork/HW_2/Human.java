package homeWork.HW_2;

public class Human {

    private String name;
    private int age;
    private double growth;

    public Human(String name, int age, double growth) {
        this.name = name;
        this.age = age;
        this.growth = growth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrowth() {
        return growth;
    }

    public void setGrowth(double growth) {
        this.growth = growth;
    }

    public void printOut(){
        System.out.println("name = " + name + " age = " + age + " growth = " + growth);
    }

}
