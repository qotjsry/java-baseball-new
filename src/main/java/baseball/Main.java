package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Main {
    public static void main(String[] args) {
        BaseBallGame baseBallGame = new BaseBallGame();
        PlayResult playResult = baseBallGame.gameStart();
        System.out.println("playResult = " + playResult.getStrike());
        System.out.println("playResult = " + playResult.getBall());


    }

}