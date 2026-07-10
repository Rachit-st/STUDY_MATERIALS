package ch04_Functions;
import java.util.*;
class factorial {
    public static void factorial(int a){
        
        int b = 1;
        
        if(a<0){
            System.out.println("Invalid Number");
            return;
        }

        for(int i= 1; i<=a;i++){
            b = b * i;
        }
        System.out.print(b);
        return;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Numbr:");
        
        int n = input.nextInt();
        factorial(n);
    }
}
