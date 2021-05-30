package model;

public class Score {
    private int ball;
    private int strike;

    public Score(){}

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
}
