package main;

import Inputs.KeyboardInputs;
import Inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private float xDelta = 300, yDelta = 300;
    private float xDir = 2.0f, yDir = 2.0f;
    private int frames = 0;
    private long lastCheck = 0;

    public GamePanel() {

        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);

    }

    public void changeXDelta(int value) {
        this.xDelta += value;
    }

    public void changeYDelta(int value) {
        this.yDelta += value;
    }

    public void setRectPos(int x, int y) {
        this.xDelta = x;
        this.yDelta = y;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        updateRectangle();
        
        g.fillRect((int)xDelta, (int)yDelta, 100, 50);

        frames++;
        if(System.currentTimeMillis() - lastCheck >= 1000) {
            lastCheck = System.currentTimeMillis();
            System.out.println("FPS: " + frames);
            frames = 0;
        }


        repaint();
    }

    private void updateRectangle() {
        xDelta+= xDir;
        if (xDelta > 695 || xDelta < 0) {
            xDir *= -1;
        }
        yDelta+= yDir;
        if (yDelta > 725 || yDelta < 0) {
            yDir *= -1;
        }
    }

}
