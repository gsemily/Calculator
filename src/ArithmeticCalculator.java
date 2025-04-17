import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {
    private List<Integer> results = new ArrayList<>();

    public int calculate(int n1, int n2, OperatorType op) {
        int result = 0;
        boolean flag = true;

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

    public List<Integer> getResult() {
        return results;
    }
    public List<Integer> setResults(List<Integer> newResults) {
        this.results = newResults;
        return results;
    }

    public void removeResults() {
        results.remove(0);
    }
}
