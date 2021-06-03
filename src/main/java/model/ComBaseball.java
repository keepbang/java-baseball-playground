package model;

public class ComBaseball extends Baseball {

    public GameResult resetBall(GameResult status){
        if(status.isReset()){
            this.createBaseball(RandomNumber.getInstance());
        }

        return GameResult.CONTINUE;

    }
}
