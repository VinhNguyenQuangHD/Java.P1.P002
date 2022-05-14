package fa.training.entities;

import java.util.Scanner;

public class Circle implements Shapes {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void InputCircle(){
        double rad = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input radius of Circle:");
        rad = sc.nextDouble();
        setRadius(rad);
    }

    @Override
    public double getPerimetter() {
        return Math.PI*getRadius()*2;
    }

    @Override
    public double getArea() {
        return Math.PI*getRadius()*getRadius();
    }

    @Override
    public void printResult() {
        System.out.println("-----Circle-----");
        System.out.println("Radius:" + getRadius());
        System.out.println("Area:" + getArea());
        System.out.println("Perimeter:" + getPerimetter());
    }
}
