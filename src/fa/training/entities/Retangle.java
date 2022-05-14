package fa.training.entities;

import java.util.Scanner;

public class Retangle implements Shapes{
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Retangle() {

    }

    public void InputRetangle(){
        double width = 0, length  =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input side width of Retangle:");
        width = sc.nextDouble();
        setWidth(width);
        System.out.println("Please input side length of Retangle:");
        length = sc.nextDouble();
        setLength(length);
    }

    @Override
    public double getPerimetter() {
        return (getWidth() + getLength())*2;
    }

    @Override
    public double getArea() {
        return getWidth()*getLength();
    }

    @Override
    public void printResult() {
        System.out.println("-----Retangle-----");
        System.out.println("Width:" + getWidth());
        System.out.println("Length:" + getLength());
        System.out.println("Area:" + getArea());
        System.out.println("Perimeter:" + getPerimetter());
    }

}
