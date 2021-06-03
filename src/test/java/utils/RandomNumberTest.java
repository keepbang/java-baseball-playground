package utils;

import model.RandomNumber;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomNumberTest {

    @ParameterizedTest
    @ValueSource(ints = {100})
    void 랜덤_숫자_생성(int loop){

        for (int i = 0; i < loop; i++) {
            String numberStr = RandomNumber.createRandomNumbers();

            assertThat(ValidationUtil.validLength(numberStr)).isTrue();
        }

    }

}
