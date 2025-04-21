package input;

import calculator.ArithmeticCalculator;

import java.util.Scanner;

public class ContinueChecker {
    private Scanner scanner;

    public ContinueChecker(Scanner scanner) {
        this.scanner = scanner;
    }

    public <T> boolean askToContinue(ArithmeticCalculator<T> calculator) {
        while (true) {
            System.out.println("더 계산하시겠습니까? (y/n)");
            String answer = scanner.nextLine();

            if (answer.equals("yes"))
                return true;
            else if (answer.equals("no")){
                System.out.println("최종 계산 결과 목록: " + calculator.getResults());
                return false;
            } else
                System.out.println("y/n으로만 답할 수 있습니다.");
        }
    }
}
