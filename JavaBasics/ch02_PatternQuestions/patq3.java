package ch02_PatternQuestions;

import java.util.Scanner;

class patq3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("NO. OF ROWS:");
        int n = input.nextInt();
        System.out.print("NO. OF COLUMNS:");
        int m = input.nextInt();
        for(int i = 0; i<n;i++){
            for(int j=0;j<m;j++){
                if(i>=j){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++){        //second way to do this question
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
        
