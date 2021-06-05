package calculator.model;

import calculator.utils.StringUtils;

import java.util.Queue;

import static java.lang.Integer.parseInt;

public class Calculator {
    Queue<String> queue;

    public Calculator(String inputString){
        queue = StringUtils.convertorStringToQueue(inputString);
    }

    public int runProcess(){

        int firstNumber = parseInt(queue.poll());

        while(!queue.isEmpty()){
            Operator operator = Operator.getOperator(queue.poll());
            int secondNumber = parseInt(queue.poll());

            firstNumber = operator.calculation(firstNumber, secondNumber);
        }


        return firstNumber;

    }



}
