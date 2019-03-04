public class Stone {

    private String StoneColor;
    private Tile tile;

    Stone(String StoneColor) {

        this.StoneColor = StoneColor;
    }

    public Tile getTile() {
        return tile;
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    public void setStoneColor(String stoneColor) {
        StoneColor = stoneColor;
    }


    public String getStoneColor() {
        return StoneColor;
    }
}

