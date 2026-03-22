import java.util.Scanner;

public class Task7 {
    public static void reverseList(int count, Scanner sc) {
        if (count == 0) return;

        int current = sc.nextInt();
        reverseList(count - 1, sc);
        System.out.println(current);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        reverseList(n, console);
    }
}