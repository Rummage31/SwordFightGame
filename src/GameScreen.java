import javax.swing.*;
import java.awt.*;

public class GameScreen extends JPanel {
        public GameScreen(){
            setBackground(new Color(245, 44, 44));
            setVisible(true);
            setFocusable(true);
        }

        public void paintComponent(Graphics g){
            super.paintComponent(g);

            g.fillRect(900,0,2000,100);
        }
}
