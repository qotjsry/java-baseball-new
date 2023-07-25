package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {
    Balls comBalls;

    @BeforeEach
    void setup() {
        comBalls = new Balls(Arrays.asList(1, 2, 3));
    }

    @Test
    public void play() {
        //given
        //when
        PlayResult playResult= comBalls.play(Arrays.asList(4,5,6));
        //then
        assertThat(playResult.getStrike()).isEqualTo(0);
        assertThat(playResult.getBall()).isEqualTo(0);
    }

    @Test
    public void play_1strike_1ball () {
        //given
        //when
        PlayResult playResult= comBalls.play(Arrays.asList(1,4,2));
        //then
        assertThat(playResult.getStrike()).isEqualTo(1);
        assertThat(playResult.getBall()).isEqualTo(1);
    }

    @Test
    public void play_3strike () {
        //given
        //when
        PlayResult playResult= comBalls.play(Arrays.asList(1,2,3));
        //then
        assertThat(playResult.getStrike()).isEqualTo(3);
        assertThat(playResult.getBall()).isEqualTo(0);
        assertThat(playResult.isGameEnd()).isTrue();
    }

    @Test
    public void nothing() {
        //given
        //when
        BallStatus ballStatus = comBalls.play(new Ball(1, 4));
        //then
        assertThat(ballStatus).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    public void ball() {
        //given
        //when
        BallStatus ballStatus = comBalls.play(new Ball(2, 1));
        //then
        assertThat(ballStatus).isEqualTo(BallStatus.BALL);
    }

    @Test
    public void strike() {
        //given
        //when
        BallStatus ballStatus = comBalls.play(new Ball(1, 1));
        //then
        assertThat(ballStatus).isEqualTo(BallStatus.STRIKE);
    }
}
