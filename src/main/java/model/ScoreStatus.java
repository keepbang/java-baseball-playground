package model;

public enum ScoreStatus {
    STRIKE, NOTHING, BALL;

    public boolean isBall(){
        return this == BALL;
    };

    public boolean isStrike() {
        return this == STRIKE;
    }

    public boolean isNotNoting() {
        return this != NOTHING;
    }
}
