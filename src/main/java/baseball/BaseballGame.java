package baseball;

import baseball.model.ComBaseball;
import baseball.model.GameStatus;
import baseball.model.PlayerBaseball;
import baseball.model.Score;
import baseball.view.InputVIew;
import baseball.view.OutputView;

import static baseball.model.GameStatus.getGameResult;
import static baseball.model.ScoreStatus.getScoreStatus;

public class BaseballGame {
    public static void main(String[] args){
        OutputView output = new OutputView();
        InputVIew input = new InputVIew();
        ComBaseball comBaseball = new ComBaseball();

        GameStatus gameStatus = GameStatus.RESET;
        
        while(!gameStatus.isEndGame()) {

            comBaseball.resetBall(gameStatus);

            output.number();
            PlayerBaseball playerBaseball = new PlayerBaseball(input.numberString());

            Score score = playerBaseball.play(comBaseball);

            output.showResult(getScoreStatus(score));

            gameStatus = score.gameResult();

            String gameEndInput = input.gameEndInput(output.retryGameMessage(gameStatus.gameEndAudit()));

            gameStatus = getGameResult(gameEndInput);

        }
    }
}
