package com.company.GameStates;

import com.company.Board;
import com.company.Engine.GameEngine;
import com.company.Engine.GameState;
import com.googlecode.lanterna.input.KeyStroke;

import java.io.IOException;

public class MenuState extends GameState {
    private static MenuState menuState = null;
    private int screenHeight;
    private int screenWidth;
    private int heightOffsetMenu;
    private int heightOffsetPlay;
    private int widthOffsetPlay;
    private KeyStroke key;
    
    
    private MenuState() throws IOException {
        screenHeight = Board.getTerminal().getTerminalSize().getRows() / 2;
        screenWidth = Board.getTerminal().getTerminalSize().getColumns() / 2;
        heightOffsetMenu = -4;
        heightOffsetPlay = -11;
        widthOffsetPlay = 2;
    }
    
    public static MenuState getInstance() throws IOException {
        if (menuState == null) {
            menuState = new MenuState();
        }
        return menuState;
    }
    
    @Override
    public void init() throws IOException {
        Board.getTerminal().clearScreen();
        Board.getTerminal().enterPrivateMode();
        Board.getTerminal().newTextGraphics().putString(screenWidth + heightOffsetMenu,
                                                        screenHeight,
                                                        "Menu");
        Board.getTerminal().newTextGraphics().putString(screenWidth + heightOffsetPlay,
                                                        screenHeight + widthOffsetPlay,
                                                        "Press space to play");
    }
    
    @Override
    public void handleEvents(GameEngine game) throws IOException {
        key = Board.getTerminal().readInput();
        
        switch(key.getKeyType()) {
            case EOF:
                game.quit();
                break;
            case Escape:
                game.quit();
                break;
            case Character:
                switch (key.getCharacter()) {
                    case ' ':
                        changeState(game, PlayState.getInstance());
                        break;
                }
                break;
        }
    }
    
    @Override
    public void update(GameEngine game) throws IOException {
    
    }
    
    @Override
    public void draw(GameEngine game) throws IOException {
        Board.getTerminal().flush();
    }
}
