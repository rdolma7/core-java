package objectbasic.polymorphism;

public class CalculatorApplication {
    public static void main(String[] args) {
        int a, b;
        float c, d;
        double e, f;
        a = 5;
        b = 6;
        add(a, b);
        c = 4.5f;
        d = 6.8f;
        add(c, d);
        e = 6.7;
        f = 23.4;
        add(e, f);
    }

    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void add(float a, float b) {
        float sum = a + b;
        System.out.println(sum);
    }

    public static void add(double a, double b) {
        double sum = a + b;
        System.out.println(sum);
    }
}