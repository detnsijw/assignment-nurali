import java.util.Scanner;

public class Task10 {
    public static int calculateGCD(int x, int y) {
        if (y == 0) return x;
        return calculateGCD(y, x % y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(calculateGCD(num1, num2));
    }
}
