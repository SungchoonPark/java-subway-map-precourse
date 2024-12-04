package subway.view;

import subway.message.ExceptionMessage;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public String readMainFunctionNum() {
        printMainMessage();
        String functionNum = readFunctionNum();
        checkValidMainFunctionInput(functionNum);

        return functionNum;
    }

    public String readStationFunctionNum() {
        printStationMessage();
        String functionNum = readFunctionNum();
        checkValidStationAndLineFunctionInput(functionNum);

        return functionNum;
    }

    public String readLineFunctionNum() {
        printLineMessage();
        String functionNum = readFunctionNum();
        checkValidStationAndLineFunctionInput(functionNum);

        return functionNum;
    }

    public String readRangeFunctionNum() {
        printRangeMessage();
        String functionNum = readFunctionNum();
        checkValidRangeFunctionInput(functionNum);

        return functionNum;
    }

    public String readRegisterStationName() {
        System.out.println("\n## 등록할 역 이름을 입력하세요.");
        String stationName = scanner.nextLine();
        checkValidStationName(stationName);

        return stationName;
    }

    public String readDeleteStationName() {
        System.out.println("\n## 삭제할 역 이름을 입력하세요.");
        return scanner.nextLine();
    }

    private void checkValidStationName(String stationName) {
        if (stationName.length() < 2) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_STATION_NAME_LENGTH.getMessage());
        }
    }

    private void printRangeMessage() {
        System.out.println("\n## 구간 관리 화면\n" +
                "1. 구간 등록\n" +
                "2. 구간 삭제\n" +
                "B. 돌아가기");
    }

    private String readFunctionNum() {
        printFunctionMessage();
        String functionNum = scanner.nextLine();
        return functionNum;
    }

    private void printStationMessage() {
        System.out.println("\n## 역 관리 화면\n" +
                "1. 역 등록\n" +
                "2. 역 삭제\n" +
                "3. 역 조회\n" +
                "B. 돌아가기");
    }

    private void printLineMessage() {
        System.out.println("\n## 노선 관리 화면\n" +
                "1. 노선 등록\n" +
                "2. 노선 삭제\n" +
                "3. 노선 조회\n" +
                "B. 돌아가기");
    }

    private void printMainMessage() {
        System.out.println("## 메인 화면\n" +
                "1. 역 관리\n" +
                "2. 노선 관리\n" +
                "3. 구간 관리\n" +
                "4. 지하철 노선도 출력\n" +
                "Q. 종료");
    }

    private void printFunctionMessage() {
        System.out.println("\n## 원하는 기능을 선택하세요.");
    }

    private void checkValidMainFunctionInput(String functionNum) {
        if (!functionNum.matches("[1234Q]")) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_FUNCTION_NUM.getMessage());
        }
    }

    private void checkValidStationAndLineFunctionInput(String functionNum) {
        if (!functionNum.matches("[123B]")) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_FUNCTION_NUM.getMessage());
        }
    }

    private void checkValidRangeFunctionInput(String functionNum) {
        if (!functionNum.matches("[12B]")) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_FUNCTION_NUM.getMessage());
        }
    }
}
