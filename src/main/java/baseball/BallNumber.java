package baseball;

public class BallNumber {
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 9;

    int no;

    public BallNumber(int no) {
        if(no < MIN_NUMBER && no > MAX_NUMBER)
            throw new IllegalArgumentException("숫자는 1-9까지만 입력해 주세요");
        this.no = no;
    }


}
