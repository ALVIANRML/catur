package pieces;

import Main.Board;
import javafx.scene.image.Image;

public class Rook extends Piece {

    public Rook(Board board, int col, int row, boolean isWhite) {
        super(board, col, row, isWhite, "Rook", null); // Adjust sprite initialization as per your design
    }

    @Override
    public boolean isValidMovement(int col, int row) {
        return this.getCol() == col || this.getRow() == row;
    }

    @Override
    public boolean moveCollidesWithPiece(int col, int row) {
        // Implementation as before
        return false;
    }

}
