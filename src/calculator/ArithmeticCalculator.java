package calculator;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T> {
    private final CalculatorOperator<T> operator;
    private List<T> results = new ArrayList<>();

    public ArithmeticCalculator(CalculatorOperator<T> operator){
        this.operator = operator;
    }

    public T calculate(T n1, T n2, OperatorType op) {
        T result = null;
        switch (op) {
            case OperatorType.PLUS:
                result = operator.sum(n1, n2);
                break;
            case OperatorType.MINUS:
                result = operator.sub(n1, n2);
                break;
            case OperatorType.MULTI:
                result = operator.multi(n1, n2);
                break;
            case OperatorType.DIVIDE:
                result = operator.div(n1, n2);
                break;
            default:
                System.out.println("올바른 연산자를 입력하시오.");
        }
        results.add(result);
        return result;
    }

    //getter
    public List<T> getResult() {
        return results;
    }

    //setter
    public List<T> setResults(List<T> newResults) {
        this.results = newResults;
        return results;
    }

    //첫번째 인자 내용 삭제
    public void removeResults() {
        results.remove(0);
    }
}
