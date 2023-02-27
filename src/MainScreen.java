import javax.swing.*;

public class MainScreen extends JPanel{


    JButton playButton = new JButton("Play");
    JButton optionsButton = new JButton("Options");
    JButton quitButton = new JButton("Quit");

    public MainScreen(){
        setSize(1000,1000);
        add(playButton);
        add(optionsButton);
        add(quitButton);

    }
}
