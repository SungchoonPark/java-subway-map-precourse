package subway.controller;

import subway.service.SubwayService;
import subway.view.InputView;
import subway.view.OutputView;

public class SubwayController {
    private final InputView inputView;
    private final OutputView outputView;
    private final SubwayService subwayService;

    public SubwayController(InputView inputView, OutputView outputView, SubwayService subwayService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.subwayService = subwayService;
    }

    public void run() {
        String functionNum = readFunctionNum();

    }

    private String readFunctionNum() {
        while (true) {
            try {
                return inputView.readFunctionNum();
            } catch (IllegalArgumentException e) {
                outputView.printExceptionMessage(e.getMessage());
            }
        }
    }
}