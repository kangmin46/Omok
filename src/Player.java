public class Player {

    private boolean isMyTurn;
    private String playerColor;

    Player(boolean isMyTurn, String playerColor){
        this.isMyTurn = isMyTurn;
        this.playerColor = playerColor;
    }

    public void setMyTurn(boolean myTurn) {
        isMyTurn = myTurn;
    }

    public void setPlayerColor(String playerColor) {
        this.playerColor = playerColor;
    }

    public boolean isMyTurn() {
        return isMyTurn;
    }

    public String getPlayerColor() {
        return playerColor;
    }
}
