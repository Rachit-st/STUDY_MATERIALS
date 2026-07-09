package ch01_Basics;

import java.util.Scanner;
class L01_Firstclass {
    public static void main(String[] args) {
        Scanner INPUT = new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("*\n**\n***\n****\n*****");
        int a = 10;
        int b = 5;
        int idk = (a*b)/(a-b);
        System.out.println(idk);
        System.out.println("Enter a number:");
        int c = INPUT.nextInt();
        int faa = c*idk;
        System.out.println(faa);
    }
}