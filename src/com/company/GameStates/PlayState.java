package com.company.GameStates;

import com.company.Board;
import com.company.Engine.GameEngine;
import com.company.Engine.GameState;
import com.company.Entities.AI;
import com.company.Entities.Piece;
import com.company.Entities.Rook;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

import java.io.IOException;
import java.util.ArrayList;

public class PlayState extends GameState {
    private static PlayState playState = null;
    private AI[] ai;
    private int[][] chessBoard;
    private TextGraphics textGraphics;
    
    private PlayState() throws IOException {
    
    }
    
    public static PlayState getInstance() throws IOException {
        if (playState == null) {
            playState = new PlayState();
        }
        return playState;
    }
    
    @Override
    public void init() throws IOException {
        Board.getTerminal().clearScreen();
        ai = new AI[2];
        chessBoard = new int[8][8];
        Board.getTerminal().setBackgroundColor(TextColor.ANSI.BLUE);
        Board.getTerminal().setForegroundColor(TextColor.ANSI.BLACK);

        Rook r = new Rook(0,5,true);
    
        textGraphics = Board.getTerminal().newTextGraphics();
        
        for(int i = 0; i < chessBoard.length; ++i) {
            for(int j = 0; j < chessBoard[i].length; ++j) {
                if((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)) {
                    Board.getTerminal().setCursorPosition(i, j);
                    Board.getTerminal().setBackgroundColor(TextColor.ANSI.WHITE);
                    Board.getTerminal().putCharacter(' ');
                } else {
                    Board.getTerminal().setCursorPosition(i, j);
                    Board.getTerminal().setBackgroundColor(TextColor.ANSI.BLACK);
                    Board.getTerminal().putCharacter(' ');
                }
                //Board.getTerminal().newTextGraphics().putString(i, j, Board.getTerminal().);
            }
        }
        System.out.println("hej");
    }
    
    @Override
    public void handleEvents(GameEngine game) throws IOException {
    
    }
    
    @Override
    public void update(GameEngine game) throws IOException {
        /*for(int i = 0; i < ai.length; ++i) {
            ai[i].update();
        }*/
    }
    
    @Override
    public void draw(GameEngine game) throws IOException {
        Board.getTerminal().flush();
    }
}