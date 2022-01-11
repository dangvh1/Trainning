package Java_Array;

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        int m;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so hang cua ma tran A ");
        m = sc.nextInt();
        System.out.println("nhap so cot cua ma tran A ");
        n = sc.nextInt();
        int[][] A = new int[m][n];
        System.out.println("Nhập vào các phần tử của ma trận A: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma trận A: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("ma tran sau khi xoay 90 do :");
        for (int j = n-1; j >= 0; j--) {
            for (int i = 0; i < n; i++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}






