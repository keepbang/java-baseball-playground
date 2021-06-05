package calculator.model;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum Operator {
    PLUS("+",(a,b) -> a + b),
    MINUS("-",(a,b) -> a - b),
    MULTIPLY("*",(a,b) -> a * b),
    DIVIDE("/",(a,b) -> a / b);

    private String operator;
    private BiFunction<Integer, Integer, Integer> calculationFn;

    Operator(String operator, BiFunction<Integer, Integer, Integer> calculationFn){
        this.operator = operator;
        this.calculationFn = calculationFn;
    }

    public int calculation(Integer a, Integer b){
        return calculationFn.apply(a,b);
    }

    public static Operator getOperator(String operator){
        return Arrays.stream(values())
                    .filter(f -> f.operator.equals(operator))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("잘못된 연산자 입니다."));
    }
}
