package Java_basic;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        int sum = 0;
        long n;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so n");
        n = sc.nextInt();
        while (n != 0){
            sum += n%10;
            n/=10;
        }
        System.out.println("tong cua cac chu so : " + sum);

    }
}
