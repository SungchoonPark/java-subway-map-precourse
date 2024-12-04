package subway.service;

import subway.domain.station.Station;
import subway.domain.station.StationRepository;
import subway.message.ExceptionMessage;

public class SubwayService {
    // 역 추가
    public void addStation(String stationName) {
        // Todo : 역 추가
        StationRepository.addStation(new Station(stationName));
    }

    // 역 삭제
    public void deleteStation(String deleteStationName) {
        // Todo : 역 삭제
        boolean isRemoved = StationRepository.deleteStation(deleteStationName);

        if (!isRemoved) {
            throw new IllegalArgumentException(ExceptionMessage.NOT_EXIST_STATION.getMessage());
        }
    }

    // 역 조회
    public void getStations() {
        // Todo : 역 조회
    }

    // 노선 추가
    public void addLine() {
        // Todo : 노선 추가
    }

    // 노선 삭제
    public void deleteLine() {
        // Todo : 노선 삭제
    }

    // 노선 조회
    public void getLines() {
        // Todo : 노선 조회
    }

    // 구간 내 역 추가
    public void addLineStation() {
        // Todo : 구간 내 역 추가
    }

    // 구간 내 역 삭제
    public void deleteLineStation() {
        // Todo : 구간 내 역 삭제
    }
}
