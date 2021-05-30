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
    void istToIntNumberTest(){
        List<Integer> list = Arrays.asList(4,3,5);

        int number = list.stream()
                .mapToInt(
                        num -> num * (int) Math.pow(
                                10,
                                list.indexOf(num)
                        )
                )
                .reduce(0, Integer::sum);

        assertEquals(534, number);

    }

    boolean checkNumber(int number) {
        return number > 0 && number < 10;
    }

}