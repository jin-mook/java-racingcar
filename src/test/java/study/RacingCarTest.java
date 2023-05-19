package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import study.racingcar.InputView;
import study.racingcar.RacingCar;
import study.racingcar.ResultView;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.*;
public class RacingCarTest {

    ResultView resultView = new ResultView();
    InputView inputView = new InputView();

    @Test
    @DisplayName("사용자에게 특정 메세지를 보여주는 기능")
    void showMessage() {
        assertThat(resultView.viewQuestionMessage("TRY")).isEqualTo("시도할 회수는 몇 회 인가요?");
        assertThat(resultView.viewQuestionMessage("CAR")).isEqualTo("자동차 대수는 몇 대 인가요?");
        assertThat(resultView.viewQuestionMessage("A")).isEqualTo("NO MESSAGE");
    }

    @Test
    @DisplayName("사용자에게 숫자만 입력받는 기능")
    void systemSetInNumber() {
        InputStream inputStream = new ByteArrayInputStream("3".getBytes());
        System.setIn(inputStream);
        int result = inputView.scanNumber();
        assertThat(result).isEqualTo(3);
    }

    @Test
    @DisplayName("0에서 9사이의 random값을 구한 후 4이상일 경우 전진하는 기능")
    void forwardAndStop() {
        RacingCar racingCar = new RacingCar();
        int number = inputView.randomNumber();
        racingCar.forwardAndStop(number);
        if(number >= 4) {
            assertThat(resultView.viewLocation(racingCar.forwardCount)).isEqualTo("-");
        }else {
            assertThat(resultView.viewLocation(racingCar.forwardCount)).isEqualTo("");
        }
    }

    @Test
    @DisplayName("자동차의 상태가 잘 나타나는지 확인")
    void carsStatus() {
        RacingCar racingCar = new RacingCar();
        racingCar.forward();
        racingCar.forward();
        racingCar.forward();
        assertThat(resultView.viewLocation(racingCar.forwardCount)).isEqualTo("---");
    }
}