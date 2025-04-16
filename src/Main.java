import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            //숫자 입력
            System.out.print("첫번째 숫자를 입력하시오(n>0) : ");
            int n1 = scanner.nextInt();
            System.out.print("두번째 숫자를 입력하시오(n>0) : ");
            int n2 = scanner.nextInt();

            //사칙연산 기호 입력
            System.out.print("사칙연산 기호를 입력하시오 : ");
            char sign = scanner.next().charAt(0);

            boolean flag = true;

            //조건
            int result = 0;
            switch (sign) {
                case '+':
                    result = n1 + n2;
                    break;
                case '-':
                    result = n1 - n2;
                    break;
                case '*':
                    result = n1 * n2;
                    break;
                case '/':
                    if (n2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        flag = false;
                    }
                    else
                        result = n1 / n2;
                    break;
                default:
                    System.out.println("올바른 연산자를 입력하시오.");
                    flag = false;
                    break;
            }
            //결과
            if (flag) {System.out.println("결과: " + result);}

            //계속할지 여부 확인
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            scanner.nextLine();
            String answer = scanner.nextLine();
            if(answer.equals("exit"))
                break;
        }
    }
}