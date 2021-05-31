package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationUtilsTest {

    @Test
    @DisplayName("숫자_1_9_검사")
    void 숫자_1_9_검사(){
        assertThat(ValidationUtils.validNumber(9)).isTrue();
        assertThat(ValidationUtils.validNumber(1)).isTrue();
        assertThat(ValidationUtils.validNumber(0)).isFalse();
        assertThat(ValidationUtils.validNumber(10)).isFalse();
    }
}
