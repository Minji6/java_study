package org.example;

import org.example.calculator.*;

import java.util.List;

public class Calculator {
    private static final List<NewArithmeticOperator> = List.of(new AddictionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());

    public static int calculate(int operand1, String operator, int operand2) {
        return ArithmeticOperator.calculate(operand1, operator, operand2);
    }
}
