import java.util.Scanner;
import input.CalculatorExecutor;
import input.InputVerify;
import input.RemoveResult;
import input.ContinueChecker;
import calculator.ArithmeticCalculator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContinueChecker check = new ContinueChecker(scanner);
        RemoveResult remove = new RemoveResult(scanner);
        ArithmeticCalculator<?> cal;

        while (true) {
            //숫자 입력
            String n1 = InputVerify.getValidInput(scanner, "첫 번째 숫자를 입력하시오 (n >= 0) : ");
            String n2 = InputVerify.getValidInput(scanner, "두 번째 숫자를 입력하시오 (n >= 0) : ");

            //사칙연산 기호 입력
            System.out.print("사칙연산 기호를 입력하시오 : ");
            char op = scanner.next().charAt(0);

            //계산
            cal = CalculatorExecutor.execute(n1, n2, op);

            //계속할지 여부 확인
            if (!check.askToContinue(cal)) break;
        }
        //계산결과 삭제
        remove.resultDelete(cal);

        // 입력값보다 큰 결과 출력
        System.out.print("특정 숫자보다 큰 결과를 확인하고 싶다면 숫자를 입력하시오 : ");
        try {
            double input = Double.parseDouble(scanner.nextLine());
            ArithmeticCalculator.getResultsLargerThan(input);
        } catch (NumberFormatException e) {
            System.out.println("유효한 숫자가 아닙니다.");
        }
    }
}