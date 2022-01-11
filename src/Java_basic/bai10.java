package Java_basic;

public class bai10 {
    public static boolean checkSNT(int n){
        if(n>1){
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0) return false;
            }
            return true;
        }
        else return false;
    }
    public static boolean chusoNT(int n){
        while(n!=0){
            if(!checkSNT(n%10)) {
                return false;
            }
            n/= 10;
        }
        return true;
    }
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
    public static void display(){
        int count = 0;
        for (int i = 1000000; i <= 9999999 ; i++) {
            if(soTN(i) && soTN(i) && chusoNT(i)){
                if(count%10 == 0){
                    System.out.println("");
                }
                count++;
                System.out.println(" " + i);
            }
        }
        System.out.println("so luong");
        System.out.println(count);
    }

    public static void main(String[] args) {
        display();

    }

}
