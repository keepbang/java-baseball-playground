package model;

import java.util.ArrayList;

public class Gamer {

    public Score checkNumber(ArrayList<Integer> computerNumbers, int number) {

        Score score = new Score();

        for (int i = computerNumbers.size() - 1; i > -1; i--) {
            int checkNum = number % 10;
            number /= 10;

            boolean isStrike = strikeCheck(computerNumbers.get(i), checkNum);

            score.addStrike(isStrike);

            score.addBall(ballCheck(computerNumbers, checkNum, isStrike));
        }

        return score;
    }

    private boolean strikeCheck(int computerNumber, int checkNum) {
        if (computerNumber == checkNum) {
            return true;
        }
        return false;
    }

    private boolean ballCheck(ArrayList<Integer> computerNumbers, int checkNum, boolean isStrike) {
        if (isStrike) {
            return false;
        }

        if (computerNumbers.contains(checkNum)) {
            return true;
        }

        return false;
    }

}

