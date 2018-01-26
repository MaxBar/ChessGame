package com.company.GameStates;

import com.company.Board;
import com.company.Engine.GameEngine;
import com.company.Engine.GameState;

import java.io.IOException;

public class InitState extends GameState {
    private static InitState initState = null;
    public Board board;
    
    private InitState() throws IOException {
    }
    
    public static InitState getInstance() throws IOException {
        if (initState == null) {
            initState = new InitState();
        }
        return initState;
    }
    
    @Override
    public void init() throws IOException {
        board = new Board();
    }
    
    @Override
    public void handleEvents(GameEngine game) throws IOException {
    
    }
    
    @Override
    public void update(GameEngine game) throws IOException {
        changeState(game, MenuState.getInstance());
    }
    
    @Override
    public void draw(GameEngine game) throws IOException {
        Board.getTerminal().flush();
    }
}
