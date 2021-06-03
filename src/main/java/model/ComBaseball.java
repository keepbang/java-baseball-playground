package model;

public class ComBaseball extends Baseball {

    public ComBaseball(String numberString){
        this.createBaseball(numberString);
    }

    public GameResult resetBall(GameResult status){
        if(status.isReset()){
            this.createBaseball(RandomNumber.getInstance());
        }

        return GameResult.CONTINUE;

    }
}
