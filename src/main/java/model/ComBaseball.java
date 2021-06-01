package model;

public class ComBaseball extends Baseball {

    public ComBaseball(String numberString){
        this.createBaseball(numberString);
    }

    public GameResult resetBall(GameResult status){
        if(status.isReset()){
            this.createBaseball(
                    new RandomNumber().getStringNumber());
        }

        return GameResult.CONTINUE;

    }
}
