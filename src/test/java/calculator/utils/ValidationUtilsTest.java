package calculator.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ValidationUtilsTest {

    @ParameterizedTest
    @CsvSource({
            "123,true",
            "34a,false",
            "1+3,false",
            "1 3,false"
    })
    @DisplayName("정수형 검증")
    void IntegerCheck(String numberString, boolean valid){
        assertThat(ValidationUtils.isInteger(numberString)).isEqualTo(valid);
    }

    @ParameterizedTest
    @CsvSource({
            "+,true", "-,true", "/,true", "*, true"
            ,"+-,false","*-1,false"," /kcj,false","-+*/,false"
            ,"3,false","a,false"
    })
    @DisplayName("연산자 검증")
    void operatorCheck(String operator, boolean valid){
        assertThat(ValidationUtils.isOperator(operator)).isEqualTo(valid);
    }
}
