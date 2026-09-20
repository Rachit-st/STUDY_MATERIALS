import java.util.Scanner;
class patq2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Numbers Of Rows:");
        int m = input.nextInt();
        System.out.println("Enter Numbers Of Column:");
        int n = input.nextInt();
        for(int i = 0; i<m; i++){
            for(int a = 0; a< n;a++){
                if(i==0 || i==m-1){
                    System.out.print("* ");
                }else{
                    if(a==0||a==n-1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        
    }
}