package model;

import java.util.List;

import static utils.BaseballUtil.*;
import static model.ScoreStatus.*;

public class Baseball {

    private List<Inning> inningList;

    public List<Inning> getInningList(){
        return inningList;
    }

    public void createBaseball(String numberString){
        this.inningList = stringToInningList(numberString);
    }

    public Score play(List<Inning> inningList){
        Score score = new Score();
        for(Inning playerInning : inningList){
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
