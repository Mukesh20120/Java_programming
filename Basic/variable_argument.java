public class variable_argument {
    static int maxi(int... A) {
        if (A.length == 0)
            return Integer.MIN_VALUE;
        int m = A[0];
        for (int it : A)
            if (m < it)
                m = it;
        return m;
    }

    static int sum(int... A) {
        int s = 0;
        for (int i : A)
            s += i;
        return s;
    }

    static double discount(int... A) {
        int total = sum(A);
        if (total == 0)
            return 0;

        if (total < 500)
            return total / 20;
        else if (total > 500 && total <= 1000)
            return total / 10;
        else if (total > 1000)
            return total / 5;
        else
            return total / 4;

    }

    public static void main(String args[]) {
        // finding maximum using variable argument
        System.out.println(maxi());
        System.out.println(maxi(2, 4, 6));
        System.out.println(maxi(2, 4, 34, 24));
        System.out.println(maxi(2, 4, 6, 87, 4, 3, 34, 24));

        // finding sum of all the argument
        System.out.println(sum());
        System.out.println(sum(2, 4, 6));
        System.out.println(sum(2, 4, 34, 24));
        System.out.println(sum(2, 4, 6, 87, 4, 3, 34, 24));

        // finding discount
        System.out.println(discount());
        System.out.println(discount(20, 40, 60));
        System.out.println(discount(20, 40, 340, 240));
        System.out.println(discount(20, 40, 60, 807, 40, 30, 340, 240));
    }
}
