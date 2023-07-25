package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private final List<Ball> balls;

    public Balls(List<Integer> answer) {
        this.balls = getBalls(answer);
    }

    private static List<Ball> getBalls(List<Integer> answer) {
        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            balls.add(new Ball(i + 1, answer.get(i)));
        }
        return balls;
    }

    public BallStatus play(Ball userBall) {
        return balls.stream()
                .map(ball -> ball.play(userBall))
                .filter(BallStatus::isNotNothing)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("볼이 없습니다."));
    }
}
