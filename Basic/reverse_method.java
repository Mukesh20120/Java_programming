import java.util.*;

public class reverse_method {
    static int reverse(int n) {
        int rem = 0;
        while (n != 0) {
            rem = (rem * 10) + (n % 10);
            n /= 10;
        }
        return rem;
    }

    static int[] reverse(int A[]) {
        int B[] = new int[A.length];
        int n = A.length;
        for (int i = 0; i < n; i++)
            B[i] = A[n - i - 1];
        return B;
    }

    static void Display(int A[]) {
        for (int a : A)
            System.out.print(a + " ");
        System.out.println("");
    }

    static void rev(int A[]) {
        int n = A.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = A[i];
            A[i] = A[n - i - 1];
            A[n - i - 1] = temp;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n));
        // array reverse returning array passing by reference deafult
        int A[] = { 1, 3, 5, 7, 5, 3, 7, 8, 5, 2, 3 };
        int B[] = reverse(A);
        Display(B);
        int C[] = { 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16 };
        Display(C);
        rev(C);
        Display(C);
        sc.close();
    }
}
