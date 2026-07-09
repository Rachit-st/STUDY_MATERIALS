package ch03_AdvancedPatterns;

import java.util.Scanner;
class advpatq1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 5;
        // Top half
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
               System.out.print("* ");
            }
            int space = 2 * (n - i);
            for(int j = 0; j < space; j++){
                System.out.print("  ");
            }
            for(int j = 0; j < i; j++){
               System.out.print("* ");
            }
            System.out.println();
        }
        // Bottom half
        for(int i = n; i >= 1; i--){
            for(int j = 0; j < i; j++){
               System.out.print("* ");
            }
            int space = 2 * (n - i);
            for(int j = 0; j < space; j++){
                System.out.print("  ");
            }
            for(int j = 0; j < i; j++){
               System.out.print("* ");
            }
            System.out.println();
        }          
    }
}