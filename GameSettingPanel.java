
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyListener;



public class GameSettingPanel extends JPanel{

  public GameSettingPanel() {


      int tileSize = 48;// the tile will be 48 pixel
      int col = 16, row = 12;
      int screenWidth = tileSize * col; // 48*16 = 768
      int screenHeight = tileSize * row;// 48*12 = 576
      // The screenWidth and screenHeight will be of a resolution of 768x576;
      this.setPreferredSize(new Dimension(screenWidth, screenHeight));
      this.setBackground(Color.white);
  }


      public void paintComponent (Graphics g){
          super.paintComponent(g);
          g.fillRect(100, 100, 48, 48);
          g.setColor(Color.black);
      }

    @Override
    public synchronized void addKeyListener(KeyListener l) {
        super.addKeyListener(l);
    }
}



