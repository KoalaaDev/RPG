
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class KeyboardInput implements KeyListener{
 private GameSettingPanel gameSettingPanel;


    public KeyboardInput(GameSettingPanel gameSettingPanel){
         this.gameSettingPanel  = gameSettingPanel;

    }



    @Override
    public void keyTyped(KeyEvent e){

    }
    @Override
    public void keyPressed(KeyEvent e ) {

        int input = e.getKeyCode();

         if (input == KeyEvent.VK_W || input == KeyEvent.VK_UP)  {
            gameSettingPanel.updateY(-10);
        }
       else  if (input == KeyEvent.VK_S || input == KeyEvent.VK_DOWN) {
            gameSettingPanel.updateY(+10);
        }
       else if (input == KeyEvent.VK_A || input == KeyEvent.VK_LEFT) {
            gameSettingPanel.updateX(-10);
        }
        else if (input == KeyEvent.VK_D || input == KeyEvent.VK_RIGHT) {
           gameSettingPanel.updateX(+10);

        }
    }
     @Override
             public void keyReleased(KeyEvent e ){

        }
    }

