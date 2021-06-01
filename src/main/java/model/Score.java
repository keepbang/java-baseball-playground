package model;

import utils.ConstantValue;

public class Score implements ConstantValue {
    private int ball = 0;
    private int strike = 0;

    public void addBall(ScoreStatus status){
        if(status.isBall()) {
            this.ball += 1;
        }
    }

    public void addStrike(ScoreStatus status){
        if(status.isStrike()) {
            this.strike += 1;
        }
    }

    public int ballCount(){
        return this.ball;
    }

    public int strikeCount(){
        return this.strike;
    }

    public boolean isNothing(){
        return ballCount() == 0 && strikeCount() == 0;
    }

    public boolean isGameEnd(){
        return strikeCount() >= THREE_STRIKE;
    }
}
