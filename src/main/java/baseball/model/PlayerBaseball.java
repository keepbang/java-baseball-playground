package baseball.model;

import java.util.List;

import static baseball.model.ScoreStatus.NOTHING;

public class PlayerBaseball extends Baseball {

    public PlayerBaseball(String numberString){
        this.createBaseball(numberString);
    }

    public Score play(List<Inning> comInningList){
        Score score = new Score();
        for(Inning comInning : comInningList){
            ScoreStatus status = this.play(comInning);
            score.addBall(status);
            score.addStrike(status);
        }

        return score;
    }

    public ScoreStatus play(Inning comInning) {
        return super.getInningList().stream()
                .map(myInning -> myInning.play(comInning))
                .filter(ScoreStatus::isNotNoting)
                .findFirst()
                .orElse(NOTHING);
    }


}
