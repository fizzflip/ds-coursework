public class P03_CopyArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 2, 4, 5};

        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) copy[i] = original[i];
    }
}
