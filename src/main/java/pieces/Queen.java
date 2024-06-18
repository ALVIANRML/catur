package pieces;

import Main.Board;
import javafx.scene.image.Image;

public class Queen extends Piece {

    public Queen(Board board, int col, int row, boolean isWhite) {
        super(board, col, row, isWhite, "Queen", null); // Adjust sprite initialization as per your design
    }

    @Override
    public boolean isValidMovement(int col, int row) {
        // Implementation as before
        return false;
    }

    @Override
    public boolean moveCollidesWithPiece(int col, int row) {
        // Implementation as before
        return false;
    }
}
