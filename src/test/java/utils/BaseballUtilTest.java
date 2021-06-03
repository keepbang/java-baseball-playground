package utils;

import model.Inning;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballUtilTest {

    @Test
    void string_number를_Stream으로_변환(){


        List<Inning> inningList1 = new ArrayList<>();

        inningList1.add(new Inning(1,5));
        inningList1.add(new Inning(2,3));
        inningList1.add(new Inning(3,2));

        List<Inning> inningList2 = BaseballUtil.stringToInningList("532");

        for (int i = 0; i < 3; i++) {
            assertThat(inningList1.get(i).getRound()).isEqualTo(inningList2.get(i).getRound());
            assertThat(inningList1.get(i).getBatting()).isEqualTo(inningList2.get(i).getBatting());
        }
    }

}
