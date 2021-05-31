package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomNubmerUtilTest {

    @Test
    @DisplayName("랜덤_숫자_생성")
    void 랜덤_숫자_생성(){
        RandomNumberUtil randomNumber = new RandomNumberUtil();

        String numberStr = randomNumber.getNumber();
        int number = Integer.parseInt(numberStr);

        assertThat(NumberValidationUtil.validLength(number)).isTrue();

        for (int i = 0; i < numberStr.length(); i++) {
            int num = number % 10;
            number /= 10;
            assertThat(NumberValidationUtil.validNum(num)).isTrue();
        }



    }

}
