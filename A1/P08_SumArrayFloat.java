public class P08_SumArrayFloat {
    public static void main(String[] args) {
        float[] array = {1.23f, 12.11f, 31.67f, 12.5f, 112.1f, 5.6f, 2.7f, 2.8f, 1.1f, 9.9f};
        float sum = 0;
        for (float i : array) sum += i;
        System.out.printf("Sum     : %.2f\nAverage : %.2f", sum, sum / array.length);
    }
}
