package Java_Array;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int n;
        int x;
        int kt;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số phần tử của mảng: ");
            n = sc.nextInt();
            System.out.println("Nhập gia tri x : ");
            x = sc.nextInt();
        } while (n <= 0);

        int[] arr = new int[n];

        System.out.println("Nhập giá trị cho các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        System.out.println("\nMảng co cac phan tu : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("vi tri so nguyn to tren mang");
        System.out.println(kiemTra(arr,n,x));
    }

    public static int kiemTra(int[] arr, int n, int x){
        int kt = 0;
        int kt1 = 99999;
        for (int i = 0; i < n; i++) {
            if (ktsoNT(arr[i])){
                if (Math.abs(x- arr[i]) < kt1){
                    kt1 = Math.abs(x - arr[i]);
                    kt = i;
                }
            }
        }
        return kt;
    }

    public static boolean ktsoNT(int n){
        if (n < 2){
            return false;
        }else {
            for (int i = 2; i <= n/2  ; i++) {
                if (n % i == 0){
                    return false;
                }
            }
            return true;
        }

    }

}
