package car.step3.view;

import car.step3.domain.Car;
import car.step3.domain.Cars;
import car.step3.service.CarService;

import java.util.ArrayList;
import java.util.List;

public class ResultView {

    CarService carService = new CarService();
    public ResultView() {
    }

    public void result(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName().getName() + " : " + "-".repeat(car.getPosition().getPosition()));
        }
        System.out.println();
    }

    public void winnerResult(List<Car> origin) {
        List<Car> winners = carService.findWinners(origin);
        List<String> winnersName = new ArrayList<>();
        for (Car winner : winners) {
            winnersName.add(winner.getName().getName());
        }
        System.out.println(String.join(",", winnersName) + "가 최종 우승했습니다.");
    }
}