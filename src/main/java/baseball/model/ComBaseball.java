package baseball.model;

public class ComBaseball extends Baseball {

    public void resetBall(GameStatus status){
        if(status.isReset()){
            super.createBaseball(RandomNumber.getInstance()
                                        .getNumberString());
        }
    }

}
