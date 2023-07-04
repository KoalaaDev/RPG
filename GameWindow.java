import javax.swing.JFrame;

public class GameWindow extends JFrame{

    public GameWindow(GameSettingPanel GameSettingPanel){
         JFrame frame  = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("RPG"); // This will give the name of the window.
        frame.setLocationRelativeTo(null);// This will make the window appear in the center
        frame.add(GameSettingPanel);
        frame.setVisible(true); // Inorder to see the window
        frame.pack();
       // frame.setSize(500,500);

    }



}


