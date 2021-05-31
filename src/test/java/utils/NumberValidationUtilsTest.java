package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberValidationUtilsTest {

    @Test
    @DisplayName("숫자_1_9_검사")
    void 숫자_1_9_검사(){
        assertThat(NumberValidationUtils.validNum(9)).isTrue();
        assertThat(NumberValidationUtils.validNum(1)).isTrue();
        assertThat(NumberValidationUtils.validNum(0)).isFalse();
        assertThat(NumberValidationUtils.validNum(10)).isFalse();
    }

    @Test
    @DisplayName("숫자_3자리_검사")
    void 숫자_3자리_검사(){
        assertThat(NumberValidationUtils.validLength(100)).isTrue();
        assertThat(NumberValidationUtils.validLength(999)).isTrue();
        assertThat(NumberValidationUtils.validLength(99)).isFalse();
        assertThat(NumberValidationUtils.validLength(1000)).isFalse();
    }

    @Test
    @DisplayName("Inning_라운드_숫자_검사")
    void 라운드_숫자_검사(){
        assertThat(NumberValidationUtils.validRoundNum(1)).isTrue();
        assertThat(NumberValidationUtils.validRoundNum(3)).isTrue();
        assertThat(NumberValidationUtils.validRoundNum(0)).isFalse();
        assertThat(NumberValidationUtils.validRoundNum(4)).isFalse();
    }
}
