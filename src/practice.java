import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class practice {
    public static void main(String[] args) throws Exception{

        Board board =new Board();
        board.CreateBoard();
        board.printBoard();
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        int yPos,xPos;
        Player whitePlayer = new Player(true,"white");
        Player blackPlayer = new Player(false,"black");

        while(true){

            System.out.println(">>> 오목을 둘 위치를 입력하시오.(세로, 가로)");
            StringTokenizer st = new StringTokenizer(bf.readLine(),",");
            yPos = Integer.parseInt(st.nextToken());
            xPos = Integer.parseInt(st.nextToken());
            board.SetStone(yPos,xPos);
            if(board.isJudgeWin(yPos,xPos)){
                break;
            }
            board.printBoard();
        }
    }

}
