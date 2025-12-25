package org.example.calculator;

public class SubtractionOperator implements NewArithmeticOperator {
    @Override
    public boolean supports(String operator){
        return "-".equals(operator);
    }

    @Override
    public int calculate(int operand1, int oeprand2){
        return operand1 - oeprand2;
    }
}
