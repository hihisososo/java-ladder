package ladder.domain;

import java.security.InvalidParameterException;

public class GameResult {

  public static final String INVALID_GAME_RESULT_MSG = "게임 결과는 비어있을 수 없습니다.";
  private final String result;

  private GameResult(String result) {
    assertGameResult(result);
    this.result = result;
  }

  public static GameResult from(String result) {
    return new GameResult(result);
  }

  private void assertGameResult(String result) {
    if (result == null || result.isBlank()) {
      throw new InvalidParameterException(INVALID_GAME_RESULT_MSG);
    }
  }

  public String getResult() {
    return result;
  }
}
