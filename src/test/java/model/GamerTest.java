package model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GamerTest {

    @Test
    void 숫자_비교_ball(){
        Gamer gamer = new Gamer();

        ArrayList<Integer> list = new ArrayList<>(Stream.of(4,3,5).collect(Collectors.toList()));
        int number = 123;

        Score score = gamer.checkNumber(list, number);

        assertEquals(score.ballCount(), 1);
    }

    @Test
    void 숫자_비교_strike(){
        Gamer gamer = new Gamer();

        ArrayList<Integer> list = new ArrayList<>(Stream.of(4,3,5).collect(Collectors.toList()));
        int number = 235;

        Score score = gamer.checkNumber(list, number);

        assertEquals(score.strikeCount(), 2);
    }

    @Test
    void 숫자_비교_strike_ball(){
        Gamer gamer = new Gamer();

        ArrayList<Integer> list = new ArrayList<>(Stream.of(4,3,5).collect(Collectors.toList()));
        int number = 456;

        Score score = gamer.checkNumber(list, number);

        assertEquals(score.strikeCount(), 1);
        assertEquals(score.ballCount(), 1);
    }

}