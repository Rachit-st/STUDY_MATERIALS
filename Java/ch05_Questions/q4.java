package ch05_Questions;
import java.util.*;
class q4 {
    public static double cercumference(int a){
        double c = 2*(3.1415926)*a;
        return c;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius Of Circle:");
        int n = input.nextInt();
        System.out.println(cercumference(n));
    }
}
