package operator;

public class DoubleCalculator implements CalculatorOperator<Double> {
    @Override
    public Double sum(Double a, Double b) {
        return a + b;
    }

    @Override
    public Double sub(Double a, Double b) {
        return a - b;
    }

    @Override
    public Double multi(Double a, Double b) {
        return a * b;
    }

    @Override
    public Double div(Double a, Double b) {
        if (b == 0.0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
        return a / b;
    }
}
