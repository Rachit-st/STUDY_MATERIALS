package ch04_Functions;
import java.util.*;
class sumFunction {
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Numer:");
        int a = input.nextInt();
        System.out.println("Enter Second Number:");
        int b = input.nextInt();
        int sum = calculateSum(a,b);
        System.out.println("Sum Is :" + sum);
    }
}
