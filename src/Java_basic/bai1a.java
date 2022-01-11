package Java_basic;

import java.util.Scanner;

public class bai1a {
    // bài 1 a
    public static void main(String[] args) {
        long sum = 0;
        int n;
        do {
            System.out.println("nhap n = ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
        }while (n <= 0);
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }





}
