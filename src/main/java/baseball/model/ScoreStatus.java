package baseball.model;


//여기서 출력까지 할수있따
//Map형태로 뽑을 수있다(values()사용)
public enum ScoreStatus {
    STRIKE, NOTHING, BALL;

    //abstract 사용

    public boolean isBall(){
        return this == BALL;
    };

    public boolean isStrike() { return this == STRIKE; }

    public boolean isNotNoting() {
        return this != NOTHING;
    }
}
