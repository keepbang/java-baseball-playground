package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomNumber {

    private final int RANDOM_NUMBER_SIZE = 3;

    public List<Integer> createRandomNumbers() {
        Random random = new Random();

        List<Integer> numberArray = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        List<Integer> randomNumbers = new ArrayList<>();

        while(randomNumbers.size() != RANDOM_NUMBER_SIZE) {

            int numberArraySize = numberArray.size();

            int arrayIndex = random.nextInt(numberArraySize);

            int number = numberArray.get(arrayIndex);

            randomNumbers.add(number);
            numberArray.remove(arrayIndex);
        }

        return randomNumbers;
    }


}
