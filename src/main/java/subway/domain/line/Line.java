package subway.domain.line;

public class Line {
    private String name;
    private LineStation stations;

    public Line(String name, LineStation stations) {
        this.name = name;
        this.stations = stations;
    }

    public String getName() {
        return name;
    }

    // 추가 기능 구현
}
