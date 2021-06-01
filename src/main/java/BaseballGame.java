import model.*;
import view.InputVIew;
import view.OutputView;

public class BaseballGame {
    public static void main(String[] args) {
        OutputView output = new OutputView();
        InputVIew input = new InputVIew();
        ComBaseball comBaseball = null;

        GameResult gameStatus = GameResult.RESET;
        
        while(!gameStatus.isEndGame()) {

            if(gameStatus.isReset()) {
                comBaseball = new ComBaseball(new RandomNumber().getStringNumber());
                gameStatus = GameResult.CONTINUE;
            }
            String number = input.numberString();

            PlayerBaseball playerBaseball = new PlayerBaseball(number);

            Score score = playerBaseball.play(comBaseball);

            output.showResult(score);

            gameStatus = score.gameResult();

            if(gameStatus.isEndGame()){
                gameStatus = input.endGameInput();
            }
        }



    }
}
