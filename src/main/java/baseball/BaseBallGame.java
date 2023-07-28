package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BaseBallGame {

    public PlayResult gameStart() {
        System.out.println("게임을 시작합니다.");
        Balls balls = makeRandomNumbers();
        return balls.play(makeUserNumberList());
    }
    private Balls makeRandomNumbers() {
        Random random = new Random();
        int randomNumber = random.nextInt(9)+1;
        List<Integer> computerNumberList = new ArrayList<>();
        for(int i=0;i<3;i++){
            inputNumber(computerNumberList);
            System.out.println("computerNumberList = " + computerNumberList.get(i));
        }
        Balls balls = new Balls(computerNumberList);
        return balls;
    }

    public List<Integer> inputNumber(List<Integer> userNumberList){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(userNumberList.contains(number)){
            System.out.println("중복된 숫자입니다. 다시 입력해주세요.");
            return inputNumber(userNumberList);
        }
        userNumberList.add(number);
        return userNumberList;
    }
    public List<Integer> makeUserNumberList(){
        List<Integer> userNumberList = new ArrayList<>();
        for(int i=0;i<3;i++){
            inputNumber(userNumberList);
            System.out.println("userNumberList = " + userNumberList);
        }
        return userNumberList;
    }
}
