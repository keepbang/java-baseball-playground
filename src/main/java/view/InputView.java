package view;

import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);

    public int number(){
        return scanner.nextInt();
    }

    public int inputGameState(){
        return scanner.nextInt();
    }
}
