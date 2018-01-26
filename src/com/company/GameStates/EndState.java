package com.company.GameStates;

import com.company.Engine.GameEngine;
import com.company.Engine.GameState;

import java.io.IOException;

public class EndState extends GameState {
    private static EndState endState = null;
    
    private EndState() throws IOException {
    
    }
    
    public static EndState getInstance() throws IOException {
        if (endState == null) {
            endState = new EndState();
        }
        return endState;
    }
    
    @Override
    public void init() throws IOException {
    
    }
    
    @Override
    public void handleEvents(GameEngine game) throws IOException {
    
    }
    
    @Override
    public void update(GameEngine game) throws IOException {
    
    }
    
    @Override
    public void draw(GameEngine game) throws IOException {
    
    }
}
