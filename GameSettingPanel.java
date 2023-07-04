
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class GameSettingPanel extends JPanel {


    int xaxis = 100, yaxis = 100;
   KeyboardInput keyboardinput = new KeyboardInput(this);
    int xdelta  = 0,ydelta = 0;

    public GameSettingPanel() {


        int tileSize = 48;// the tile will be 48 pixel
        int col = 16, row = 12;
        int screenWidth = tileSize * col; // 48*16 = 768
        int screenHeight = tileSize * row;// 48*12 = 576
        // The screenWidth and screenHeight will be of a resolution of 768x576;
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.white);
        this.addKeyListener(keyboardinput);

        addKeyListener(new KeyboardInput(this));
        this.setFocusable(true);

    }

public void updatexDelta(int move){

        this.xdelta += move;
        repaint();
}
    public void updateyDelta(int move) {

        this.ydelta += move;
        repaint();
     }


        public void paintComponent (Graphics g){
            super.paintComponent(g);
            g.fillRect(xaxis + xdelta, yaxis + ydelta, 48, 48);
            g.setColor(Color.black);
        }



}



