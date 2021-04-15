package Hoofdstuk8.Opdracht1;

public class Rectangle {
    public int height;
    public int width;
    public int x;
    public int y;

    protected int protectedVariable;
    int packageDefaultVariable;

    public final int FINAL_VARIABLE = 10;

    public static int staticVariable = 20;

    // public/private/protected/- static abstract final void/datatype methodName(parameters) throws Exception
    public void aMethod() {
        System.out.println(x);
        System.out.println("Hello from aMethod");
        privateMethod();
    }

    private void privateMethod() {
        if (x < 100) return;
        System.out.println("Hello World from Private Method");
    }

    public static void staticMethod() {
        System.out.println("Hello from static method");
    }

    public int returningMethod(String name, int number, Rectangle rectangle) {
        String nameVar;

        System.out.println("Hello " + name);
        return number * rectangle.height;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    // Make a method to calculate the circumference
    public int calculateOmtrek(int height, int width) {
        int result = 2 * (height + width);
        // result << 2 * (10 + 25)
        return result;
    }

    public String describeRectangle() {
        String description = String.format("This rectangle is %d high and %d wide.", height, width);
        return description;
    }

    public void printOmtrek(int height, int width) {
        int omtrek = 2 * (height + width);
        System.out.println(omtrek);
    }

    public int position(int x, int y) {
        int result = (x + y);

        return result;
    }

    public int grow(int d) {
        int result = 2 * (height + width + d);
        return result;

    }

    public int getArea(int k) {
        int result = height * width;
        return result;


    }


}
