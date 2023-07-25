package baseball;

public class PlayResult {
    int strike = 0;
    int ball = 0;
    public int getStrike() {
        return strike;
    }
    public int getBall() {
        return ball;
    }

    public void report(BallStatus ballStatus) {
        if (ballStatus.isStrike()) {
            this.strike += 1;
        }
        if (ballStatus.isBall()) {
            this.ball += 1;
        }
    }

    public boolean isGameEnd() {
        return strike == 3;
    }
}
