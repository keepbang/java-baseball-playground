package calculator;

import calculator.model.Calculator;
import calculator.view.InputView;

public class CalculatorMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(InputView.inputString());

        System.out.println(calculator.runProcess());
    }
}
