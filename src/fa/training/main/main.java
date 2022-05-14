package fa.training.main;

import fa.training.entities.Circle;
import fa.training.entities.Retangle;
import fa.training.entities.Triangle;

import javax.crypto.Cipher;

public class main {
    public static void main(String[] args){
        Retangle retangle = new Retangle();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        System.out.println("====Calculator Shape Progarmer====");
        retangle.InputRetangle();
        circle.InputCircle();
        triangle.InputTriangle();

        retangle.printResult();
        circle.printResult();
        triangle.printResult();
    }
}
