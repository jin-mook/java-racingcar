package racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import racingcar.strategy.MoveStrategy;

public class CarTest {

	private static final String NO_NAME = "이름없음";

	private final MoveStrategy moveStrategyMovable = () -> true;
	private final MoveStrategy moveStrategyNotMovable = () -> false;

	@Test
	@DisplayName("차는 전진할 수 있다")
	void car_can_move() {
		Car car = new Car(NO_NAME);
		car.move(moveStrategyMovable);

		assertThat(car.hasPositionSameAs(new Position(1))).isTrue();
	}

	@Test
	@DisplayName("차는 멈춰있을 수 있다")
	void car_can_stay() {
		Car car = new Car(NO_NAME);
		car.move(moveStrategyNotMovable);

		assertThat(car.hasPositionSameAs(new Position(0))).isTrue();
	}

	@Test
	@DisplayName("이름을 가질 수 있다")
	void a_car_can_have_name() {
		String name = "이름";
		Car car = new Car(name);

		assertThat(car.getName()).isEqualTo(name);
	}
}