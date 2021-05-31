package model;

import static model.ScoreStatus.*;

public class Inning {
    private int round;
    private int batting;

    private boolean isBall(Inning inning){
        return getRound() != inning.getRound() && getBatting() == inning.getBatting();
    }

    private boolean isStrike(Inning inning){
        return getRound() == inning.getRound() && getBatting() == inning.getBatting();
    }

    public int getRound() {
        return this.round;
    }

    public int getBatting() { return this.batting; }

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
