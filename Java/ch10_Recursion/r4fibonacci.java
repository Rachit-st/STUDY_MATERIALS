import java.util.*;
class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number Till You Want Fibonacci Seriese: ");
        int n = input.nextInt();
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        fibonacci(a , b , n-2);
    }
    public static void fibonacci(int a , int b , int n){
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        fibonacci(b , c , n-1);
    }
}
