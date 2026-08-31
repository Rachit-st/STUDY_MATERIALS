package ch08_BitManipulation;

class Setbit {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int bitMask = 1 << i;
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}
