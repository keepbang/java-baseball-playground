package baseball.model;

public enum GameResult {
    RESET, ENDGAME, CONTINUE;

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

}
