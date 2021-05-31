package model;

import view.OutputView;

import java.util.List;

public class Baseball {

    public boolean checkNumber(List<Integer> computerNumbers, int number) {

        OutputView output = new OutputView();

        Score score = new Score();

        for (int i = computerNumbers.size() - 1; i > -1; i--) {
            int checkNum = number % 10;
            number /= 10;

            boolean isStrike = strikeCheck(computerNumbers.get(i), checkNum);

            score.addStrike(isStrike);

            score.addBall(ballCheck(computerNumbers, checkNum, isStrike));
        }

        if(score.isGameEnd()){
            output.gameEnd();
            return false;
        }

        output.showResult(score);
        return true;
    }

    private boolean strikeCheck(int computerNumber, int checkNum) {
        if (computerNumber == checkNum) {
            return true;
        }
        return false;
    }

    private boolean ballCheck(List<Integer> computerNumbers, int checkNum, boolean isStrike) {
        if (isStrike) {
            return false;
        }

        if (computerNumbers.contains(checkNum)) {
            return true;
        }

        return false;
    }

}
