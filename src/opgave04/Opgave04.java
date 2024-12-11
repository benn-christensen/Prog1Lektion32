package opgave04;

import opgave04.utils.RandomGenerator;
import opgave04.utils.StopWatch;

import java.util.Arrays;

public class Opgave04 {
    public static void main(String[] args) {
        int[] sampleSize = {10_000, 100_000, 1_000_000, 10_000_000};

        for (int size : sampleSize) {
            int[] array = RandomGenerator.generateRandomArray(size);
            StopWatch.start();
            Arrays.sort(array);
            //bubbleSort(array);
            //selectionSort(array);
            StopWatch.stop();
            System.out.println("Sorterede array med " + size + " elementer: " + StopWatch.durationMilliSeconds() + " millisekunder.");
        }
    }

    public static void bubbleSort(int[] array) {
    }

    public static void insertionSort(int[] array) {
    }
}
