package model;

import baseball.model.PlayerBaseball;
import baseball.model.Score;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ScoreTest {

    @Test
    void 야구_점수_3볼(){
        Score score = createBaseball("214","421");
        assertEquals(score.ballCount(), 3);
        assertThat(score.isGameEnd()).isFalse();
    }

    @Test
    void 야구_점수_1볼(){
        Score score = createBaseball("123","256");
        assertEquals(score.ballCount(), 1);
        assertThat(score.isGameEnd()).isFalse();
    }

    @Test
    void 야구_점수_1볼_1스트라이크(){
        Score score = createBaseball("123","253");

        assertEquals(score.ballCount(), 1);
        assertEquals(score.strikeCount(), 1);
        assertThat(score.isGameEnd()).isFalse();
    }

    @Test
    void 야구_점수_2볼_1스트라이크(){
        Score score = createBaseball("643","346");

        assertEquals(score.ballCount(), 2);
        assertEquals(score.strikeCount(), 1);
        assertThat(score.isGameEnd()).isFalse();
    }

    @Test
    void 야구_점수_낫싱(){
        Score score = createBaseball("123","456");

        assertThat(score.isNothing()).isTrue();
        assertThat(score.isGameEnd()).isFalse();
    }

    @Test
    void 야구_점수_3스트라이크(){
        Score score = createBaseball("345","345");

        assertEquals(score.strikeCount(), 3);
        assertThat(score.isGameEnd()).isTrue();
    }

    Score createBaseball(String s1, String s2){
        PlayerBaseball computer = new PlayerBaseball(s1);
        PlayerBaseball player = new PlayerBaseball(s2);

        return player.play(computer.getInningList());
    }

}