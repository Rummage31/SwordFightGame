import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen extends JPanel{


    private JButton playButton = new JButton("Play");
    private JButton optionsButton = new JButton("Options");
    private JButton quitButton = new JButton("Quit");
    private JLabel blank1 = new JLabel();

    private JLabel blank2 = new JLabel();

    private JLabel blank3 = new JLabel();

    private JLabel blank4 = new JLabel();
    private JLabel blank5 = new JLabel();
    private JLabel blank6 = new JLabel();
    private JLabel blank7 = new JLabel();
    private JLabel blank8 = new JLabel();

    private GraphicsDevice vc;

    //private Image;

    public MainScreen(){

        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        vc = env.getDefaultScreenDevice();

//        setBackground(new Color(87, 77, 77));
//        setLayout(new GridLayout(3,3));
//
//        add(blank1);
//        add(blank2);
//        add(playButton);
//        add(blank3);
//        add(blank4);
//        add(optionsButton);
//        add(blank5);
//        add(blank6);
//        add(quitButton);
//        add(blank7);
//        add(blank8);
//
//
//
//
//        playButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                setVisible(false);
//                //gsFrame.setVisible(true);
//            }
//
//        });
//        optionsButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//
//            }
//
//        });
//        quitButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);
//
//
//            }
//
//        });

    }
    public void setFullScreen(DisplayMode dm, JFrame window){
        //makes it so theres no scroll bar or tiltle.
        window.setUndecorated(true);
        window.setResizable(false);
        vc.setFullScreenWindow(window);
        //makes sure that the window can become fullscreen as long as it is given window settings
        if(dm != null && vc.isDisplayChangeSupported()){
            try{
                vc.setDisplayMode(dm);
            }catch(Exception e){}

        }


    }

    public Window getFullScreenWindow(){
        return vc.getFullScreenWindow();
    }

    public void restoreScreen(){
        Window w = vc.getFullScreenWindow();
        if(w != null){
            w.dispose();
        }
        vc.setFullScreenWindow(null);
    }


}
