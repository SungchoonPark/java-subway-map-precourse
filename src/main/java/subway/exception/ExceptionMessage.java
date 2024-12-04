package subway.exception;

public enum ExceptionMessage {
    COMMON_ERROR("[ERROR] "),
    INVALID_FUNCTION_NUM("올바르지 않은 기능 입니다.");


    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return COMMON_ERROR.message + message;
    }
}
