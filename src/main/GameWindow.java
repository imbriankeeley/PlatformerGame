package main;

import javax.swing.*;

public class GameWindow {
    private JFrame frame;

    public GameWindow() {

        frame = new JFrame();

        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
