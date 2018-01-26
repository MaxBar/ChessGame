package com.company.GameStates;

import com.company.Engine.GameEngine;
import com.company.Engine.GameState;

import java.io.IOException;

public class MenuState extends GameState {
    private static MenuState menuState = null;
    
    private MenuState() throws IOException {
    
    }
    
    public static MenuState getInstance() throws IOException {
        if (menuState == null) {
            menuState = new MenuState();
        }
        return menuState;
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
