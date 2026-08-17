package ch07_Strings;
import java.util.*;
class stringbuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(input.next());
        System.out.println(sb.charAt(0));//gives first letter
        sb.setCharAt(0,'u');//changes first letter
        System.out.println(sb);
        sb.insert(0,'r');//adds letter to any position
        System.out.println(sb);
        sb.delete(2,3);//deletes
        System.out.println(sb);
        sb.append('e');//adds letter to end 
        System.out.println(sb);
        System.out.println(sb.length());
    }
}

