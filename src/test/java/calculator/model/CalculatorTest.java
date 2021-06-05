package calculator.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "1",
            "32 *",
            "1 +ㅁ 22",
            "* 22 + 1",
            "0 *asdf 2 /f 7 * 2",
            " 23 / 2/ *",
            "- 3454 *"
    })
    @DisplayName("Calculator 객체 생성 실패 검증")
    void createCalculatorTest(String inputString){

        assertThatThrownBy(() -> new Calculator(inputString))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("잘못된 입력입니다.");

    }

}