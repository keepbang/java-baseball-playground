package model;

import baseball.model.ComBaseball;
import baseball.model.PlayerBaseball;
import baseball.model.Score;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ScoreTest {

    @ParameterizedTest
    @CsvSource({
            "214,421,3,0",
            "123,256,1,0",
            "123,253,1,1",
            "643,346,2,1",
            "829,879,0,2"
    })
    @DisplayName("볼 스트라이크 카운팅 검")
    void 야구_점수_점수_검증(String numberString1, String numberString2, int ballCount, int strikeCound){
        Score score = createBaseball(numberString1,numberString2);
        assertEquals(score.ballCount(), ballCount);
        assertEquals(score.strikeCount(), strikeCound);
        assertThat(score.isGameEnd()).isFalse();
    }

    @ParameterizedTest
    @CsvSource({
            "123,456"
    })
    void 야구_점수_낫싱(String numberString1, String numberString2){
        Score score = createBaseball(numberString1, numberString2);
        assertThat(score.isNothing()).isTrue();
        assertThat(score.isGameEnd()).isFalse();
    }

    @ParameterizedTest
    @CsvSource({
            "345,345,3"
    })
    @DisplayName("3 스트라이크 검증(게임종료)")
    void 야구_점수_3스트라이크(String numberString1, String numberString2, int strikeCount){
        Score score = createBaseball(numberString1, numberString2);
        assertEquals(score.strikeCount(), strikeCount);
        assertThat(score.isGameEnd()).isTrue();
    }

    Score createBaseball(String s1, String s2){
        ComBaseball computer = new ComBaseball();
        computer.createBaseball(s1);

        PlayerBaseball player = new PlayerBaseball(s2);

        return player.play(computer);
    }

}