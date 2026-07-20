package ch05_Questions;
import java.util.*;
class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter How Mny Time Loop Should Run:");
        int n = input.nextInt();
        int i = 1;
        int a = 0;
        do{
            a = a + 1;
            System.out.println(a);
            i++;
        }while(i<=n);
    }
}
