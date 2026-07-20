package ch05_Questions;
import java.util.*;
class q1 {
    public static int average(int a, int b, int c){
        int x = (a + b + c)/3;
        return x;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = input.nextInt();
        System.out.println("Enter Second Number:");
        int b = input.nextInt();
        System.out.println("Enter Thirt Number:");
        int c = input.nextInt();
        System.out.println("Average Of Three Numbers Is:" + average(a,b,c));
    }
}
