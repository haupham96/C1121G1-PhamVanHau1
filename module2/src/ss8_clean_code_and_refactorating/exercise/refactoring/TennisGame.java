package ss8_clean_code_and_refactorating.exercise.refactoring;

public class TennisGame {

    public static final String GET_0_POINT = "Love-All";
    public static final String GET_1_POINT = "Fifteen-All";
    public static final String GET_2_POINTS = "Thirty-All";
    public static final String GET_3_POINTS = "Forty-All";
    public static final String DRAW = "Deuce";

    public String player1Name = "John";
    public String player2Name = "Bill";

    public static String getScore(int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore = 0;
        if (scorePlayer1 == scorePlayer2) {
            switch (scorePlayer1) {
                case 0:
                    score = GET_0_POINT;
                    break;
                case 1:
                    score = GET_1_POINT;
                    break;
                case 2:
                    score = GET_2_POINTS;
                    break;
                case 3:
                    score = GET_3_POINTS;
                    break;
                default:
                    score = DRAW;
                    break;

            }

        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            int advantagePlayer = getAdvantagePlayer(scorePlayer1, scorePlayer2);
            boolean advantagePlayer1 = advantagePlayer == 1;
            if (advantagePlayer1) {
                score = "Advantage player1";
            } else {
                boolean advantagePlayer2 = advantagePlayer == -1;
                if (advantagePlayer2) {
                    score = "Advantage player2";
                } else {
                    boolean draw = advantagePlayer >= 2;
                    if (!draw) {
                        score = "Win for player1";
                    } else {
                        score = DRAW;
                    }
                }
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scorePlayer1;
                else {
                    score += "-";
                    tempScore = scorePlayer2;
                }
                switch (tempScore) {
                    case 0:
                        score += GET_0_POINT;
                        break;
                    case 1:
                        score += GET_1_POINT;
                        break;
                    case 2:
                        score += GET_2_POINTS;
                        break;
                    case 3:
                        score += GET_3_POINTS;
                        break;
                }
            }
        }
        return score;
    }

    private static int getAdvantagePlayer(int scorePlayer1, int scorePlayer2) {
        int advantagePlayer = scorePlayer1 - scorePlayer2;
        return advantagePlayer;
    }
}
