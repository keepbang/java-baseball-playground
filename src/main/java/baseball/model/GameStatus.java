package baseball.model;

public enum GameStatus {
    RESET, ENDGAME , CONTINUE;

    public boolean isEndGame(){
        return this == ENDGAME;
    }

    public boolean isReset() { return this == RESET; }

    public boolean gameEndAudit(){
        if(this == ENDGAME){
            return true;
        }
        return false;
    }
    public static GameStatus getGameResult(String input) {
        if(input.isEmpty()){
            return CONTINUE;
        }

        if(input.equals("1")){
            return RESET;
        }

        return ENDGAME;
    }

}
