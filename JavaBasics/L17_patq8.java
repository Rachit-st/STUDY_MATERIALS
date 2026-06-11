import java.util.Scanner;
class L17_patq8{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter columns:");
        int n = input.nextInt();
        int m = 0;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<= i; j++){
                m=m+1;
                System.out.print(m + " ");
            }
        System.out.println();
        }
    }
}
