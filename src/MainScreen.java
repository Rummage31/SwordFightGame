import javax.swing.*;
import java.awt.*;

public class MainScreen extends JPanel{


    JButton playButton = new JButton("Play");
    JButton optionsButton = new JButton("Options");
    JButton quitButton = new JButton("Quit");
    JLabel blank = new JLabel();

    public MainScreen(){
        setBackground(new Color(87, 77, 77));
        setLayout(new GridLayout(6,3));

        add(blank);
        add(playButton);
        add(blank);
        add(optionsButton);
        add(blank);
        add(quitButton);
        add(blank);



    }
}
