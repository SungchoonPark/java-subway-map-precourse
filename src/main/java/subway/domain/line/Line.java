package subway.domain.line;

public class Line {
    private String name;
    private LineStation stations;

    public Line(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 추가 기능 구현
}
