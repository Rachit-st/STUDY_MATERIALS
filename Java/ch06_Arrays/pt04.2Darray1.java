package ch06_Arrays;
import java.util.*;
class pt042Darray1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number Of Rows: ");
        int rows = input.nextInt();
        System.out.println("Enter Number Of Column: ");
        int colm = input.nextInt();
        int[][] num = new int[rows][colm];
        //input
        //rows
        System.out.println("Input Values: ");
        for(int i = 0;i < rows;i++){
            //columns
            for(int j = 0;j < colm; j++){
                num[i][j] = input.nextInt();
            }
        }
        System.out.println();
        output(rows, colm, num);
        
    }
    
    public static void output(int a, int b,int[][] args ){
        //output
        System.out.println("Output: ");
        for(int i = 0;i <a; i++){
            for(int j = 0; j<b;j++){
                System.out.print(args[i][j] + " ");
            }
            System.out.println();
        }
    }
}


