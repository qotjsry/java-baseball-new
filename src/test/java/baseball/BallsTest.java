package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BallsTest {
    Balls comBalls;

    @BeforeEach
    void setup() {
        comBalls = new Balls(Arrays.asList(1, 2, 3));
    }

    @Test
    public void nothing() {
        //given
        //when
        BallStatus ballStatus = comBalls.play(new Ball(1, 4));
        //then
        Assertions.assertThat(ballStatus).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    public void ball() {
        //given
        //when
        BallStatus ballStatus = comBalls.play(new Ball(2, 1));
        //then
        Assertions.assertThat(ballStatus).isEqualTo(BallStatus.BALL);
    }

    @Test
    public void strike() {
        //given
        //when
        BallStatus ballStatus = comBalls.play(new Ball(1, 1));
        //then
        Assertions.assertThat(ballStatus).isEqualTo(BallStatus.STRIKE);
    }
}
