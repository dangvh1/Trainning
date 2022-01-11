package Java_basic;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int t = 0;
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        a = sc.nextInt();
        System.out.println("Nhập vào số b: ");
        b = sc.nextInt();
        if (a > b) {
            System.out.println("nhap lai 2 so a,b");
        }
        else{
            for (int i = a; i < b ; i++) {
                for (int j = i+1; j <= b ; j++) {
                    for (int k = 1; k < i; k++) {
                        if ((i % k == 0)  && (j % k == 0)) {
                            t++;
                            System.out.println("cac cap so nguyen to : " + i + " " + j );
                        }
                        if (t == 1) {
                            //System.out.println("cac cap so nguyen to : " + i + " " + j );
                        }
                    }

                }
            }
        }

    }
}
