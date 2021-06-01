package utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationUtilsTest {

    @Test
    void 숫자_1_9_검사(){
        assertThat(ValidationUtil.validNum(9)).isTrue();
        assertThat(ValidationUtil.validNum(1)).isTrue();
        assertThat(ValidationUtil.validNum(0)).isFalse();
        assertThat(ValidationUtil.validNum(10)).isFalse();
    }

    @Test
    void 숫자_3자리_검사(){
        assertThat(ValidationUtil.validLength("100")).isTrue();
        assertThat(ValidationUtil.validLength("999")).isTrue();
        assertThat(ValidationUtil.validLength("99")).isFalse();
        assertThat(ValidationUtil.validLength("1000")).isFalse();
    }

    @Test
    void 문자열숫자_검증(){
        assertThat(ValidationUtil.isInteger("123")).isTrue();
        assertThat(ValidationUtil.isInteger("123asdf")).isFalse();
        assertThat(ValidationUtil.isInteger("123-453")).isFalse();
        assertThat(ValidationUtil.isInteger("-123")).isFalse();
        assertThat(ValidationUtil.isInteger("+23")).isFalse();
    }

}
