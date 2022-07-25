package rocks.zipcode.io.quiz3.arrays;

import java.util.Objects;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][] board;

    public TicTacToe(String[][] board) {
        this.board= board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {

        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] newArray = new String[board[0].length];
        for (int i = 0; i <newArray.length; i++){
            newArray[i] = board[i][value];
        }
        return newArray;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row;
        row = getRow(rowIndex);
        for (int i = 0; i < row.length; i++){
            if (!Objects.equals(row[0], row[i])){
                return false;
            }
        }
        return true;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] column = new String[board.length];
        column = getColumn(columnIndex);
        for (int i=0; i<column.length; i++){
            if (!Objects.equals(column[0], column[i])){
                return false;
            }
        }
        return true;
    }

    public String getWinner() {
        if (((board[0][0] == "X") && (board[0][1] == "X") && (board[0][2] == "X")) ||
                ((board[1][0] == "X") && (board[1][1] == "X") && (board[1][2] == "X")) ||
                ((board[2][0] == "X") && (board[2][1] == "X") && (board[2][2] == "X")) ||
                ((board[0][0] == "X") && (board[1][1] == "X") && (board[2][2] == "X")) ||
                ((board[0][2] == "X") && (board[1][1] == "X") && (board[2][0] == "X")) ||
                ((board[0][0] == "X") && (board[1][0] == "X") && (board[2][0] == "X")) ||
                ((board[0][1] == "X") && (board[1][1] == "X") && (board[2][1] == "X")) ||
                ((board[0][2] == "X") && (board[1][2] == "X") && (board[2][2] == "X"))) {
            return "X";
        }else if (((board[0][0] == "O") && (board[0][1] == "O") && (board[0][2] == "O")) ||
                ((board[1][0] == "O") && (board[1][1] == "O") && (board[1][2] == "O")) ||
                ((board[2][0] == "O") && (board[2][1] == "O") && (board[2][2] == "O")) ||
                ((board[0][0] == "O") && (board[1][1] == "O") && (board[2][2] == "O")) ||
                ((board[0][2] == "O") && (board[1][1] == "O") && (board[2][0] == "O")) ||
                ((board[0][0] == "O") && (board[1][0] == "O") && (board[2][0] == "O")) ||
                ((board[0][1] == "O") && (board[1][1] == "O") && (board[2][1] == "O")) ||
                ((board[0][2] == "O") && (board[1][2] == "O") && (board[2][2] == "O"))) {
            return "O";
        }else
        return null;
    }

    public String[][] getBoard() {
        return this.board;
    }
}
