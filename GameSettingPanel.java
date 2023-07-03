
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics2D;
        import java.awt.Graphics;
public class GameSettingPanel extends JPanel{

    int tileSize = 48;// the tile will be 48 pixel
    int col = 16, row = 12;
    int screenWidth = tileSize * col; // 48*16 = 768
    int screenHeight = tileSize * row;// 48*12 = 576
    // The screenWidth and screenHeight will be of a resolution of 768x576;

    public GameSettingPanel(){

        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.red);
    }
public void DisplayObject(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.black);
        g2.fillRect(100,100,48,48);
}











}
