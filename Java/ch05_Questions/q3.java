package ch05_Questions;
import java.util.*;
class q3 {
    public static void greaterorlesser(int a, int b){
        if (a==b){
            System.out.println("both numbers are equal");
        }
        else if (a>b){
                System.out.println("first number is greater than second number");
            }
            else{
                System.out.println("second number is greater than first number");
            }
        return;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = input.nextInt();
        System.out.println("Enter Second Number:");
        int b = input.nextInt();
        greaterorlesser(a, b);
    }
}
