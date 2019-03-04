public class Tile {

    private Stone stoneOnTile;
    private int yPos;
    private int xPos;
    private boolean isEmpty;
    private String tileValue;

    Tile(int yPos,int xPos,boolean isEmpty){
        this.yPos =yPos;
        this.xPos =xPos;
        this.isEmpty =isEmpty;
        this.tileValue = "*";
    }

    public void setTileValue(String tileValue) {
        this.tileValue = tileValue;
    }

    public String getTileValue() {
        return tileValue;
    }

    public Stone getStoneOnTile() {
        return stoneOnTile;
    }

    public int getyPos() {
        return yPos;
    }

    public int getxPos() {
        return xPos;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setStoneOnTile(Stone stoneOnTile) {
        this.stoneOnTile = stoneOnTile;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
