package model;

import utils.NumberValidationUtils;

import static model.ScoreStatus.*;

public class Inning {
    private int round;
    private int batting;

    private int getRound() {
        return this.round;
    }

    private int getBatting() {
        return this.batting;
    }

    private boolean isBall(Inning inning){
        return getRound() != inning.getRound() && getBatting() == inning.getBatting();
    }

    private boolean isStrike(Inning inning){
        return getRound() == inning.getRound() && getBatting() == inning.getBatting();
    }

    public Inning(int round, int batting){
        this.round = round;
        this.batting = batting;
    }

    public ScoreStatus play(Inning inning) {
        if(isBall(inning)){
            return BALL;
        }
        if(isStrike(inning)){
            return STRIKE;
        }
        return NOTHING;
    }
}
