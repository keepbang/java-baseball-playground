package view;

import model.GameResult;
import utils.ValidationUtil;

import java.util.Scanner;

public class InputVIew {
    private final Scanner scanner = new Scanner(System.in);
    private final OutputView output = new OutputView();

    public String numberString(){
        boolean valid = false;
        String numberString = "";

        while(!valid) {
            output.number();
            numberString = scanner.next();

            valid = ValidationUtil.isInteger(numberString)
                    && ValidationUtil.validLength(numberString);

            output.retryMessage(valid);

        }


        return numberString;
    }

    public GameResult endGameInput(){
        output.endGameMessage();

        String endGameStatus = scanner.next();

        if(endGameStatus.equals("1")){
            return GameResult.RESET;
        }

        return GameResult.ENDGAME;
    }
}
