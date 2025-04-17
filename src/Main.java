import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArithmeticCalculator cal = new ArithmeticCalculator();
        int num1, num2;

        while(true) {
            //숫자 입력
            while(true) {
                System.out.print("첫번째 숫자를 입력하시오(n>=0) : ");
                num1 = scanner.nextInt();

                if(num1 < 0)
                    System.out.println("0 이상의 숫자를 입력하시오.");
                else break;
            }

            while(true){
                System.out.print("두번째 숫자를 입력하시오(n>=0) : ");
                num2 = scanner.nextInt();

                if(num2 < 0)
                    System.out.println("0 이상의 숫자를 입력하시오.");
                else break;
            }

            //사칙연산 기호 입력
            System.out.print("사칙연산 기호를 입력하시오 : ");
            char operator = scanner.next().charAt(0);
            OperatorType symbol = OperatorType.getOpType(operator);

            //결과
           System.out.println("결과: " + cal.calculate(num1, num2, symbol));

            //계속할지 여부 확인
            System.out.println("더 계산하시겠습니까? (y/n)");
            scanner.nextLine();
            String answer = scanner.nextLine();
            if(answer.equals("yes")) continue;
            else if(answer.equals("no")){
                System.out.println(cal.getResult());
                break;
            }
            else throw new IllegalArgumentException("y/n으로만 답할 수 있습니다.");
        }

        //계산결과 삭제
        while(true) {
            System.out.println("첫 번째 계산결과를 삭제하시겠습니까?(y/n)");
            String answer = scanner.nextLine();
            if (answer.equals("yes")) {
                cal.removeResults();
                System.out.println(cal.getResult());
            }
            else if (answer.equals("no")) break;
            else throw new IllegalArgumentException("y/n으로만 답할 수 있습니다.");
        }
    }
}