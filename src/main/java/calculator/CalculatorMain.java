package calculator;

import calculator.model.Calculator;
import calculator.view.InputView;

public class CalculatorMain {
    public static void main(String[] args) {
        String inputString = InputView.inputString();

        Calculator calculator = new Calculator(inputString);

        System.out.println(calculator.runProcess());
    }
}
