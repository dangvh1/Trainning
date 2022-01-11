package Java_basic;

import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        int firstNumber, secondNumber, temp1, temp2, uscln, bscnn;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số thứ nhất: ");
        firstNumber = sc.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        secondNumber = sc.nextInt();

        while ((firstNumber <= 0) || (secondNumber <= 0)) {
            System.out.println("Nhập lại hai số nguyên dương!");
            System.out.println("Nhập vào số thứ nhất: ");
            firstNumber = sc.nextInt();
            System.out.println("Nhập vào số thứ hai: ");
            secondNumber = sc.nextInt();
        }

        temp1 = firstNumber;
        temp2 = secondNumber;
        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        }
        uscln = temp1;

        System.out.println("Ước số chung lớn nhất của " + firstNumber + " và " + secondNumber + " = " + uscln);
        System.out.println("Bội số chung lớn nhất của " + firstNumber + " và " + secondNumber + " = " +
                ((firstNumber * secondNumber) / uscln));
    }
}




