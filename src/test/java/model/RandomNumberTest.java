package model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberTest {
    @Test
    void randomNumberTest(){
        RandomNumber randomNumber = new RandomNumber();

        List<Integer> randomNumbers = randomNumber.createRandomNumbers();

        assertEquals(3, randomNumbers.size(), "숫자의 Size가 3이 아닙니다.");

        assertTrue(checkNumber(randomNumbers.get(0)));
        assertTrue(checkNumber(randomNumbers.get(1)));
        assertTrue(checkNumber(randomNumbers.get(2)));
    }

    boolean checkNumber(int number){
        return number > 0 && number < 10;
    }

}