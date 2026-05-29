// no hints 
import java.util.Scanner;
class question2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number:");
        int a = input.nextInt();
        System.out.println("enter second number:");
        int b = input.nextInt();
        System.out.println("enter the operation you want to perform:");
        switch (input.next()){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            default:
                System.out.println("invalid operation");
        }
    }
}