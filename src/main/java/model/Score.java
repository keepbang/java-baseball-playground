package model;

public class Score {
    private int ball = 0;
    private int strike = 0;

    public void addBall(boolean isBall){
        if(isBall) {
            this.ball += 1;
        }
    }

    public void addStrike(boolean isStrike){
        if(isStrike) {
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
        return strikeCount() >= 3;
    }

}
