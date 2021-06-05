package baseball.view;

import java.util.stream.Stream;

public class OutputView {
    public void number(){
        System.out.print("숫자를 입력해 주세요 : ");
    }

    public void showResult(Stream<String> stringStream){
        stringStream.forEach(System.out::print);

        System.out.println();
    }

    public boolean retryGameMessage(boolean audit) {
        if(audit){
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            return true;
        }

        return false;

    }
}
