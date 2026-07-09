package ch02_PatternQuestions;

import java.util.Scanner;
class patq6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter columns:");
        int n = input.nextInt();
        for(int i = 1; i<=n;i++){
            for(int j = 1; j <= i ; j++){
                System.out.print(j);
            }
        System.out.println();
        }
    }
}
