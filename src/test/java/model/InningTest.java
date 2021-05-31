package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static model.ScoreStatus.*;

public class InningTest {

    @Test
    @DisplayName("야구_숫자_볼_체크")
    void 야구_숫자_볼_체크(){

        Inning computer = new Inning(1,3);

        assertThat(computer.play(new Inning(2,3))).isEqualTo(BALL);
    }

    @Test
    @DisplayName("야구_숫자_스트라이크_체크")
    void 야구_숫자_스트라이크_체크(){

        Inning computer = new Inning(2,5);

        assertThat(computer.play(new Inning(2,5))).isEqualTo(STRIKE);
    }

    @Test
    @DisplayName("야구_숫자_낫싱_체크")
    void 야구_숫자_낫싱_체크(){

        Inning computer = new Inning(2,2);

        assertThat(computer.play(new Inning(2,7))).isEqualTo(NOTHING);
    }
}