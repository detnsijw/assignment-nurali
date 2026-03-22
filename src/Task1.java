import java.util.Scanner;

public class Task1 {
    public static void showDigits(int number) {
        if (number == 0) return;

        showDigits(number / 10);
        System.out.println(number % 10);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int val = input.nextInt();
        showDigits(val);
    }
}