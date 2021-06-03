package view;

import java.util.Scanner;

//로직 다른곳으로 이
public class InputVIew {
    private final Scanner scanner = new Scanner(System.in);

    public String numberString(){
        return scanner.next();
    }

    public String gameEndInput(boolean audit){
        if(audit){
            return scanner.next();
        }
        return "";
    }


}
