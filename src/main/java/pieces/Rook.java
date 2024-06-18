package pieces;

import Main.Board;
import javafx.scene.image.Image;

public class Rook extends Piece {

    public Rook(Board board, int col, int row, boolean isWhite) {
        super(board, col, row, isWhite, "Rook", new Image("file:src/main/resources/pngegg (1).png")); // Adjust sprite initialization as per your design
    }

    public boolean isValidMovement(int col, int row) {
        return this.col == col || this.row == row;
    }

    public boolean moveCollidesWithPiece(int col, int row) {

        //kiri
        if (this.col > col)
            for (int c = this.col - 1; c > col; c--)
                if (board.getPiece(c, this.row) != null)
                    return true;
        //kanan
        if (this.col < col)
            for (int c = this.col  + 1; c < col; c++)
                if (board.getPiece(c, this.row) != null)
                    return true;
        //atas
        if (this.row > row)
            for (int r = this.row - 1; r > row; r--)
                if (board.getPiece(this.col, r) != null)
                    return true;
        //bawah
        if (this.row < row)
            for (int r = this.row  + 1; r < row; r++)
                if (board.getPiece(this.row, r) != null)
                    return true;

        return false;
    }

}
