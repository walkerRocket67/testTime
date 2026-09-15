public class Player {
    private String playerName;
    private int playerPoints;
    private int playerRank;

    public Player(String playerName) {
        this.playerName = playerName;
        this.playerPoints = 0;
        this.playerRank = 0;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public int getPlayerRank() {
        return playerRank;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerRank(int playerRank) {
        this.playerRank = playerRank;
    }

    public void addPoints(int points) {
        if (points > 0) {
            playerPoints += points;
        }
    }

    public void resetPoints() {
        playerPoints = 0;
    }

    @Override
    public String toString() {
        return "Player{name='" + playerName + "', points=" + playerPoints + ", rank=" + playerRank + "}";
    }
}