package calculator.utils;

import java.util.LinkedList;
import java.util.Queue;

public class StringUtils {

    public static Queue<String> convertorStringToQueue(String inputLine){

        Queue<String> queue = new LinkedList<>();

        for (String s : inputLine.split(" ")) {
            validInputString(queue.size(), s);
            queue.offer(s);
        }

        if(queue.size() < 3){
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }

        return queue;
    }

    private static void validInputString(int size, String s){

        boolean isInteger = size % 2 == 0 && !ValidationUtils.isInteger(s);
        boolean isOperator = size % 2 == 1 && !ValidationUtils.isOperator(s);

        if(isInteger || isOperator){
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }

    }

}
