package Java_Array;

import java.util.Scanner;

public class bai5 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] a = null;
        float[] b = null;
        float[] c = null;

        System.out.println("---Nhập mảng a---");
        a = input(a);
        System.out.println("---Nhập mảng b---");
        b = input(b);
        System.out.print("Nhập phần tử p = ");
        int p = sc.nextInt();
        System.out.println("mang c là ");
        c = chen(a,b,p);
        show(c);

    }

    public static float[] chen(float[] a, float[] b, int p){
        int aIndex = a.length - 1;
        int bIndex = b.length - 1;
        int cIndex = a.length + b.length - 1;
        float[] c = new float[cIndex + 1];
        for (int i = 0; i < cIndex; i++) {
            if (i >= p - 1 && i < (p + aIndex)) {
                c[i] = a[aIndex];
                aIndex++;
            } else {
                c[i] = b[bIndex];
                bIndex++;
            }
        }
        return c;
    }

    public static float[] input(float[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        // khởi tạo arr
        arr = new float[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void show(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}

