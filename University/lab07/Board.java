import java.util.Random;

public class Board{
    private int nx;
    private int ny;
    private char[][] board;
    private int positionX;
    private int positionY;
    private double probability;

    Board(int nx, int ny, double probability){
        this.nx=nx;
        this.ny=ny;
        this.probability = probability;
        this.positionX = nx-2;
        this.positionY = 1;
        board = new char[nx][ny];
        
        fillBoard();
    }

    public void fillBoard(){
        for(int x = 0; x < nx; x++)
        {
            board[x][0] = 'X';
            board[x][ny - 1] = 'X';
        }

        for(int y = 0; y < ny; y++)
        {
            board[0][y] = 'X';
            board[nx - 1][y] = 'X';
        }

        board[nx / 2][ny - 1] = ' ';

        for(int x = 1; x < nx - 1; x++)
        {
            for(int y = 1; y < ny - 1; y++)
            {
                board[x][y] = Math.random() < probability ? 'X' : ' ';
            }
        }
       board[positionX][positionY]='o';
    }

    public void reset(){
        fillBoard();
    }

    public void move(Direction direction){
        if(board[positionX+direction.getX()][positionY+direction.getY()] == 'X'){
            System.out.println("NIE UDALO SIE WYKONAC TAKIEGO RUCHU.");
        }
        else{
            board[positionX+direction.getX()][positionY+direction.getY()] ='o';
            board[positionX][positionY] = ' ';
            positionX += direction.getX();
            positionY += direction.getY();
        }

        if(board[positionX][positionY] == board[nx / 2][ny - 1])
        {
            System.out.println("GRATULACJE, WYGRALES!");
            System.exit(0);
        }
    }

    public String toString(){
        String string="";
        for(int i=0; i<nx;i++){
            for(int j=0; j<ny; j++){
                string += board[i][j];
            }
            string +="\n";
        }
        return string;
    }
}