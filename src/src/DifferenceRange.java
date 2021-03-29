public class DifferenceRange {
    public static void main(String args[]) {
        int n = 4, m = 20, sum1 = 0, sum2 = 0;


        for (int i = 1; i <= m; i++) {
            if (i % n == 0) {
                sum1 += i;
            } else {
                sum2 += i;
            }
        }
        int result = sum2 - sum1;
        System.out.println("sum difference is:" + result);
    }
}
