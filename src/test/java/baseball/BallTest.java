package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {
    Ball comBall;

    @BeforeEach
    void setUp() {
        comBall = new Ball(1,4);
    }
    @Test
    void nothing() {
        BallStatus ballStatus = comBall.play(new Ball(2,5));
        assertThat(ballStatus).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void ball() {
        BallStatus ballStatus = comBall.play(new Ball(2,4));
        assertThat(ballStatus).isEqualTo(BallStatus.BALL);
    }

    @Test
    void strike() {
        BallStatus ballStatus = comBall.play(new Ball(1,4));
        assertThat(ballStatus).isEqualTo(ballStatus.STRIKE);
    }
}
