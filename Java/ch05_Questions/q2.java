package ch05_Questions;
import java.util.*;
class q2 {
    public static int sumn(int a){
        int sum = 0;
        for(int i = 1; i<=a; i = i + 2){
            sum = sum + i;     
         }
        return sum;
        
        
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = input.nextInt();
        System.out.println("Sum of Odd Numbers from 1 to n are: " + sumn(n));
    }
}
