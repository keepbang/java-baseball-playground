package model;

public class ComBaseball extends Baseball {

    public void resetBall(GameResult status){
        if(status.isReset()){
            this.createBaseball(RandomNumber.getInstance());
        }
    }
}
