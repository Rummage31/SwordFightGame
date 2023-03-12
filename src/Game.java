import javax.swing.*;

public class Game {
    public Game(){
        // Makes the main menu GUI
        MainScreen ms = new MainScreen();
        JFrame mFrame = new JFrame();

        // Makes the playable screen
        GameScreen gs= new GameScreen();
        JFrame gsFrame = new JFrame();


        mFrame.add(ms);
        mFrame.setSize(2000,1500);
        mFrame.setVisible(true);

        gsFrame.add(gs);
        gsFrame.setSize(2000,1500);
    }
}
