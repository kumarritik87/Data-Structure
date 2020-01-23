package recursion;

import java.util.Scanner;

public class FiibonacciSeries {
    static int fibo(int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1 || n == 2) {
            return (n - 1);
        } else {
            return (fibo(n - 1) + fibo(n - 2));
        }

    }

    public static void main(String[] args) {
        FiibonacciSeries fb = new FiibonacciSeries();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum number to find fibonacci series: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}
