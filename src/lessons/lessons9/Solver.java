package lessons.lessons9;
public class Solver {
    //задача 1. Разработать метод в классе Solver для решения линейного уравнения

    public double linearEquation(double x, double a){
        return a/x;
    }

    //задача 2.

    public double findDiscriminant(double a, double b, double c){
        //return b*b - 4*a*c; //Альтернативный вариант решения
        return Math.pow(b, 2) - 4*a*c;
    }

    public boolean isRoots(double discriminant){
        if(discriminant < 0){
            return false;
        }
        else {
            return true;
        }
    }

    public boolean isTwoRoots(double discriminant){
        if(discriminant == 0){
            return false;
        }
        else {
            return true;
        }
    }

    public double SingleRoot(double a, double b, double discriminant){
        return (-b - Math.sqrt(discriminant))/(2*a);
    }

    public double[] doubleRoot(double a, double b,double discriminant){
        double[] arr = new double[2];
        arr[0] = SingleRoot(a, b, discriminant);
        arr[1] = (-b + Math.sqrt(discriminant))/(2*a);

        return arr;

    }


}