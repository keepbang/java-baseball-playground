package model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberTest {

    @Test
    void randomNumberTest() {
        Random random = new Random();

        List<Integer> numberArray = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        List<Integer> randomNumbers = new ArrayList<>();
        while(randomNumbers.size() != 3) {

            int numberArraySize = numberArray.size();

            int arrayIndex = random.nextInt(numberArraySize);

            int number = numberArray.get(arrayIndex);

            randomNumbers.add(number);
            numberArray.remove(arrayIndex);
        }



        assertTrue(checkNumber(randomNumbers.get(0)));
        assertTrue(checkNumber(randomNumbers.get(1)));
        assertTrue(checkNumber(randomNumbers.get(2)));
    }

    @Test
    void randomNumberClassTest(){
        RandomNumber randomNumber = new RandomNumber();

        assertTrue(checkNumber(randomNumber.getRandomNumber(),0));
        assertTrue(checkNumber(randomNumber.getRandomNumber(),1));
        assertTrue(checkNumber(randomNumber.getRandomNumber(),2));

    }

    boolean checkNumber(int number) {
        return number > 0 && number < 10;
    }

    boolean checkNumber(List<Integer> numberList, int index) {
        return numberList.get(index) > 0 && numberList.get(index) < 10;
    }

}