package ch02_PatternQuestions;

import java.util.Scanner;
class patq4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter coulumn:");
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
               System.out.print("* ");
            }
        System.out.println();
        }
    }
}
