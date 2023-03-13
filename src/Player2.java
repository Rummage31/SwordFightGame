import javax.swing.*;
import java.awt.*;

public class Player2 extends JPanel {
    int health, moveSpeed, damage = 0;


    public Player2(){
        health = 100;

    }
    public void p2Attack1(){

    }

    public void p2Attack2() {

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(new Color(100,100,100));
        g.fillRect(900,0,2000,100);
    }
}
