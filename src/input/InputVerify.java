package input;

import java.util.Scanner;

// 입력값이 0 이상인지 검증
public class InputVerify {
    public static String getValidInput(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine();
            try {
                double value = Double.parseDouble(input);
                if (value >= 0)
                    return input;
                else System.out.println("0 이상의 숫자만 입력 가능합니다.");
            } catch (NumberFormatException e) {
                System.out.println("숫자 형식이 아닙니다.");
            }
        }
    }
}
