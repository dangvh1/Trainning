package Java_basic;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        int i = 2;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so nguyen n");
        n = sc.nextInt();
        while (n >1){
            if (n%i == 0){
                n/=i;
                System.out.print( i + "x");
            }else {
                i++;
            }
        }

    }


}
