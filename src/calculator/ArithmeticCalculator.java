package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T extends Number> {
    private static List<Double> results = new ArrayList<>();

    //계산기 정의
    public double calculate(T n1, T n2, OperatorType op) {
        double a = n1.doubleValue();
        double b = n2.doubleValue();
        double result = 0;

        switch (op) {
            case PLUS:
                result = a + b;
                break;
            case MINUS:
                double r = a - b;
                if (r < 0) throw new ArithmeticException("결과가 음수입니다.");
                result = r;
                break;
            case MULTI:
                result = a * b;
                break;
            case DIVIDE:
                if(b == 0.0)
                    throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                result = a / b;
                break;
            default:
                System.out.println("올바른 연산자를 입력하시오.");
        }
        results.add(result);
        return result;
    }

    //getter
    public List<Double> getResults() {
        return results;
    }

    //setter
    public List<Double> setResults(List<Double> newResults) {
        this.results = newResults;
        return results;
    }

    //첫번째 인자 내용 삭제
    public void removeResults() {
        results.remove(0);
    }

    //컬렉션 필드에서 입력된 값보다 큰 값 반환
    public static void getResultsLargerThan(double input) {
        List<Double> filtered = results.stream()
                .filter(r -> r > input)
                .collect(Collectors.toList());
        System.out.println("결과 : " + filtered);
    }
}
