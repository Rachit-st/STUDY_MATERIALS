package ch05_Questions;
import java.util.*;
class q8 {
    public static double power(int a, int b){
        double g = 1;
        if(b>=0){
            for(int i = 1; i <= b; i++){
                g = g * a;
            }return g;
        }else{
            for(int i = 0; i > b; i--){
                g = g * a;
            }return 1.0/g;
        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int x = input.nextInt();
        System.out.println("Enter Power: ");
        int n = input.nextInt();
        System.out.println("Answer is: " + power(x, n));
    }
}
