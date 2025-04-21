import input.CalculatorExecutor;
import input.InputVerify;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //숫자 입력
        String n1 = InputVerify.getValidInput(scanner, "첫 번째 숫자를 입력하세요 (0 이상): ");
        String n2 = InputVerify.getValidInput(scanner, "두 번째 숫자를 입력하세요 (0 이상): ");

        //사칙연산 기호 입력
        System.out.print("사칙연산 기호를 입력하시오 : ");
        char op = scanner.next().charAt(0);

        //계산
        CalculatorExecutor.execute(n1, n2, op);

        //계속할지 여부 확인
        System.out.println("더 계산하시겠습니까? (y/n)");
        scanner.nextLine();
        String answer = scanner.nextLine();
        if(answer.equals("no")) {
            System.out.println(cal.getResult());
        }
        else if(answer.equals("no")){

            }
            else throw new IllegalArgumentException("y/n으로만 답할 수 있습니다.");
        }

        //계산결과 삭제
        while(true) {
            System.out.println("첫 번째 계산결과를 삭제하시겠습니까?(y/n)");
            String answer = scanner.nextLine();

            try{
                if (answer.equals("yes")) {
                    if(cal.getResult() == null)
                        System.out.println("저장된 계산결과가 없습니다.");
                    cal.removeResults();
                    System.out.println(cal.getResult());
                } else if (answer.equals("no")) break;
            }
            catch (IllegalArgumentException e){
                System.out.println("y/n으로만 답할 수 있습니다.");};
        }
}