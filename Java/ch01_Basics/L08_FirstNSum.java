class L08_FirstNSum {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 5; i=i+1) {
            a = a + i;
        }
        System.out.print(a+ " ");
        int h = 0;
        int b = 0;
        while(h<4){
            h = h + 1;
            b = b + h;
        }
        System.out.print(b+ " ");
        int f = 0;
        int c = 0;
        do{
            f=f+1;
            c=c+f;
        }while(f<4);
        System.out.print(c);

    }
}
