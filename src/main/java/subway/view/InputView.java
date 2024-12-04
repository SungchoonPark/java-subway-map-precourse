package subway.view;

import subway.exception.ExceptionMessage;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public String readFunctionNum() {
        printMainMessage();
        String functionNum = scanner.nextLine();
        checkValidInput(functionNum);

        return functionNum;
    }

    private void printMainMessage() {
        System.out.println("## 메인 화면\n" +
                "1. 역 관리\n" +
                "2. 노선 관리\n" +
                "3. 구간 관리\n" +
                "4. 지하철 노선도 출력\n" +
                "Q. 종료");

        System.out.println("## 원하는 기능을 선택하세요.");
    }

    private void checkValidInput(String functionNum) {
        if (!functionNum.matches("[1234Q]")) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_FUNCTION_NUM.getMessage());
        }
    }
}
