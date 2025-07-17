public class P04_SumArray {
    public static void main(String[] args) {
        int[] array = {1, 12, 2, 1, 2};
        int sum = 0;
        for (int i : array) sum += i;
        System.out.println("Sum: " + sum);
    }
}
