package calculator.calculator;

import static org.assertj.core.api.Assertions.assertThat;

import calculator.Number;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberTest {

    @ParameterizedTest
    @ValueSource(strings = {" ", ""})
    public void 빈문자는_0으로취급(String value) {
        assertThat(Number.from(value)).isEqualTo(new Number(0));
    }
}