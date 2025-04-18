public class DoubleCalculator {
    public double sum(double a, double b) { return a + b; }
    public double subtract(double a, double b) { return a - b; }
    public double multiply(double a, double b) { return a * b; }
    public double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
        return a / b;
    }
}
