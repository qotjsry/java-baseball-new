package baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ValidationUtilsTest {

    @Test
    void 숫자_1_9_검증() {
        assertThat(ValidationUtils.isNumber(1)).isTrue();
        assertThat(ValidationUtils.isNumber(9)).isTrue();
        assertThat(ValidationUtils.isNumber(0)).isFalse();
        assertThat(ValidationUtils.isNumber(10)).isFalse();
    }

}
