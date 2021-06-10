package baseball.view;

import java.util.Scanner;

public class InputVIew {
    private final Scanner scanner = new Scanner(System.in);

    public String numberString(){
        return scanner.nextLine();
    }

    public String gameEndInput(boolean audit){
        if(audit){
            return scanner.nextLine();
        }
        return "";
    }


}
