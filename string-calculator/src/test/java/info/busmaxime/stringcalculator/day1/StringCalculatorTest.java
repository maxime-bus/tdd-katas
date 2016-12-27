package info.busmaxime.stringcalculator.day1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    @Test
    public void an_empty_string_should_return_0() throws Exception {
        assertThat(StringCalculator.add("")).isEqualTo(0);
    }

    @Test
    public void a_string_that_contain_only_one_number_should_return_this_number() throws Exception {
        assertThat(StringCalculator.add("0")).isEqualTo(0);
        assertThat(StringCalculator.add("1")).isEqualTo(1);
        assertThat(StringCalculator.add("2")).isEqualTo(2);
    }

    @Test
    public void should_return_the_sum_if_string_contain_two_number_separated_by_comma() throws Exception {
        assertThat(StringCalculator.add("1,2")).isEqualTo(3);
        assertThat(StringCalculator.add("3,8")).isEqualTo(11);
    }

    @Test
    public void should_return_the_sum_for_any_number_contained_in_string_separated_by_comma() throws Exception {
        assertThat(StringCalculator.add("1,2,3")).isEqualTo(6);
        assertThat(StringCalculator.add("4,5,6")).isEqualTo(15);
    }
}
