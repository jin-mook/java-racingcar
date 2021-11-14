package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarTest {

    @Test
    @DisplayName("RacingCar 생성자 테스트")
    public void 자동차_생성자() {
        assertThat(new RacingCar("aaa")).isEqualTo(new RacingCar("aaa"));
    }

    @Test
    @DisplayName("random 값이 4이상일 경우 전진 카운트를 증가시킨다.")
    public void 전진_카운트_증가(){
        RacingCar racingCar = new RacingCar("aaa");
        racingCar.goOrStopRacing(4);
        assertThat(racingCar.getMoveCount()).isEqualTo(1);
    }

    @Test
    @DisplayName("random 값이 3이하인 경우 전진 카운트를 증가시키지 않는다.")
    public void 전진_카운트_증가_안함(){
        RacingCar racingCar = new RacingCar("aaa");
        racingCar.goOrStopRacing(3);
        assertThat(racingCar.getMoveCount()).isEqualTo(0);
    }

    @Test
    @DisplayName("moveCount가 maxCount와 같은지 체크한다.")
    public void isMoveCountEqualMaxCount() {
        RacingCar racingCar = new RacingCar("aaa", 5);
        assertThat(racingCar.isMoveCountEqualMaxCount(5)).isTrue();
    }
}