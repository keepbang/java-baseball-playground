package baseball.model;

import java.util.Arrays;
import java.util.stream.Stream;

public enum ScoreStatus {
    BALL{
        @Override
        public String result(Score score) {
            if(score.ballCount() != 0){
                return score.ballCount() + "볼 ";
            }
            return "";
        }
    }
    , STRIKE{
        @Override
        public String result(Score score) {
            if(score.strikeCount() != 0){
                return score.strikeCount() + "스트라이크 ";
            }
            return "";
        }
    }
    , NOTHING{
        @Override
        public String result(Score score) {
            if(score.isNothing()){
                return "Nothing";
            }
            return "";
        }
    };

    abstract public String result(Score score);

    public static Stream<String> getScoreStatus(Score score){
        return Arrays.stream(ScoreStatus.values())
                .map(scoreStatus -> scoreStatus.result(score));

    }

    public boolean isBall(){
        return this == BALL;
    };

    public boolean isStrike() { return this == STRIKE; }

    public boolean isNotNoting() {
        return this != NOTHING;
    }


}
