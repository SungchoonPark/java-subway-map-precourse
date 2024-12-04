package subway.controller;

import subway.message.InfoMessage;
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
        while(true) {
            try{
                String functionNum = readMainFunctionNum();

                if (functionNum.equals("1")) {
                    processStationManaging();
                }

                if (functionNum.equals("2")) {
                    processLineManaging();
                }

                if (functionNum.equals("3")) {
                    processRangeManaging();
                }

                if (functionNum.equals("4")) {
                    // Todo : 서비스에서 노선도 정보 받아오기
                    // 받아온 노선도 정보를 outputView에서 출력
                }

                if (functionNum.equals("Q")) {
                    // 종료
                    // Todo : OUtputview에서 종료 메시지 출력 -> break;
                }
            } catch (IllegalArgumentException e) {
                outputView.printExceptionMessage(e.getMessage());
            }
        }
    }

    private String processRangeManaging() {
        while (true) {
            try {
                return inputView.readRangeFunctionNum();
            } catch (IllegalArgumentException e) {
                outputView.printExceptionMessage(e.getMessage());
            }
        }
    }

    private String processLineManaging() {
        while (true) {
            try {
                return inputView.readLineFunctionNum();
            } catch (IllegalArgumentException e) {
                outputView.printExceptionMessage(e.getMessage());
            }
        }
    }

    private String processStationManaging() {
        while (true) {
            try {
                String functionNum = inputView.readStationFunctionNum();

                if (functionNum.equals("1")) {
                    // Todo : 역 등록
                    String registerStationName = inputView.readRegisterStationName();
                    subwayService.addStation(registerStationName);
                    outputView.printInfoMessage(InfoMessage.REGIST_STATION_SUCCESS.getMessage());

                }

                if (functionNum.equals("2")) {
                    // Todo : 역 삭제
                    String deleteStationName = inputView.readDeleteStationName();
                    subwayService.deleteStation(deleteStationName);
                    outputView.printInfoMessage(InfoMessage.DELETE_STATION_SUCCESS.getMessage());
                }

                if (functionNum.equals("3")) {
                    // Todo : 역 조회
                }

                run();
            } catch (IllegalArgumentException e) {
                outputView.printExceptionMessage(e.getMessage());
            }
        }
    }

    private String readMainFunctionNum() {
        while (true) {
            try {
                return inputView.readMainFunctionNum();
            } catch (IllegalArgumentException e) {
                outputView.printExceptionMessage(e.getMessage());
            }
        }
    }

}
