package ch07_Strings;
import java.util.*;
public class string1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String f1 = "toney";
        String f2 = "stark";
        String fn = f1 + " " + f2;
        String yourname = input.nextLine();
        System.out.println(fn.length());
        System.out.println(yourname.length());
        for(int i = 0; i < fn.length();i++){
            System.out.println(fn.charAt(i));
        }
        if(fn.compareTo(yourname)==0){
            System.out.println("String are equal");
        }else{
            if(fn.compareTo(yourname)<0){
                System.out.println("string 2 is bigger");
            }else{
                System.out.println("String 1 Is Bigger");
            }
        }
        String sentence = "I love you 3000";
        String msg1 = sentence.substring(0);//end index no means till end we can also use length to get full length of sentence then print till ts over
        String msg2 = sentence.substring(0,11);
        System.out.println(msg2 + "....." + msg1 + "!!!");
    }
        

    
}
