package org.example.calculator;

public class SubtractionOperator implements NewArithmeticOperator {
    @Override
    public boolean supports(String operator){
        return "-".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber operand1, PositiveNumber oeprand2){
        return operand1.toInt() - oeprand2.toInt();
    }
}
