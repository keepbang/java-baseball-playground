import model.*;
import utils.ValidationUtil;
import view.InputVIew;
import view.OutputView;

import java.util.Optional;

public class BaseballGame {
    public static void main(String[] args) {
        OutputView output = new OutputView();
        InputVIew input = new InputVIew();
        ComBaseball comBaseball = new ComBaseball();

        GameResult gameStatus = GameResult.RESET;
        
        while(!gameStatus.isEndGame()) {

            comBaseball.resetBall(gameStatus);

            boolean valid = false;
            String numberString = "";

            output.number();

            while(!valid) {

                numberString =  input.numberString();

                valid = ValidationUtil.isInteger(numberString)
                        && ValidationUtil.validLength(numberString);

                output.retryMessage(valid);

            }


            PlayerBaseball playerBaseball = new PlayerBaseball(numberString);

            Score score = playerBaseball.play(comBaseball.getInningList());

            output.showResult(score);

            gameStatus = score.gameResult();

            String gameEndInput = input.gameEndInput(output.retryGameMessage(gameStatus.gameEndAudit()));

            gameStatus = comBaseball.getGameResult(gameEndInput);

        }
    }
}
