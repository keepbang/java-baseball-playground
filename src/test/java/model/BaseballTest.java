package model;

import baseball.model.GameResult;
import baseball.model.Inning;
import baseball.model.PlayerBaseball;
import baseball.model.RandomNumber;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballTest{

    @Test
    void 게임플레이어_볼_생성(){
        PlayerBaseball baseball = new PlayerBaseball("425");

        List<Inning> inningList1 = baseball.getInningList();
        List<Inning> inningList2 = new ArrayList<>();

        inningList2.add(new Inning(1,4));
        inningList2.add(new Inning(2,2));
        inningList2.add(new Inning(3,5));

        for (int i = 0; i < 3; i++) {
            assertThat(inningList1.get(i).getRound()).isEqualTo(inningList2.get(i).getRound());
            assertThat(inningList1.get(i).getRound()).isEqualTo(inningList2.get(i).getRound());
        }
    }

    @Test
    void 게임_결과_확인_검증(){
        PlayerBaseball computer = new PlayerBaseball(RandomNumber.getInstance());
        PlayerBaseball player = new PlayerBaseball("425");



        assertThat(player.play(computer.getInningList()).gameResult()).isIn(GameResult.CONTINUE,GameResult.ENDGAME);
    }
}
