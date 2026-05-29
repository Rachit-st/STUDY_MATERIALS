import java.util.Scanner;
class question1 {
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = input.nextInt();
        System.out.println("Enter second number:");
        int b = input.nextInt();
        if (a==b){
            System.out.println("both numbers are equal");
        }
        else if (a>b){
                System.out.println("first number is greater than second number");
            }
            else{
                System.out.println("second number is greater than first number");
            }
    }
}
