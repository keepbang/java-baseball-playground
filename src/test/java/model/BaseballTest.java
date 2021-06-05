package model;

import baseball.model.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballTest{

    @ParameterizedTest
    @ValueSource(strings = {
            "425","123","938"
    })
    void 게임플레이어_볼_생성_성공(String numberString){
        PlayerBaseball baseball = new PlayerBaseball(numberString);

        InningList inningList2 = new InningList(numberString);

        for (int i = 0; i < 3; i++) {
            assertThat(baseball.getInningList().get(i).getRound())
                    .isEqualTo(inningList2.getList().get(i).getRound());
            assertThat(baseball.getInningList().get(i).getBatting())
                    .isEqualTo(inningList2.getList().get(i).getBatting());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "327","231","879"
    })
    void 게임_결과_확인_검증(String numberString){
        ComBaseball computer = new ComBaseball();

        computer.resetBall(GameResult.RESET);
        PlayerBaseball player = new PlayerBaseball(numberString);

        assertThat(player.play(computer).gameResult())
                .isIn(GameResult.CONTINUE,GameResult.ENDGAME);
    }
}
