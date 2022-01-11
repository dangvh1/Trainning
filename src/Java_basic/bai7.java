package Java_basic;

import java.util.Scanner;

public class bai7 {
    public  static boolean XetSNT(int n){
        if (n<2){
            return false;
        }
        int SNT = (int) Math.sqrt(n);
        for (int i = 2; i <= SNT; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean xetSL(int n){
        int c;
        while (n>0){
            c = n%10;
            n /=10;
            if (c%2 == 0 ) {
                return false;
            }
        }return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("cac so nguyen to lẻ co 6 chu so : ");
        for (int i = 100001; i < 999999; i++) {
            if(xetSL(i) && (XetSNT(i))){
                System.out.println(i);
                count ++;
            }
        }
        System.out.println("tong cac so nguyen to co 6 chu so : " + count);
    }

}
