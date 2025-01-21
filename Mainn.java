public class Mainn {
    public static int sumOfNaturalNo(int n) {
        if (n == 1) {
            return n;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        int sumOfNum = sumOfNaturalNo(n - 1);
        return sum + sumOfNum;
    }
    public static void main(String[] args) {
        int n = 6;
        int result = sumOfNaturalNo(n);
        System.out.println("The sum of the sum of natural numbers up to " + n + " is: " + result);

        
    }
}
