package fa.training.entities;

import java.util.Scanner;

public class Triangle implements Shapes{
    private double sideA,sideB,sideC;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public void InputTriangle(){
        double a = 0, b  =0, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input side A of Triangle:");
        a = sc.nextDouble();
        setSideA(a);
        System.out.println("Please input side B of Triangle:");
        b = sc.nextDouble();
        setSideB(b);
        System.out.println("Please input side C of Triangle:");
        c = sc.nextDouble();
        setSideC(c);
    }

    @Override
    public double getPerimetter() {
        return getSideA()+getSideB()+getSideC();
    }

    @Override
    public double getArea() {
        return Math.sqrt(getPerimetter()*(getPerimetter() - getSideA())*
                (getPerimetter()-getSideB())*(getPerimetter()-getSideC()));
    }

    @Override
    public void printResult() {
        System.out.println("-----Triangle-----");
        System.out.println("Side A:" + getSideA());
        System.out.println("Side B:" + getSideB());
        System.out.println("Side C:" + getSideC());
        System.out.println("Area:" + getArea());
        System.out.println("Perimeter:" + getPerimetter());
    }
}
