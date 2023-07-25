package baseball;

import java.util.Objects;

public class Ball {
    int position;
    BallNumber ballNo;
    public Ball(int position, int ballNo) {
        this.position = position;
        this.ballNo = new BallNumber(ballNo);
    }

    public BallStatus play(Ball ball) {
        if(this.equals(ball))
            return BallStatus.STRIKE;
        if(ball.matchValue(ballNo.no))
            return BallStatus.BALL;
        return BallStatus.NOTHING;
    }

    private boolean matchValue(int value) {
        if(this.ballNo.no == value)
            return true;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return position == ball.position && ballNo.no == ball.ballNo.no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, ballNo);
    }
}
