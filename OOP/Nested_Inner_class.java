class outer {
    int x = 10;
    /*
     * we can make class inside another class all the variable outside inner act as
     * global
     * variable and you can access the variable to access the variable of inner we
     * have to define a new object of inner class int ouside class in java we can
     * make
     * object first and then define its class it is valid
     */
    inner i = new inner();

    class inner {
        int y = 20;

        void innerDisplay() {
            System.out.println(x + " " + y);
        }
    }

    void outerDisplay() {
        // here we access the memeber as a referance.member
        System.out.println(x + "display from outside class" + i.y);
    }
}

public class Nested_Inner_class {
    public static void main(String args[]) {
        // as we make objec and reference of outer class we can only access it members
        outer ot = new outer();
        System.out.println(ot.x);
        ot.outerDisplay();
        // as we have deine the objec in outer class we can acces by our objec in main
        // and from it we can access all the member of inner class also
        System.out.println(ot.i.y);
        ot.i.innerDisplay();

        // we have create the inner class object
        outer.inner oi = new outer().new inner();
        System.out.println(oi.y);
        oi.innerDisplay();

    }
}
