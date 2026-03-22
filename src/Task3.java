import java.util.Scanner;

public class Task3 {
    public static boolean checkPrime(int n, int divisor) {
        if (divisor == 1) return true;
        if (n % divisor == 0) return false;

        return checkPrime(n, divisor - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();

        if (checkPrime(target, target - 1)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }
}