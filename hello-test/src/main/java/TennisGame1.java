import java.util.Objects;

public class TennisGame1 {
    private int m_score1 = 0;
    private int m_score2 = 0;
    private final String player1Name;
    private final String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (Objects.equals(playerName, this.player1Name)) {
            m_score1++;
        } else {
            m_score2++;
        }
    }

    public String getScore() {
        String[] scoreResults = new String[]{"Love", "Fifteen", "Thirty", "Forty" };
        StringBuilder score = new StringBuilder();
        if (m_score1 == m_score2) {
            if( m_score1 <= 2 ) {
                // All
                score = new StringBuilder(scoreResults[m_score1]).append("-").append("All");
            } else {
                // Deuce
                score = new StringBuilder("Deuce");
            }
        } else if (m_score1 >= 4 || m_score2 >= 4) {
            int minusResult = m_score1 - m_score2;
            if (minusResult == 1) score = new StringBuilder("Advantage ").append(this.player1Name);
            else if (minusResult == -1) score = new StringBuilder("Advantage ").append(this.player2Name);
            else if (minusResult >= 2) score = new StringBuilder("Win for ").append(this.player1Name);
            else score = new StringBuilder("Win for ").append(this.player2Name);
        } else {
            // TODO
            score.append(scoreResults[m_score1]).append("-").append(scoreResults[m_score2]);
        }
        return score.toString();
    }
}