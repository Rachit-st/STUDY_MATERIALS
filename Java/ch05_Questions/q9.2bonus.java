package ch05_Questions;
import java.util.*;
class q10bonus{
    public static void fibonacci(int a){
        int x = 0;
        int n = 1;
        int b = 0;
        System.out.println("Fibunacci Series: ");
        System.out.print(x + " ");
        System.out.print(n + " ");
        for(int i = 1; i <= a; i++){
            b = x + n;
            System.out.print(b+" ");
            x = n;
            n = b;
        }
        return ;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input Number: ");
        int a = input.nextInt();
        fibonacci(a);
    }
}
