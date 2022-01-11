package Java_Array;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int kt = 1;
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số phần tử của mảng: ");
            n = sc.nextInt();
        } while (n <= 0);

        int[] arr = new int[n];

        System.out.println("Nhập giá trị cho các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        int temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = n-1; j >= 1 ; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println("\nMảng sau khi sắp xếp: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

}
