package model;

import utils.BaseballUtil;

import java.util.List;

import static model.ScoreStatus.*;

public class Baseball {

    private List<Inning> inningList;

    public List<Inning> getInningList(){
        return inningList;
    }

    public Baseball(String numberString){
        this.inningList = BaseballUtil.stringToInningList(numberString);
    }

    public Score play(List<Inning> playerInnings){
        Score score = new Score();
        for(Inning playerInning : playerInnings){
            ScoreStatus status = this.play(playerInning);
            score.addBall(status);
            score.addStrike(status);
        }
        return score;
    }

    public ScoreStatus play(Inning playerInning) {
        return inningList.stream()
                .map(myInning -> playerInning.play(myInning))
                .filter(ScoreStatus::isNotNoting)
                .findFirst()
                .orElse(NOTHING);
    }
}
