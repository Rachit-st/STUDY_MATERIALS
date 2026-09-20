import java.util.*;

class r6power2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = input.nextInt();
        System.out.println("Enter Power :");
        int n = input.nextInt();
        int ans = power(n,num);
        System.out.println(ans);
    }
    public static int power(int n, int num){
        if(n == 0){
            return 1;
        }
        if(num == 0){
            return 0;
        }
        if(n % 2 == 0){
            return power(n/2,num) * power(n/2,num);
        }else{
            return num * power(n/2,num) * power(n/2,num);
        }
    }
}
