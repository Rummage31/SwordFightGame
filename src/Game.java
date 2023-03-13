import javax.swing.*;

public class Game {
        public Game(){
        // Makes the main menu GUI
        MainScreen ms = new MainScreen();
        JFrame mFrame = new JFrame();

        // Makes the playable screen
        GameScreen gs= new GameScreen();
        JFrame gsFrame = new JFrame("gay");

        Player1 p1 = new Player1();
        Player2 p2 = new Player2();

        mFrame.add(ms);
        mFrame.setSize(2000,1200);
        mFrame.setVisible(true);

        gsFrame.add(gs);
        gsFrame.setSize(2000,1200);
        gsFrame.setVisible(true);


        gs.add(p1);
        gsFrame.add(p2);

        p1.setVisible(true);
        p2.setVisible(true);

    }
}
