
public class method_area {
    static double area(int r) {
        return Math.PI * r * r;
    }

    static int area(int a, int b) {
        return a * b;
    }

    static int area(int a, int b, int h) {
        return (a + b) * h / 2;
    }

    public static void main(String args[]) {
        int r = 5;
        int l = 10, b = 5;
        int a = 4, c = 7, h = 3;
        System.out.println(area(r)); // circle
        System.out.println(area(l, b));// rectangle
        System.out.println(area(a, c, h));// trapezium
    }
}
