package baseball;

import baseball.model.ComBaseball;
import baseball.model.GameResult;
import baseball.model.PlayerBaseball;
import baseball.model.Score;
import baseball.view.InputVIew;
import baseball.view.OutputView;

import static baseball.model.ScoreStatus.getScoreStatus;

public class BaseballGame {
    public static void main(String[] args){
        OutputView output = new OutputView();
        InputVIew input = new InputVIew();
        ComBaseball comBaseball = new ComBaseball();

        GameResult gameStatus = GameResult.RESET;
        
        while(!gameStatus.isEndGame()) {

            comBaseball.resetBall(gameStatus);

            output.number();
            PlayerBaseball playerBaseball = new PlayerBaseball(input.numberString());

            Score score = playerBaseball.play(comBaseball);

            output.showResult(getScoreStatus(score));

            gameStatus = score.gameResult();

            String gameEndInput = input.gameEndInput(output.retryGameMessage(gameStatus.gameEndAudit()));

            gameStatus = comBaseball.getGameResult(gameEndInput);

        }
    }
}
