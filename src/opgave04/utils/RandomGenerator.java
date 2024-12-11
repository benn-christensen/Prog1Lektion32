package opgave04.utils;

import java.util.Random;

public class RandomGenerator {
    public static int[] generateRandomArray(int size) {
        int[] generatedNumbers = new int[size];
        Random random = new Random();
        for (int index = 0; index < size; index++) {
            generatedNumbers[index] = random.nextInt();
        }
        return generatedNumbers;
    }
}
