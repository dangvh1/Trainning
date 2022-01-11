package Java_Array;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int kt = 1;
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số phần tử của mảng: ");
            n = sc.nextInt();
        } while (n <= 0);

        int[] arr = new int[n];
        int[] res = new int[n];

        System.out.println("Nhập giá trị cho các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
            res[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i+1; j < n; j++) {
                if (res[j] != 0 && arr[i]== arr[j]){
                    count++;
                    res[j] = 0;
                }
            }
            if (res[i] != 0){
                res[i] = count;
            }
        }
        int max = res[0];
        for (int i = 0; i < n; i++) {
            if (res[i] > max){
                max = res[i];
            }
        }
        System.out.println("so lan xuat hien nhieu nhat : " + max +", cac phan tu : ");
        for (int i = 0; i < n; i++) {
            if (res[i] == max){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
