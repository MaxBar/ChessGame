package com.company;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Board {
    private static Terminal terminal;
    private static Screen screen;
    
    public Board() throws IOException {
        terminal = new DefaultTerminalFactory().setInitialTerminalSize(new TerminalSize(120, 35)).createTerminal();
        terminal.setCursorVisible(false);
        screen = new TerminalScreen(terminal);
    }
    
    public static Terminal getTerminal() throws IOException {
        return terminal;
    }
    
    public static Screen getScreen() throws IOException {
        return screen;
    }
}
