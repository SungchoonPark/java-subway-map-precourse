package subway.domain.line;

import subway.domain.station.StationRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class LineRepository {
    private static final List<Line> lines = new ArrayList<>();

    static {
        lines.add(new Line("2호선", new LineStation(List.of(
                StationRepository.getStationByName("교대역"),
                StationRepository.getStationByName("강남역"),
                StationRepository.getStationByName("역삼역")
        ))));
        lines.add(new Line("3호선", new LineStation(List.of(
                StationRepository.getStationByName("교대역"),
                StationRepository.getStationByName("남부터미널역"),
                StationRepository.getStationByName("양재역"),
                StationRepository.getStationByName("매봉역")
        ))));
        lines.add(new Line("신분당선", new LineStation(List.of(
                StationRepository.getStationByName("강남역"),
                StationRepository.getStationByName("양재역"),
                StationRepository.getStationByName("양재시민의숲역")
        ))));
    }

    public static List<Line> lines() {
        return Collections.unmodifiableList(lines);
    }

    public static void addLine(Line line) {
        lines.add(line);
    }

    public static boolean deleteLineByName(String name) {
        return lines.removeIf(line -> Objects.equals(line.getName(), name));
    }
}
