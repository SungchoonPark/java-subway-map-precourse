package subway.message;

public enum InfoMessage {
    COMMON_INFO("[INFO] "),

    REGIST_STATION_SUCCESS("지하철 역이 등록되었습니다."),
    DELETE_STATION_SUCCESS("지하철 역이 삭제되었습니다.");


    private final String message;

    InfoMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return COMMON_INFO.message + message;
    }

    public static String makeInfoMessage(String message) {
        return COMMON_INFO.message + message;
    }
}
