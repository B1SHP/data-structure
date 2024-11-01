public class RadixSort {

    private int swaps = 0;

    private int iterations = 0;

    public void sort(int[] array) {

        int max = getMax(array);

        for (int exp = 1; max / exp > 0; exp *= 10) {

            countSort(array, exp);

        }

    }

    private int getMax(int[] array) {

        int max = array[0];

        for (int i = 1; i < array.length; i++) {

            iterations++;

            if (array[i] > max) {

                max = array[i];

            }

        }

        return max;

    }

    private void countSort(int[] array, int exp) {

        int[] output = new int[array.length];

        int[] count = new int[10];

        for (int i = 0; i < array.length; i++) {

            iterations++;

            count[(array[i] / exp) % 10]++;

        }

        for (int i = 1; i < 10; i++) {

            count[i] += count[i - 1];

        }

        for (int i = array.length - 1; i >= 0; i--) {

            output[count[(array[i] / exp) % 10] - 1] = array[i];

            count[(array[i] / exp) % 10]--;

            swaps++;

        }

        for (int i = 0; i < array.length; i++) {

            array[i] = output[i];

        }
    }

    public int getSwaps() {

        return swaps;

    }

    public int getIterations() {

        return iterations;

    }

    public static void test(int[] array, int length) {

        RadixSort radixSort = new RadixSort();

        long startTime = System.currentTimeMillis();

        radixSort.sort(array);

        System.out.println(
            "RadixSort - Size: " + length +
            ", Time: " + (System.currentTimeMillis() - startTime) + 
            " ms, Swaps: " + radixSort.getSwaps() + 
            ", Iterations: " + radixSort.getIterations()
        );

    }

}

