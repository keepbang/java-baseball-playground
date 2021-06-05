package utils;

import baseball.utils.ValidationUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {
            "123", "456", "269"
    })
    void 숫자_1_9_검사_true(String numberString) {
        assertThat(ValidationUtil.validNum(numberString)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "023", "806", "960"
    })
    void 숫자_1_9_검사_false(String numberString) {
        assertThat(ValidationUtil.validNum(numberString)).isFalse();
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "999", "100"
    })
    void 숫자_3자리_검사_true(String numberString) {
        assertThat(ValidationUtil.validLength(numberString)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "99", "1000", "1"
    })
    void 숫자_3자리_검사_false(String numberString) {
        assertThat(ValidationUtil.validLength(numberString)).isFalse();
    }

    @Test
    void 문자열숫자_검증_true() {
        assertThat(ValidationUtil.isInteger("839")).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "123asdfa", "as90f0sa"
            , "123-123", "-123", "+54"
            , "980 ", "89 234", " 23425", " "
    })
    void 문자열숫자_검증_false(String numberString) {
        assertThat(ValidationUtil.isInteger(numberString)).isFalse();
    }
}
