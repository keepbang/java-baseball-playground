package view;

import model.Score;

public class OutputView {
    public void number(){
        System.out.print("숫자를 입력해 주세요 : ");
    }

    public void retryMessage(boolean valid) {
        if(!valid){
            System.out.println("잘못된 숫자를 입력하였습니다.");
        }
    }

    public void showResult(Score score){
        if(score.ballCount() > 0) {
            System.out.print(score.ballCount() + "볼 ");
        }

        if(score.strikeCount() > 0) {
            System.out.print(score.strikeCount() + "스트라이크");
        }

        if(score.isNothing()){
            System.out.print("Nothing");
        }

        System.out.println();
    }

    public void endGameMessage(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
