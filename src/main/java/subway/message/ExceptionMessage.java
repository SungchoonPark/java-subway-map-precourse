package subway.message;

public enum ExceptionMessage {
    COMMON_ERROR("[ERROR] "),
    INVALID_FUNCTION_NUM("올바르지 않은 기능 입니다."),
    DUPLICATE_STATION("역 이름이 중복됩니다."),
    INVALID_STATION_NAME_LENGTH("역 이름은 2글자 이상이어야 합니다.");


    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return COMMON_ERROR.message + message;
    }
}
