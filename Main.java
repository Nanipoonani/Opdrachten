package Hoofdstuk8.Opdracht1;

import org.w3c.dom.css.Rect;

import javax.swing.text.Position;

public class Main {
    // 1. Gegevens - Data
    // 2. Methode - Functionele informatie - Logic

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        // Rectangle rectangle >> Declaratie / Declaration
        // = initialisatie (1ste assignatie) / Assignment (initialisation)
        // new Rectangle() >> Instantiatie / Instantiation >> making an instance

        rectangle.width = 10;
        rectangle.height = 25;

        rectangle.protectedVariable = 10;
        rectangle.packageDefaultVariable = 25;

        Rectangle rectangle2 = new Rectangle();
        rectangle2.height = 2;

        System.out.println(rectangle.height);
        System.out.println(rectangle2.height);

        Rectangle.staticVariable = 21;
        Rectangle.staticVariable = 210;

        System.out.println(Rectangle.staticVariable);
        rectangle.aMethod(); // Blocking method call (Next line will only be executed, when this line is completely finished executing!!)
        Rectangle.staticMethod();

        System.out.println("Middle of program");

        int i = rectangle.returningMethod("World", 10, rectangle);
        System.out.println(i);


        int omtrek = rectangle.calculateOmtrek(10, 25);
        System.out.println(omtrek);

        rectangle.printOmtrek(10, 25);

        int j = rectangle.position(25, 25);
        System.out.println(j);

        int f = rectangle.grow(1);
        System.out.println(f);

        int n = rectangle.getArea(23);
        System.out.println(f);


    }
}