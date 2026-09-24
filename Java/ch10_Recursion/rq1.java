public class rq1 {
    public static void main(String[] args) {
        int n = 3;
        toh(n,"source","helper","destination");
    }
    public static void toh(int n, String source, String helper, String destination){
        if(n == 1){
            System.out.println("transfer disk "+ n + " from "+ source + " to " + destination);
            return;
        }
        toh(n-1, source, destination, helper);
        System.out.println("transfer disk "+ n + " from "+ source + " to " + destination);
        toh(n-1,helper,source,destination);
    }
}
