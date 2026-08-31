package ch08_BitManipulation;

class Clearbit {
    public static void main(String[] args) {
        int n = 5;
        int i = 2;
        int bitMask = 1 << i;
        int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}
