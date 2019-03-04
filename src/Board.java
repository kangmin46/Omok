public class Board {
    private Tile[][] posiTion;
    private boolean isWhiteTurn;
    private static int[] moveY = {1, 1, 1, 0, 0, -1, -1, -1};
    private static int[] moveX = {-1, 0, 1, -1, 1, -1, 0, 1};
    private static int count = 1;

    Board() {
        this.posiTion = new Tile[11][11];
        this.isWhiteTurn = true;
    }

    public void CreateBoard() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                this.posiTion[i][j] = new Tile(i, j, true);
            }
        }
    }

    public void printBoard() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(this.posiTion[i][j].getTileValue() + " ");
            }
            System.out.println();
        }
    }

    public void SetStone(int yPos, int xPos) {

        if (isValidPosition(yPos, xPos) && this.posiTion[yPos][xPos].isEmpty()) {
            if (isWhiteTurn) {
                this.posiTion[yPos][xPos].setStoneOnTile(new Stone("white"));
                this.posiTion[yPos][xPos].setTileValue("O");
                isWhiteTurn = false;
            } else {
                this.posiTion[yPos][xPos].setStoneOnTile(new Stone("black"));
                this.posiTion[yPos][xPos].setTileValue("X");
                isWhiteTurn = true;
            }
            this.posiTion[yPos][xPos].setyPos(yPos);
            this.posiTion[yPos][xPos].setxPos(xPos);
            this.posiTion[yPos][xPos].setEmpty(false);
        } else System.out.println("올바른 좌표를 입력하세요.");

    }

    public static boolean isValidPosition(int yPos, int xPos) {
        if (yPos > 10 || yPos < 1 || xPos > 10 || xPos < 1) return false;
        else return true;
    }

    public boolean isJudgeWin(int yPos, int xPos) {
        Tile tile = this.posiTion[yPos][xPos];
        Stone stone = tile.getStoneOnTile();
        String aliance = stone.getStoneColor();

        for (int i = 0; i < 8; i++) {
            int nextYpos = yPos + moveY[i];
            int nextXpos = xPos + moveX[i];

            if(isValidPosition(nextYpos,nextXpos)){

                Tile nextTIle = this.posiTion[nextYpos][nextXpos];

                if (!nextTIle.isEmpty() && aliance.equals(nextTIle.getStoneOnTile().getStoneColor())) {
                    JudgeOmok(nextYpos,nextXpos,i);
                    if(count==5){
                        System.out.println(tile.getStoneOnTile().getStoneColor()+"의 승리입니다!");
                        return true;
                    }
                    else count=1;
                }
            }
        }
        return false;
    }
    public void JudgeOmok(int yPos, int xPos, int direction){

        count++;
        Tile tile = this.posiTion[yPos][xPos];
        Stone stone = tile.getStoneOnTile();
        String stoneColor = stone.getStoneColor();

        int nextYpos = yPos + moveY[direction];
        int nextXpos = xPos + moveX[direction];
        if(isValidPosition(nextYpos,nextXpos)){
            Tile nextTile =this.posiTion[nextYpos][nextXpos];

            if(!nextTile.isEmpty()){
                if(stoneColor.equals(nextTile.getStoneOnTile().getStoneColor())){

                    JudgeOmok(nextYpos,nextXpos,direction);
                }
            }
        }
        return;
}


}
