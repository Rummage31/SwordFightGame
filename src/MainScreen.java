import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);

            }

        });
        optionsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }

        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }

        });

    }
}
