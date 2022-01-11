package Java_basic;

import java.util.Scanner;

public class bai1b {
    public static void main(String[] args) {
        long sum = 0;
        int n;
        do {
            System.out.println("nhap n = ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
        }while (n <= 0);
        for (int i = 1; i < n; i++) {
            sum += 1/i;
        }
        System.out.println("sum = " + sum);
    }
}
