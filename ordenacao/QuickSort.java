public class QuickSort {

    private int swaps = 0;

    private int iterations = 0;

    public void sort(int[] array, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(array, low, high);

            sort(array, low, pivotIndex - 1);

            sort(array, pivotIndex + 1, high);

        }

    }

    private int partition(int[] array, int low, int high) {

        int pivot = array[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            iterations++;

            if (array[j] < pivot) {

                i++;

                swap(array, i, j);

            }

        }

        swap(array, i + 1, high);

        return i + 1;

    }

    private void swap(int[] array, int i, int j) {

        swaps++;

        int temp = array[i];

        array[i] = array[j];

        array[j] = temp;

    }

    public int getSwaps() {

        return swaps;

    }

    public int getIterations() {

        return iterations;

    }

    public static void test(int[] array, int length) {

        QuickSort quickSort = new QuickSort();

        long startTime = System.currentTimeMillis();

        quickSort.sort(array, 0, length - 1);

        System.out.println(
            "QuickSort - Size: " + length + 
            ", Time: " + (System.currentTimeMillis() - startTime) + 
            " ms, Swaps: " + quickSort.getSwaps() + 
            ", Iterations: " + quickSort.getIterations()
        );

    }

}
