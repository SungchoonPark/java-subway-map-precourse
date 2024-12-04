package subway;

import subway.controller.SubwayController;
import subway.domain.line.Line;
import subway.domain.line.LineRepository;
import subway.domain.station.Station;
import subway.domain.station.StationRepository;
import subway.service.SubwayService;
import subway.view.InputView;
import subway.view.OutputView;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO: 프로그램 구현

        SubwayController subwayController = new SubwayController(
                new InputView(),
                new OutputView(),
                new SubwayService()
        );

        subwayController.run();
    }
}
