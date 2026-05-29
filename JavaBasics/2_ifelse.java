import java.util.*;
class ifelse {
    public static void main(String[]agrs){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("Entered Number Is Even");
        }
        else{
            System.out.println("Entered Number Is Odd");
        }
    }
}    

