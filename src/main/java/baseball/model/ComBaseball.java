package baseball.model;

public class ComBaseball extends Baseball {

    public void resetBall(GameResult status){
        if(status.isReset()){
            this.createBaseball(RandomNumber.getInstance()
                                        .getNumberString());
        }
    }


    public GameResult getGameResult(String input) {
        if(input.isEmpty()){
            return GameResult.CONTINUE;
        }

        if(isReGame(input)){
            return GameResult.RESET;
        }

        return GameResult.ENDGAME;
    }

    private boolean isReGame(String input){
        return input.equals("1");
    }

}
