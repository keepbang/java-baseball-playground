package utils;

import model.RandomNumber;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomNumberTest {

    @Test
    void 랜덤_숫자_생성(){
        RandomNumber randomNumber = new RandomNumber();

        String numberStr = randomNumber.getStringNumber();
        int number = Integer.parseInt(numberStr);

        assertThat(ValidationUtil.validLength(numberStr)).isTrue();

        for (int i = 0; i < numberStr.length(); i++) {
            int num = number % 10;
            number /= 10;
            assertThat(ValidationUtil.validNum(num)).isTrue();
        }



    }

}
