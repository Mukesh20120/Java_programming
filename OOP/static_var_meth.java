class hondacity {

    // delcare the static variable that can access by every object of this class and
    // remian same value can be change by any object and access by any object
    public static long price = 10;
    public int x, y;

    // static method it can only have static member
    static void roadtrip(String s) {
        switch (s) {
            case "Delhi":
                System.out.println(price * price * 0.1);
            case "mumbai":
                System.out.println(price * price * 0.09);
        }
    }

    void Display() {
        System.out.println(x + " " + y + "price" + price);
    }
}

public class static_var_meth {
    public static void main(String args[]) {
        hondacity h1 = new hondacity();
        hondacity h2 = new hondacity();
        h1.x = 10;
        h2.y = 20;
        h1.Display();
        hondacity.price = 20L;

        h1.Display();
        h2.x = 11;
        h2.y = 21;
        h2.Display();
    }

}
