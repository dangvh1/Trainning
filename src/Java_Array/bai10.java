package Java_Array;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        int n;
        int sumcheochinh = 0;
        int sumcheophu = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào hang va cot cua của ma trận: ");
        n = sc.nextInt();

        int A[][] = new int[n][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma trận A vừa nhập:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sumcheochinh += A[i][j];
                }
                if (i+j == n-1){
                    sumcheophu += A[i][j];
                }
            }
        }
        System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sumcheochinh);
        System.out.println("Tổng các phần tử nằm trên đường chéo phu = " + sumcheophu);
    }

}
