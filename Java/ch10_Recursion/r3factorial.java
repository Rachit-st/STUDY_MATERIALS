import java.util.*;
 class factorial {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = 1;
        
        int fac = 1;
        System.out.print("Enter Number For Factorial: ");
        int till = input. nextInt();
        System.out.println("Enter factorial For Second Methode: ");
        int a = input.nextInt();
        facto(n,till,fac);
        int ans = facto2(a);
        System.out.println(ans);
    }
    public static void facto(int n, int x, int b){
        if(n == x){
            b = b*n;
            System.out.print(b);
            return; 
        }
        b = b*n;
        facto(n+1, x , b);
    }
    //or
    public static int facto2(int a){
        if(a == 1 || a == 0){
            return 1;
        }
        int fact_m1 = facto2(a-1);
        int fact = a * fact_m1;
        return fact;  // tail recurtion
    }
}

