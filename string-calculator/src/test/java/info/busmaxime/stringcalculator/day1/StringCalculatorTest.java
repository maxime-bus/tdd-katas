package info.busmaxime.stringcalculator.day1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    @Test
    public void an_empty_string_should_return_0() throws Exception {
        assertThat(StringCalculator.add("")).isEqualTo(0);
    }
}
