
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class KeyboardInput implements KeyListener{
 private GameSettingPanel gameSettingPanel;


    public KeyboardInput(GameSettingPanel gameSettingPanel){
        this.gameSettingPanel = gameSettingPanel;
    }

@Override
    public void keyTyped(KeyEvent e){

    }
    @Override
    public void keyPressed(KeyEvent e ) {

        int input = e.getKeyCode();

         if (input == KeyEvent.VK_W) {
            gameSettingPanel.updateyDelta(-10);

        }
       else  if (input == KeyEvent.VK_S) {
            gameSettingPanel.updateyDelta(+10);
        }
       else if (input == KeyEvent.VK_A) {
            gameSettingPanel.updatexDelta(-10);
        }
        else if (input == KeyEvent.VK_D) {
           gameSettingPanel.updatexDelta(+10);

        }
    }
     @Override
             public void keyReleased(KeyEvent e ){

        }
    }

