package Java_Array;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        int m;
        int n;
        int k;
        Scanner sc = new Scanner(System.in);
            System.out.println("nhap so hang cua ma tran A");
            m = sc.nextInt();
            System.out.println("nhap so cot cua ma tran A va so hang cua ma tran B ");
            n = sc.nextInt();
            System.out.println("nhap so cot cua ma tran B");
            k = sc.nextInt();
            int[][] A = new int[m][n];
            int[][] B = new int[n][k];
            int[][] C = new int[m][k];
            System.out.println("Nhập vào các phần tử của ma trận A: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("A[" + i + "][" + j + "] = ");
                    A[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < k; j++) {
                    System.out.print("B[" + i + "][" + j + "] = ");
                    B[i][j] = sc.nextInt();
                }
            }
            System.out.println("Ma trận A: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(A[i][j] + "\t");
                }
                System.out.println("\n");
            }

            System.out.println("Ma trận B: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < k; j++) {
                    System.out.print(B[i][j] + "\t");
                }
                System.out.println("\n");
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < k; j++) {
                    C[i][j] = 0;
                    for (int y = 0; y < n; y++) {
                        C[i][j] = C[i][j] + A[i][y] * B[y][j];
                    }
                }
            }
            System.out.println("Ma trận tích C: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < k; j++) {
                    System.out.print(C[i][j] + "\t");
                }
                System.out.println("\n");
            }
    }
}
