import java.util.Arrays;

public class Array {

    public int[] array;

    public Array(int size) { this.array = new int[size]; }

    public Array(int... array) { this.array = array; }

    private void add(int index, int value) {
        int currSize = array.length;
        if (index < 0 || index > currSize) {
            System.out.println("Invalid range.");
            return;
        }

        int[] extArray = new int[currSize + 1];
        if (index == 0) for (int i = 0; i < currSize; i++) extArray[i + 1] = array[i];
        else if (index == currSize) for (int i = 0; i < currSize; i++) extArray[i] = array[i];
        else {
            for (int i = 0; i < index; i++) extArray[i] = array[i];
            for (int i = index + 1; i < extArray.length; i++) extArray[i] = array[i - 1];
        }

        extArray[index] = value;
        this.array = extArray;
    }

    void add(int value) {
        add(array.length, value);
    }

    private void deleteAt(int index) {
        int currSize = array.length;
        if (index < 0 || index >= currSize) {
            System.out.println("Invalid index.");
            return;
        }
        if (currSize == 1) {
            this.array = new int[]{};
            return;
        }

        int[] extArray = new int[currSize - 1];
        if (index == 0) for (int i = 1; i < currSize; i++) extArray[i - 1] = array[i];
        else if (index == currSize - 1) for (int i = 0; i < currSize - 1; i++) extArray[i] = array[i];
        else {
            int i = 0;
            for (; i < index; i++) extArray[i] = array[i];
            for (; i < extArray.length; i++) extArray[i] = array[i + 1];
        }

        this.array = extArray;
    }

    private void delete(int value) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == value) {
                deleteAt(i);
                return;
            }
    }

    private void deleteAll(int value) {
        int count = 0;
        for (int i : array) if (i == value) count++;

        if (count == 0) return;
        if (count == 1)  {
            delete(value);
            return;
        }

        int[] extArray = new int[array.length - count];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] == value) continue;
            extArray[j++] = array[i];
        }

        this.array = extArray;
        // Can be improved?
    }

    private void update(int index, int value) {
        int currSize = array.length;
        if (index < 0 || index >= currSize) {
            System.out.println("Invalid index.");
            return;
        }
        if (currSize == 1) {
            this.array = new int[]{value};
            return;
        }

        this.array[index] = value;
    }

    public String toString() {
        return Arrays.toString(this.array);
    }

    public static void main(String[] args) {
        Array arr = new Array(1,2,2,3,4,4,4,4);

        System.out.println("Initial State  : " + arr);

        arr.deleteAt(0);
        System.out.println("Delete [0]     : " + arr);

        arr.deleteAt(arr.array.length - 1);
        System.out.printf("Delete [%d]     : %s\n", arr.array.length - 1, arr);

        arr.delete(5);
        System.out.println("Delete (5)     : " + arr);

        arr.add(0, 9);
        System.out.println("Add (9) at [0] : " + arr);

        arr.add(arr.array.length, 1);
        System.out.printf("Add (1) at [%d] : %s\n", arr.array.length, arr);

        arr.add(5);
        System.out.printf("Add (1) at [%d] : %s\n", arr.array.length, arr);

        arr.deleteAll(4);
        System.out.println("Remove all (4) : " + arr);

        arr.update(4,5);
        System.out.println("Replace [4] with (5) : " + arr);
    }
}
