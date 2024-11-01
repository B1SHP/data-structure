import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random(49); 

        for (int size : new int[]{1000, 10000, 100000, 500000, 1000000}) {

            int[] array = new int[size];

            for (int i = 0; i < size; i++) {

                array[i] = random.nextInt(size);

            }

            QuickSort.test(
                array.clone(), 
                size
            );

            RadixSort.test(
                array.clone(), 
                size
            );

        }

    }

}

