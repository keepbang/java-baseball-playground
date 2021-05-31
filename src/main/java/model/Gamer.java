package model;

import view.InputView;
import view.OutputView;

import java.util.List;

public class Gamer extends Baseball {

    InputView input = new InputView();

    OutputView output = new OutputView();

    public void playGame(List<Integer> computerNumbers) {
        boolean gameState = true;

        while (gameState) {
            output.number();
            int number = input.number();

            gameState = checkNumber(computerNumbers, number);

        }

    }

}

