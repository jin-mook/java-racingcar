package step5.controller;

import step5.model.Car;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RacingResultDto {

    public Map<Integer, List<Car>> racingResult;

    public RacingResultDto(LinkedHashMap<Integer, List<Car>> racingResult) {
        this.racingResult = racingResult;
    }
}
