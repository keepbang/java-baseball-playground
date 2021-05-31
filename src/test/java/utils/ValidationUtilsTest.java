package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationUtilsTest {

    @Test
    @DisplayName("숫자_1_9_검사")
    void 숫자_1_9_검사(){
        assertThat(ValidationUtils.validNum(9)).isTrue();
        assertThat(ValidationUtils.validNum(1)).isTrue();
        assertThat(ValidationUtils.validNum(0)).isFalse();
        assertThat(ValidationUtils.validNum(10)).isFalse();
    }

    @Test
    @DisplayName("숫자_3자리_검사")
    void 숫자_3자리_검사(){
        assertThat(ValidationUtils.validLength(100)).isTrue();
        assertThat(ValidationUtils.validLength(999)).isTrue();
        assertThat(ValidationUtils.validLength(99)).isFalse();
        assertThat(ValidationUtils.validLength(1000)).isFalse();
    }
}
