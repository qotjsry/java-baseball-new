package baseball;

import java.util.*;

public class BaseBallGame {

    public PlayResult gameStart() {
        System.out.println("게임을 시작합니다.");
        Balls balls = makeRandomNumbers();
        while(true){
            System.out.println("3가지 숫자를 1-9까지 입력해주세요 : ");
            PlayResult playResult = balls.play(makeUserNumberList());
            if(playResult.isGameEnd()){
                reGame();
                return playResult;
            }
            System.out.println(playResult.getBall() + "볼 " + playResult.getStrike() + "스트라이크");
        }
    }

    public void reGame(){
        System.out.println("정답입니다.");
        System.out.println("게임을 다시 시작하시려면 1번을 끝내시려면 그외 번호를 눌러주세요.");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input == 1){
            gameStart();
        }
    }
    private Balls makeRandomNumbers() {
        Random random = new Random();
        HashSet<Integer> computerNumberSet = new HashSet<>();

        while(computerNumberSet.size()<4){
            int randomNumber = random.nextInt(9)+1;
            computerNumberSet.add(randomNumber);
        }
        List<Integer> computerNumberList = new ArrayList<>(computerNumberSet);

        return new Balls(computerNumberList);
    }

    public List<Integer> inputNumber(List<Integer> userNumberList){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(userNumberList.contains(number)) {
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
            System.out.println("다음숫자를 입력해주세요");
        }
        return userNumberList;
    }
}
