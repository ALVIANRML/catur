package pieces;

import Main.Board;
import Main.Move;
import javafx.scene.image.Image;

public class King extends Piece {

    public King(Board board, int col, int row, boolean isWhite) {
        super(board, col, row, isWhite, "King", null); // Adjust sprite initialization as per your design
    }

    public boolean isValidMovement(int col, int row){
        return Math.abs((col - this.col) * (row - this.row)) == 1 || Math.abs(col - this.col) + Math.abs(row -this.row) == 1 || canCastle(col, row);
    }

    private boolean canCastle(int col, int row) {

        if (this.row == row) {
            if (col == 6) {
                Piece rook = board.getPiece(7, row);
                if (rook != null && rook.isFirstMove && isFirstMove) {
                    return board.getPiece(5,row) == null &&
                            board.getPiece(6, row) == null &&
                            !board.checkScanner.isKingChecked(new Move(board, this,5, row));
                }
            } else if (col == 2) {
                Piece rook = board.getPiece(0, row);
                if (rook != null && rook.isFirstMove && isFirstMove) {
                    return board.getPiece(3, row) == null &&
                            board.getPiece(2, row) == null &&
                            board.getPiece(1, row) == null &&
                            !board.checkScanner.isKingChecked(new Move(board, this, 3, row));
                }

            }
        }
        return false;
    }


    public boolean moveCollidesWithPiece(int col, int row) {
        // Implementation as before
        return false;
    }
}
