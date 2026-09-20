import java.util.*;
class sumfirstn {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = 1;
        int sum = 0;
        System.out.println("Enter Number Till You Want To Sum: ");
        int till = input.nextInt();
        sumn(n,till,sum);
    }
    public static void sumn(int n, int x, int b){
        if(n == x ){
            b = b + n;
            System.out.println(b);
            return;
        }
        b = b + n;
        sumn(n+1,x,b);
        
    }
}
