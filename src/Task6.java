import java.util.Scanner;

public class Task6 {
    public static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int n = reader.nextInt();
        System.out.println(power(a, n));
    }
}
