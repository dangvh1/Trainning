package Java_basic;

public class bai8a {
    static boolean soTN(int n){
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
    static void display(){
        int count = 0;
        for (int i = 100000; i <= 999999 ; i++) {
            if(soTN(i)){
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
