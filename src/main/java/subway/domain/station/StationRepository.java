package subway.domain.station;

import subway.message.ExceptionMessage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class StationRepository {
    private static final List<Station> stations = new ArrayList<>();

    static {
        stations.add(new Station("교대역"));
        stations.add(new Station("강남역"));
        stations.add(new Station("역삼역"));
        stations.add(new Station("남부터미널역"));
        stations.add(new Station("양재역"));
        stations.add(new Station("양재시민의숲역"));
        stations.add(new Station("매봉역"));
    }

    public static List<Station> stations() {
        return Collections.unmodifiableList(stations);
    }

    public static void addStation(Station newStation) {
        if (stations.contains(newStation)) {
            throw new IllegalArgumentException(ExceptionMessage.DUPLICATE_STATION.getMessage());
        }

        stations.add(newStation);
    }

    public static boolean deleteStation(String name) {
        return stations.removeIf(station -> Objects.equals(station.getName(), name));
    }

    public static Station getStationByName(String stationName) {
        for (Station station : stations) {
            if (station.getName().equals(stationName)) return station;
        }

        return null;
    }
}
