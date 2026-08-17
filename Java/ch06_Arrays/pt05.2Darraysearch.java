package ch06_Arrays;
import java.util.*;
class pt052Darraysearch {
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
        rcsearch(rows, colm, num);
    }
    public static void rcsearch(int a, int b, int[][]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number To Search: ");
        int x = input.nextInt();
        boolean found = false;
        for(int i = 0;i<a;i++){
            for(int j = 0; j<b;j++){
                if(args[i][j]==x){
                    System.out.println("Number Found at: " + "(" + i + "," + j + ")");
                    found = true;
                    return;
                }
            }
        }
        if(!found==false){
            System.out.println("Number Dosent Exist");
        }
    }
}
