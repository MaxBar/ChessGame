package com.company.Entities;

import java.util.ArrayList;

public class Piece {

    public int x;
    public int y;
    public boolean is_white;


    public ArrayList<Piece> White_Pieces; // List for white pieces
    public ArrayList<Piece> Black_Pieces; // List for black pieces

    public Piece getPiece(int x, int y) {

        for (Piece p : White_Pieces) {
            if (p.getX() == x && p.getY() == y) {
                return p;
            }
        }
        for (Piece p : Black_Pieces) {
            if (p.getX() == x && p.getY() == y) {
                return p;
            }
        }

        return null;
    }

    public Piece() {

    }

    public Piece(int x, int y, boolean is_white) {

        this.is_white = is_white;
        this.x = x;
        this.y = y;

    }

    public boolean isWhite() {
        return is_white;
    }

    public boolean isBlack() {
        return !is_white;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean canMove(int destination_x, int destination_y) {
        return false;
    }
}