public class Task2 {
    public static int getSum(int[] numbers, int index) {
        if (index == numbers.length) {
            return 0;
        }
        return numbers[index] + getSum(numbers, index + 1);
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 4, 1};
        int totalSum = getSum(data, 0);
        double average = (double) totalSum / data.length;
        System.out.println(average);
    }
}