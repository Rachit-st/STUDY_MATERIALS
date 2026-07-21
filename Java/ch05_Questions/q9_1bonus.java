package ch05_Questions;
import java.util.*;
class q9bonus{
    public static void hcf(int a , int b){
        int x = 0;
        if(a<b){
            x = a;
            while(b%x!=0 || a%x!=0){
                x--;
            }System.out.println("Hcf is: " + x);
        }else{
            x = b;
           while(a%x!=0 || b%x!=0){
            x--;
           }System.out.println("Hcf is: " + x);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first value: ");
        int a = input.nextInt();
        System.out.println("Input second value: ");
        int b = input.nextInt();
        hcf(a, b);
    }
}
