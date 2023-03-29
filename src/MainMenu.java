import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame {

    private MainScreen ms;
    private Image bg;
    private Image sIdleL;
    private Boolean loaded;

    public static void main(String[] args) {
       // new Game();

        DisplayMode dm = new DisplayMode(800,600,16,DisplayMode.REFRESH_RATE_UNKNOWN);
        MainMenu mm = new MainMenu();
        mm.run(dm);
    }




    //makes screen to full screen and waits the puts it back to normal after some time
    public void run(DisplayMode dm){
        setBackground(new Color(108, 104, 104));
        setForeground(new Color(224, 52, 52));
        setFont(new Font("Arial",Font.BOLD, 100));
        loaded = false;

        ms = new MainScreen();
        try{
            ms.setFullScreen(dm, this);
            loadIMS();
                try{
                    Thread.sleep(5000);
                }catch(Exception e){}
        }finally{
            ms.restoreScreen();
        }

    }

    //loads ims
    public void loadIMS(){
        bg = new ImageIcon("C:\\Users\\Jackz\\Downloads\\msbg.jpg").getImage();
        sIdleL = new ImageIcon("C:\\Users\\Jackz\\Downloads\\New Piskel-1.png.png").getImage();
        bg.getScaledInstance(1000,1000,1);
        loaded = true;
        repaint();

    }


    public void paint(Graphics g){
        if(g instanceof Graphics2D){
            //makes whatever g is a 2dGraphics obj so I can use 2dGraphics methods on it
            Graphics2D g2 = (Graphics2D)g;
            //makes text look better
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        }
        if(loaded) {
            g.drawString("SEVER    V.S.   ESHMEN", 700, 100);
            g.drawImage(bg,0,0,null);
            g.drawImage(sIdleL,170,90,null);

        }
    }


}