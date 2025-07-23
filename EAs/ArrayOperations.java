import java.util.Arrays;

public class Array {

    int[] array;

    Array(int size) {
        this.array = new int[size];
    }

    Array(int[] array) {
        this.array = array;
    }

    void add(int index, int value) {
        int currSize = array.length;
        int[] extArray = new int[currSize + 1];

        if (index == 0) for (int i  = 0; i < currSize; i++) extArray[i + 1] = array[i];
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

    void delete(int index) {
        
    }

    void display() {
        System.out.println(Arrays.toString(this.array));
    }
}
