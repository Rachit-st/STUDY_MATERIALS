package ch06_Arrays;

class pt01 {
    public static void main(String[] args) {
        int[] marks = new int[3];   //or -->   ""int marks[] = {96,97,95};"" in this case we know what the values are and dont have to define afterwards 
        marks[0] = 96;              // not needed
        marks[1] = 97;              //    
        marks[2] = 95;              //
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);
        for(int i = 0; i < 3; i++){
            System.out.println(marks[i]);
        }
    }
}
