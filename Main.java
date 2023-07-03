import javax.swing.JFrame; // JFrame is used to create a window


public class Main{

    public static void main(String[] args){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(false);

        frame.setTitle("RPG"); // This will give the name of the window.

        frame.setLocationRelativeTo(null);// This will make the window appear in the center

        frame.setVisible(true); // Inorder to see the window

        GameSettingPanel gamesettingpanel = new GameSettingPanel();
        frame.add(gamesettingpanel);
        frame.pack();// This will ensure that the frame will be display in its desired size.
    }

}
