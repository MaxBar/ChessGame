package com.company.GameStates;

import com.company.Board;
import com.company.Engine.GameEngine;
import com.company.Engine.GameState;
import com.company.Entities.AI;

import java.io.IOException;

public class PlayState extends GameState {
    private static PlayState playState = null;
    private AI[] ai;
    private int[][] chessBoard;
    
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
        ai = new AI[2];
        chessBoard = new int[8][8];
    }
    
    @Override
    public void handleEvents(GameEngine game) throws IOException {
    
    }
    
    @Override
    public void update(GameEngine game) throws IOException {
        for(int i = 0; i < ai.length; ++i) {
            ai[i].update();
        }
    }
    
    @Override
    public void draw(GameEngine game) throws IOException {
        Board.getTerminal().flush();
    }
}