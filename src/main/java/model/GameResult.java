package model;

public enum GameResult {
    RESET, ENDGAME, CONTINUE;

    public boolean isContinue(){
        return this == CONTINUE;
    }
}
