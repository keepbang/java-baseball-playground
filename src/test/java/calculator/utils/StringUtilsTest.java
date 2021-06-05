package calculator.utils;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Queue;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StringUtilsTest {

    @ParameterizedTest
    @CsvSource({
            "1 + 2,3",
            "2 - 11 * 1,5",
            "0 * 2 / 7 * 2,7"
    })
    void 문자_변환_성공(String inputString, int queueSize){
        Queue<String> queue = StringUtils.convertorStringToQueue(inputString);

        assertThat(queue.size()).isEqualTo(queueSize);
    }

    @ParameterizedTest
    @CsvSource({
            "1 +ㅁ 22",
            "22 + * 1",
            "0 *asdf 2 /f 7 * 2",
            " 23 / 2/ *",
            "3454",
            "3454 *",
            "- 3454 *"
    })
    void 문자_변환_실패(String inputString){

        assertThatThrownBy(() -> StringUtils.convertorStringToQueue(inputString))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("잘못된 입력입니다.");

    }

}