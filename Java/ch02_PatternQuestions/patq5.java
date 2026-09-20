import java.util.Scanner;
class patq5{
    public static void main(String[] args) {
        Scanner INPUT = new Scanner(System.in);
        System.out.println("Enter column:");
        int n = INPUT.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j< n-i + 1 ; j++){
               System.out.print("  ");
            }
            for(int j = 0; j <= i;j++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}

