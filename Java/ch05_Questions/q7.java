package ch05_Questions;
import java.util.*;
class q7 {
    public static int nnumdis(int a){
        Scanner input = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for(int i = 0; i < a; i++){
            System.out.print("Give Input: ");
            int x = input.nextInt();
            if(x>0){
                pos = pos + 1;
            }else{
                if(x<0){
                    neg = neg + 1;
                }else{
                    zero = zero + 1;
                }
            }
        }
        System.out.println("[Positive Numbers]:- " + pos);
        System.out.println("[Negative Number]:- " + neg);
        System.out.println("[Zeros Number]:- " + zero);
        return pos;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter How Many Nubers U Want To Enter: ");
        int n = input.nextInt();
        nnumdis(n);
    }
}
