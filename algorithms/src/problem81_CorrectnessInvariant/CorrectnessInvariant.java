package problem81_CorrectnessInvariant;

public class CorrectnessInvariant {

    public static void main(String[] args) {
        insertionSort(new int[]{4, 1, 3, 5, 6, 2});
    }

    private static void insertionSort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int value = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > value) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }

        printArray(A);
    }


    static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
    }
}
