import model.Gamer;
import model.RandomNumber;
import view.InputView;
import view.OutputView;

public class MainMethod {
    public static void main(String[] args) {

        OutputView output = new OutputView();
        InputView input = new InputView();
        int gameStatus = 1;

        while(gameStatus == 1){
            Gamer gamer = new Gamer();
            RandomNumber randomNumber = new RandomNumber();

            gamer.playGame(randomNumber.getRandomNumber());

            output.gameEnd();
            output.isGameReset();
            gameStatus = input.isGameReset();

        }
    }
}
