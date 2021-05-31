package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberValidationUtilsTest {

    @Test
    @DisplayName("숫자_1_9_검사")
    void 숫자_1_9_검사(){
        assertThat(NumberValidationUtil.validNum(9)).isTrue();
        assertThat(NumberValidationUtil.validNum(1)).isTrue();
        assertThat(NumberValidationUtil.validNum(0)).isFalse();
        assertThat(NumberValidationUtil.validNum(10)).isFalse();
    }

    @Test
    @DisplayName("숫자_3자리_검사")
    void 숫자_3자리_검사(){
        assertThat(NumberValidationUtil.validLength(100)).isTrue();
        assertThat(NumberValidationUtil.validLength(999)).isTrue();
        assertThat(NumberValidationUtil.validLength(99)).isFalse();
        assertThat(NumberValidationUtil.validLength(1000)).isFalse();
    }

    @Test
    @DisplayName("Inning_라운드_숫자_검사")
    void 라운드_숫자_검사(){
        assertThat(NumberValidationUtil.validRoundNum(1)).isTrue();
        assertThat(NumberValidationUtil.validRoundNum(3)).isTrue();
        assertThat(NumberValidationUtil.validRoundNum(0)).isFalse();
        assertThat(NumberValidationUtil.validRoundNum(4)).isFalse();
    }
}
