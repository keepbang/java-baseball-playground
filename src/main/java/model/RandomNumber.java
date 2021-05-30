package model;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomNumber {

    private final int RANDOM_NUMBER_SIZE = 3;

    private ArrayList<Integer> getNumberArray() {
        return new ArrayList<>(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).collect(Collectors.toList()));
    }

    public RandomNumber() {
    }

    public ArrayList<Integer> createRandomNumbers() {
        Random random = new Random();

        ArrayList<Integer> numberArray = getNumberArray();
        ArrayList<Integer> randomNumbers = new ArrayList<>();

        while (randomNumbers.size() != RANDOM_NUMBER_SIZE) {
            int numberArraySize = numberArray.size();

            int arrayIndex = random.nextInt(numberArraySize);

            int number = numberArray.get(arrayIndex);

            randomNumbers.add(number);
            numberArray.remove(arrayIndex);
        }

        return randomNumbers;
    }


}
