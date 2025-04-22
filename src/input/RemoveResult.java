package input;

import java.util.Scanner;
import java.util.List;
import calculator.ArithmeticCalculator;

public class RemoveResult {
    private Scanner scanner;

    public RemoveResult(Scanner scanner) {
        this.scanner = scanner;
    }

    public void resultDelete(ArithmeticCalculator<?> cal) {
        while (true) {
            System.out.println("첫 번째 계산결과를 삭제하시겠습니까? (y/n)");
            String answer = scanner.nextLine();

            if (answer.equals("yes")) {
                List<Double> results = cal.getResults();

                if (results.isEmpty()) {
                    System.out.println("저장된 계산결과가 없습니다.");
                    break;
                } else {
                    cal.removeResults();
                    System.out.println("삭제 후 결과 목록: " + cal.getResults());
                }
            } else if (answer.equals("no")) {
                break;
            } else System.out.println("y/n으로만 답할 수 있습니다.");
        }
    }
}
