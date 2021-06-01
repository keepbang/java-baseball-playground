package model;

import org.junit.jupiter.api.Test;
import utils.ConstantValue;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballTest implements ConstantValue {

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
        ComBaseball baseball = new ComBaseball(new RandomNumber().getStringNumber());

        List<Inning> inningList1 = baseball.getInningList();

        assertThat(inningList1.size()).isEqualTo(MAX_ROUND);

        List<Inning> inningList2 = new ArrayList<>();

        inningList2.add(new Inning(1,4));
        inningList2.add(new Inning(2,2));
        inningList2.add(new Inning(3,5));

        assertThat(baseball.play(inningList2).gameResult()).isIn(GameResult.CONTINUE,GameResult.ENDGAME);
    }
}
