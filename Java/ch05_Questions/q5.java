package ch05_Questions;
import java.util.*;
class q5 {
    public static void eligibility(int a){
        if(a>18){
            System.out.println("Eligible To Vote");
        }else{
            System.out.println("Not Eligible To Vote");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Age:");
        int a = input.nextInt();
        eligibility(a);
    }
    
}
