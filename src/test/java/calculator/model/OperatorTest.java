package calculator.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class OperatorTest {

    @ParameterizedTest
    @CsvSource({
            "+","-","*","/"
    })
    @DisplayName("getOperator 메소드 성공")
    void getOperatorTest(String operator){
        assertThat(Operator.getOperator(operator)).isOfAnyClassIn(Operator.class);
    }

    @ParameterizedTest
    @CsvSource({
            "14"
            ,"-*"
            ,"*fs"
            ," / 0"
    })
    @DisplayName("getOperator 메소드 실패")
    void getOperatorFailTest(String operator){
        assertThatThrownBy(() -> Operator.getOperator(operator))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("잘못된 연산자 입니다.");
    }

}