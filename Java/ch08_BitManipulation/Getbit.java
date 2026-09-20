public class Getbit {
    public static void main(String[] args) {
        int n = 5;
        int i = 2;
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            System.out.println("bit is 0");
        } else {
            System.out.println("bit is 1");
        }
    }
}