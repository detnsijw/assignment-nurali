import java.util.Scanner;

public class Task8 {
    public static String isAllDigits(String str) {
        if (str.length() == 0) return "YES";

        if (!Character.isDigit(str.charAt(0))) {
            return "NO";
        }
        return isAllDigits(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(isAllDigits(text));
    }
}
