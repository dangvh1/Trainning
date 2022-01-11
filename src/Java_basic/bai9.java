package Java_basic;

public class bai9 {
    public static boolean soTN(int n){
        int tg = n;
        int temp = 0;
        while (n > 0){
            temp = temp*10 + n%10;
            n/=10;
        }
        if (temp == tg){
            return true;
        }
        return false;
    }
    public static boolean tongchia10(int n) {
        int tong = 0;
        while(n > 0) {
            int t = n % 10;
            tong = tong + t;
            n = n / 10;
        }
        if(tong%10==0){
            return true;
        }
        return false;
    }

    public static boolean chuacacso(int n){
        int c;
        while (n>0){
            c = n%10;
            n /=10;
            if (c != 0 && c != 6 && c != 8 ) {
                return false;
            }
        }return true;
    }
    public static void display(){
        int count = 0;
        for (int i = 2000000; i <= 888888888 ; i+=2) {
            if(soTN(i) && tongchia10(i) && chuacacso(i)){
                if(count%10 == 0){
                    System.out.println("");
                }
                count++;
                System.out.println(" " + i);
            }
        }
    }


    public static void main(String[] args) {
        display();
    }



}
