package tictactoefinal;
import java.util.Scanner;
public class TicTacToeFinal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("player 1. what's your good name:");
        String p1=in.nextLine();
        System.out.println("player 2. what's your good name:");
        String p2=in.nextLine();
        char[][] board =new char[3][3];
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                board[i][j]='-';
            }
        }
        
        boolean player1=true;
        boolean gameEnd=false;
        while(!gameEnd){
        drawboard(board);
        char symbol=' ';
        if(player1)
        {
            symbol='x';
        }
        else
        {
            symbol='o';
        }
        if(player1)
        {
            System.out.println(p1+"'s turn");
        }
        else
        {
            System.out.println(p2+"'s turn");
        }
        int row=0;
        int col=0;
        while(true){
        System.out.println("Enter row from 0,1,2");
        row = in.nextInt();
        System.out.println("Enter col from 0,1,2");
        col = in.nextInt();
        if(row<0 || row>2 || col >2 ||col<0)
        {
            System.out.println("You selected out bounded row/col");
        }
        else if(board[row][col]!='-')
        {
            System.out.println("This position is picked already");
        }
        else
        {
            break;
        }
        }
        board[row][col]=symbol;
        if(won(board)=='x')
        {
            System.out.println(p1+" has won");
            gameEnd=true;
        }
        else if(won(board)=='o')
        {
            System.out.println(p2+" has won");
            gameEnd=true;
        }
        if(tie(board))
        {
            System.out.println("it's a tie");
            gameEnd=true;
        }
        else
        {
            player1=!player1;
        }
        }
         drawboard(board);
    }
 public static void drawboard(char [][] board)
    {
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
 public static char won(char [][] board)
 {
     for(int i=0;i<3;i++)
        {
            if(board[i][0]==board [i][1] && board [i][1]==board [i][2] && board [i][0]!='-')
            {
                return board[i][0];
            }
        }
     for(int j=0;j<3;j++)
        {
            if(board[0][j]==board [1][j] && board [1][j]==board [2][j] && board [0][j]!='-')
            {
                return board[0][j];
            }
        }
     if(board [0][0]==board [1][1] && board [1][1]==board [2][2]&& board [0][0]!='-')
     {
         return board [0][0];
     }
     if(board [2][0]==board [1][1] && board [1][1]==board [0][2]&& board [2][0]!='-')
     {
         return board [2][0];
     }
     return '-';
 }
 public static boolean tie(char[][]board){
          for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                if(board[i][j]=='-')
                {
                    return  false;
                }
            }
        }
          return true;
        }
}
