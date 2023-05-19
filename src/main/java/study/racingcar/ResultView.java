package study.racingcar;

public class ResultView {

    String questionCarCountMessage = "자동차 대수는 몇 대 인가요?";
    String questionTryCountMessage = "시도할 회수는 몇 회 인가요?";
    String playResultMessage = "\n실행결과";
    String noMessage = "NO MESSAGE";
    String locationString = "-";

    public void viewEmpty() {
        System.out.println();
    }

    public String viewQuestionMessage(String type) {
        if (type.equals("TRY")) {
            return (questionTryCountMessage);
        } else if (type.equals("CAR")) {
            return (questionCarCountMessage);
        } else if (type.equals("PLAY_RESULT")) {
            return (playResultMessage);
        }
        return noMessage;
    }

    public String viewLocation(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += locationString;
        }
        return result;
    }
}