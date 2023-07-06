
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;




public class GameSettingPanel extends JPanel {


    int xaxis = 100, yaxis = 100;
   KeyboardInput keyboardinput = new KeyboardInput(this);
    int x  = 0,y = 0;

    public GameSettingPanel() {

        this.setBackground(Color.white);
        this.addKeyListener(keyboardinput);
        addKeyListener(new KeyboardInput(this));
        this.setFocusable(true);

    }

public void updateX(int move){

        x += move;
        repaint();
}
    public void updateY(int move) {

        y += move;
        repaint();
     }


        public void paintComponent (Graphics g){
            super.paintComponent(g);
            g.fillRect(xaxis + x, yaxis + y, 48, 48);
            g.setColor(Color.black);
        }


}



