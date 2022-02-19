//same as abstract class but you can implement as many as you want
interface test1 {
    int x = 10;

    public void meth1();

    public void meth2();

    // it gave option if any child class require it can overwrite it or not
    default void meth3() {
        System.out.println("runnning from test1 interface");
    }
    // if we defind method same as meth1 and meth2 it show error abstract can't
    // have body so to make a function

    public static void meth4() {
        System.out.println("function from test1");
    }
}

// as it made from abstract class the method/function must be overwrite to make
// child
// class concrete
class test2 implements test1 {
    public void meth1() {
        System.out.println("method 1 of child class overwrite");
    }

    public void meth2() {
        System.out.println("method 2 of child class overwrite");
    }

    public void meth3() {
        System.out.println("running from the test2 child of test1");
    }
}

class test3 implements test1 {
    public void meth1() {
        System.out.println("method 1 of child class overwrite");
    }

    public void meth2() {
        System.out.println("method 2 of child class overwrite");
    }

    public void meth3() {
        System.out.println("running from the test3 child of test1");
    }

    public void meth4() {
        System.out.println("Overwrite the deafult function now it run in test3");
    }
}

public class Interface_Example {
    public static void main(String args[]) {
        // same as abstract if we can't make object of abstract class same goes for
        // interface
        // test1 t=new test1(); it show error
        test2 t = new test2(); // this is valid we make referance and object of child class
        t.meth1();
        t.meth2();
        test1 t1 = new test2(); // we can make referance of interface/abstract and object of child class
        t1.meth1();
        t1.meth2();

        // we can access the function of interface without making any object
        test1.meth4();
        // test1.meth1(); but we can't access the abstract method b/c it is incomplete
        // we can access the variable of interface class
        System.out.println(test1.x);

        test1 t3 = new test3();
        t3.meth3();
    }
}
