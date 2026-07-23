package ch06_Arrays;
import java.util.*;
class pt03LinearSearch {
    public static void search(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Which Number's Index You Want To Find: ");
        int x = sc.nextInt();
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                System.out.println("x found at index: " + i);
            }else{
                System.out.println("index not found");
            }
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("enter values inside array: ");
        for(int i = 0; i<size; i++){
            num[i] = sc.nextInt();
        }
        search(num);
    }
}