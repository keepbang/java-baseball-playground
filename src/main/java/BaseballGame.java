import model.*;
import view.InputVIew;
import view.OutputView;

public class BaseballGame {
    public static void main(String[] args) {
        OutputView output = new OutputView();
        InputVIew input = new InputVIew();
        ComBaseball comBaseball = new ComBaseball();

        GameResult gameStatus = GameResult.RESET;
        
        while(!gameStatus.isEndGame()) {

            gameStatus = comBaseball.resetBall(gameStatus);

            String number = input.numberString();

            PlayerBaseball playerBaseball = new PlayerBaseball(number);

            Score score = playerBaseball.play(comBaseball.getInningList());

            output.showResult(score);

            gameStatus = playerBaseball.gameResult();

            gameStatus = input.endGameInput(gameStatus.isEndGame());

        }
    }
}
