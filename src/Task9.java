import java.util.Scanner;

public class Task9 {
    public static int findLength(String s) {
        if (s.equals("")) return 0;
        return 1 + findLength(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();
        System.out.println(findLength(inputStr));
    }
}
