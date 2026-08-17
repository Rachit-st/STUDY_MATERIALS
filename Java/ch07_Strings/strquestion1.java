package ch07_Strings;
import java.util.*;

class strquestion1 {
    public static void main(String[] args){
        reverse(args);
    }
    public static void reverse(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        StringBuilder sb = new StringBuilder(input.next());
        int sblen = sb.length();
        
        // Loop through the first half of the string
        for(int i = 0; i < sblen / 2; i++){
            int j = sblen - 1 - i; // Calculate mirror index
            
            // Swap using a temporary variable
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
        }
        
        System.out.println(sb);
        input.close(); // Close the scanner
    }
}
