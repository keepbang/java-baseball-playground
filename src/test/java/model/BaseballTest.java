package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballTest {

    @Test
    @DisplayName("게임플레이어_볼_생성")
    void 게임플레이어_볼_생성(){
        Baseball baseball = new Baseball("425");

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
}
