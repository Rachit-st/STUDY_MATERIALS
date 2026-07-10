package ch04_Functions;
import java.util.*;
class multiplyFunction {
    public static int calculateProduct(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = input.nextInt();
        System.out.println("Enter Second Number:");
        int b = input.nextInt();
        System.out.println("Multiplication Of Numbers Are:" + calculateProduct(a, b));
    }
}
