
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public abstract class KeyboardInput implements KeyListener{


boolean up,down,right,left;

@Override
    public void keyTyped(KeyEvent e){

    }
    @Override
    public void keyPressed(KeyEvent e ) {

        int input = e.getKeyCode();

        if (input == KeyEvent.VK_W) {
            up = true;
        }
        if (input == KeyEvent.VK_S) {
            down = true;
        }
        if (input == KeyEvent.VK_A) {
            left = true;
        }
        if (input == KeyEvent.VK_D) {
            right = true;
        }
    }
     @Override
             public void keyReleased(KeyEvent e ){
          int input = e.getKeyCode();

            if(input == KeyEvent.VK_W){
                up = true;
            }
            if(input == KeyEvent.VK_S){
                down = true ;
            }
            if(input == KeyEvent.VK_A){
                left = true ;
            }
            if(input == KeyEvent.VK_D){
                right = true ;
            }

        }










    }

