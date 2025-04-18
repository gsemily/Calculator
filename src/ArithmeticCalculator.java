import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T> {
    private List<Double> results = new ArrayList<>();
    public ArithmeticCalculator(){}

    public T calculate(T n1, T n2, OperatorType op) {
        T result;
        //계산 조건
        switch (op) {
            case PLUS:
                result = n1 + n2;
                break;
            case MINUS:
                result = n1 - n2;
                break;
            case MULTI:
                result = n1 * n2;
                break;
            case DIVIDE:
                if (n2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return 0;
                }
                result = n1 / n2;
                break;
            default:
                System.out.println("올바른 연산자를 입력하시오.");
                return 0;
        }
        results.add(result);
        return result;
    }

    //getter
    public List<Double> getResult() {
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
}
