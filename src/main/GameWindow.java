package main;

import javax.swing.*;

public class GameWindow {
    private JFrame jframe;

    public GameWindow() {

        jframe = new JFrame();

        jframe.setSize(800, 800);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
    }
}
