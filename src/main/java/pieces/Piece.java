package pieces;

import Main.Board;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public abstract class Piece {

    protected int col, row;
    protected int xPos, yPos;
    protected boolean isWhite;
    protected String name;
    protected int value;
    protected boolean isFirstMove = true;
    protected Image sprite;
    protected Board board;

    public Piece(Board board, int col, int row, boolean isWhite, String name, Image sprite) {
        this.board = board;
        this.col = col;
        this.row = row;
        this.xPos = col * board.getTileSize();
        this.yPos = row * board.getTileSize();
        this.isWhite = isWhite;
        this.name = name;
        this.sprite = sprite;
    }


    public abstract boolean isValidMovement(int col, int row);

    public abstract boolean moveCollidesWithPiece(int col, int row);

    public void paint(GraphicsContext g2d) {
        g2d.drawImage(sprite, xPos, yPos); // Draw the sprite using GraphicsContext
    }
    public void setCol(int col) {
        this.col = col;
        this.xPos = col * board.getTileSize();
    }



    // Getters and Setters (only necessary ones shown)
    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public boolean isFirstMove() {
        return isFirstMove;
    }

    public void setFirstMove(boolean isFirstMove) {
        this.isFirstMove = isFirstMove;
    }

    public Board getBoard() {
        return board;
    }

    public Image getSprite() {
        return sprite;
    }
    public String getName() {
        return this.name;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    // Untuk isWhite(), pastikan visibilitasnya memadai atau gunakan cara yang sesuai untuk mengaksesnya.
// Contoh dalam kelas Piece:
    public boolean isWhite() {
        return this.isWhite;
    }

    // Perbaikan parameterisasi konstruktor di kelas turunan
// Misalnya, di kelas Rook:

    }

