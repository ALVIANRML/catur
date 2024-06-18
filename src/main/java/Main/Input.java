package Main;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import pieces.Piece;

public class Input {

    private Board board;

    public Input(Board board) {
        this.board = board;
        setUpMouseEvents();
    }

    private void setUpMouseEvents() {
        board.getCanvas().addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                int col = (int) (e.getX() / board.getTileSize());
                int row = (int) (e.getY() / board.getTileSize());

                Piece pieceXY = board.getPiece(col, row);
                if (pieceXY != null) {
                    board.setSelectedPiece(pieceXY);
                }
            }
        });

        board.getCanvas().addEventHandler(MouseEvent.MOUSE_DRAGGED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                if (board.getSelectedPiece() != null) {
                    board.getSelectedPiece().setXPos((int) (e.getX() - board.getTileSize() / 2));
                    board.getSelectedPiece().setYPos((int) (e.getY() - board.getTileSize() / 2));
                    board.repaint();
                }
            }
        });

        board.getCanvas().addEventHandler(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                int col = (int) (e.getX() / board.getTileSize());
                int row = (int) (e.getY() / board.getTileSize());

                if (board.getSelectedPiece() != null) {
                    Move move = new Move(board, board.getSelectedPiece(), col, row);

                    if (board.isValidMove(move)) {
                        board.makeMove(move);
                    } else {
                        board.getSelectedPiece().setXPos(board.getSelectedPiece().getCol() * board.getTileSize());
                        board.getSelectedPiece().setYPos(board.getSelectedPiece().getRow() * board.getTileSize());
                    }
                }

                board.setSelectedPiece(null);
                board.repaint();
            }
        });
    }
}
