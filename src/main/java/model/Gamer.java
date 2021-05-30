package model;

import view.InputView;
import view.OutputVIew;

import java.util.List;

public class Gamer {

    private boolean gameState = true;

    public void playGame(List<Integer> computerNumbers){
        InputView input = new InputView();
        OutputVIew output = new OutputVIew();
        Baseball baseball = new Baseball();

        while(gameState){
            output.number();
            int number = input.number();

            Score score = baseball.checkNumber(computerNumbers, number);


        }

    }

}

