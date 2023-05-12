package Week09.morning;

public class T1TicTacToe {

     /*
    T1TicTacToe [multidimensional array]

    Create a program that will define a 2D array for a tic tac toe game.
    Check the board to see who won.
    X or O are the winners if they have 3 of the same character in a row.
     If there is not 3 X or O in a row print Tie instead

     */
     public static void main(String[] args) {
     char[][] board = {
             {'O', 'O', 'O'},
             {'X', 'O', 'X'},
             {'-', 'X', '-'},
     };

        for(int i = 0; i < board.length; i++){
        String row = Arrays.toString(board[i]).replace(", ", "").replace("[", "").replace("]", "");
        String colm = "" + board[0][i] + board[1][i] + board[2][i];

        if(row.equals("XXX") || colm.equals("XXX")){
            System.out.println("X is the winner");
        } else if(row.equals("OOO") || colm.equals("OOO")){
            System.out.println("O is the winner");
        }
    }
}
