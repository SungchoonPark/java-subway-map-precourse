package subway.view;

import subway.domain.station.Station;
import subway.message.InfoMessage;

import java.util.List;

public class OutputView {

    public void printExceptionMessage(String message) {
        System.out.println(message + "\n");
    }

    public void printInfoMessage(String infoMessage) {
        System.out.println(infoMessage + "\n");
    }

    public void printStations(List<Station> stations) {
        for (Station station : stations) {
            System.out.println(InfoMessage.makeInfoMessage(station.getName()));
        }
        System.out.println();
    }
}
