package model;

public class ComBaseball extends Baseball {

    public GameResult resetBall(GameResult status){
        if(status.isReset()){
            this.createBaseball(
                    new RandomNumber().getStringNumber());
        }

        return GameResult.CONTINUE;

    }
}
