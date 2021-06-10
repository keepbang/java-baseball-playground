package baseball.model;

import static baseball.model.ScoreStatus.NOTHING;
import static baseball.utils.ValidationUtil.*;

public class PlayerBaseball extends Baseball {

    public PlayerBaseball(String numberString){

        if(!validationNumberString(numberString)){
            throw new NumberFormatException("잘못된 숫자를 입력하였습니다.");
        }

        super.createBaseball(numberString);
    }

    public boolean validationNumberString(String numberString){
        return isInteger(numberString)
                && validLength(numberString)
                && validNum(numberString);
    }

    //List<Inning> 객체
    public Score play(ComBaseball comBaseball){
        Score score = new Score();

        for(Inning comInning : comBaseball.getInningList()){
            ScoreStatus status = this.play(comInning);
            score.addBall(status);
            score.addStrike(status);
        }

        return score;
    }

    public ScoreStatus play(Inning comInning) {
        return super.getInningList()
                .stream()
                .map(myInning -> myInning.play(comInning))
                .filter(ScoreStatus::isNotNoting)
                .findFirst()
                .orElse(NOTHING);
    }


}
