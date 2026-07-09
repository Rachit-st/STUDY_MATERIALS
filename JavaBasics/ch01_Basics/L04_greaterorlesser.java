package ch01_Basics;

import java.util.Scanner;
class L04_greaterorlesser {
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = input.nextInt();
        System.out.println("Enter second number:");
        int b = input.nextInt();
        if (a==b){
            System.out.println("both numbers are equal");
        }
        else if (a>b){
                System.out.println("first number is greater than second number");
            }
            else{
                System.out.println("second number is greater than first number");
            }
    }
}
