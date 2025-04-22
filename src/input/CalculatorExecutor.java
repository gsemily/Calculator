package input;

import calculator.OperatorType;
import calculator.ArithmeticCalculator;

// 숫자 형식 감지 및 결과 출력
public class CalculatorExecutor {
    public static ArithmeticCalculator<? extends Number> execute(String n1, String n2, char op) {
        OperatorType operator = OperatorType.getOpType(op);
        if (n1.contains(".") || n2.contains(".")) {
            //실수
            double double_1 = Double.parseDouble(n1);
            double double_2 = Double.parseDouble(n2);
            ArithmeticCalculator<Double> cal = new ArithmeticCalculator<>();
            double result = cal.calculate(double_1, double_2, operator);
            System.out.println("결과: " + result);
            return cal;
        } else {
            // 정수
            int int_1 = Integer.parseInt(n1);
            int int_2 = Integer.parseInt(n2);
            ArithmeticCalculator<Integer> cal = new ArithmeticCalculator<>();
            double result = cal.calculate(int_1, int_2, operator);
            System.out.println("결과: " + result);
            return cal;
        }
    }
}
