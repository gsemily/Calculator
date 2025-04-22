package input;

import java.util.Scanner;
import calculator.ArithmeticCalculator;

public class ContinueChecker {
    private Scanner scanner;

    public ContinueChecker(Scanner scanner) {
        this.scanner = scanner;
    }

    public boolean askToContinue(ArithmeticCalculator<?> cal) {
            System.out.print("더 계산하시겠습니까? (y/n): ");
            scanner.nextLine();
            String answer = scanner.nextLine();
            if (answer.equals("yes")) return true;
            else if (answer.equals("no")) {
                System.out.println("계산 결과 목록: " + cal.getResults());
                return false;
            }
            else throw new IllegalArgumentException("y/n으로만 답할 수 있습니다.");
    }
}
