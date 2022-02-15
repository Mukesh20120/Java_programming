import java.util.*;

public class GCD_HCF {
    static int hcfof(int a, int b) {
        int ans = 1;
        for (int i = 2; i < a && i < b; i++)
            if (a % i == 0 && b % i == 0)
                ans = i;
        return ans;
    }

    static int fun(int a, int b) { // concept :- a , b
        while (a != b) { // if 25 > 15
            if (a > b) // 25-15=10 < 15
                a -= b; // 10 > 15-10=5
            else // 10-5 == 5
                b -= a; // ans=5
        }
        return a;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        System.out.println(fun(first, second));
        sc.close();
    }
}
