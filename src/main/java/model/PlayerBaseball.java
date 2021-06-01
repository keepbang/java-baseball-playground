package model;

import java.util.List;

import static model.GameResult.CONTINUE;
import static model.GameResult.ENDGAME;

public class PlayerBaseball extends Baseball {

    private Score score;

    public PlayerBaseball(String numberString){
        this.createBaseball(numberString);
        this.score = new Score();
    }

    @Override
    public Score play(List<Inning> inningList) {
        this.score = super.play(inningList);
        return score;
    }

    public GameResult gameResult() {
        if(score.isGameEnd()){
            return ENDGAME;
        }
        return CONTINUE;
    }
}
