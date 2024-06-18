package Main;

import pieces.Piece;

public class Move {

    private int oldCol;
    private int oldRow;
    private int newCol;
    private int newRow;

    private Piece piece;
    private Piece capture;

    public Move(Board board, Piece piece, int newCol, int newRow) {
        this.oldCol = piece.getCol();
        this.oldRow = piece.getRow();
        this.newCol = newCol;
        this.newRow = newRow;

        this.piece = piece;
        this.capture = board.getPiece(newCol, newRow);
    }

    public int getOldCol() {
        return oldCol;
    }

    public int getOldRow() {
        return oldRow;
    }

    public int getNewCol() {
        return newCol;
    }

    public int getNewRow() {
        return newRow;
    }

    public void setCapture(Piece capture) {
        this.capture = capture;
    }

    public Piece getPiece() {
        return piece;
    }

    public Piece getCapture() {
        return capture;
    }
}
