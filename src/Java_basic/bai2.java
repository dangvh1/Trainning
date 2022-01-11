package Java_basic;

import java.util.Scanner;

public class bai2 {
    // bài 2
    public static void main(String[] args) {
        long sum = 0;
        int n;
        System.out.println("nhap so nguyen n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.printf("cac uoc so cua %d la :", n);
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.printf("\t" + i);
                sum++;
            }
        }
        System.out.println();
        System.out.println("số lượng ước số mà nó có : " + sum);

    }

}
