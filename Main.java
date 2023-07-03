import javax.swing.*;mport javax.swing.JFrame;// JFrame is used to create a window


public class Main{

    public static void main(String[] args){

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setResizable(false);

        window.setTitle("RPG"); // This will give the name of the window.

        window.setLocationRelativeTo(null);// This will make the window appear in the center

        window.setVisible(true); // Inorder to see the window

    }





}
