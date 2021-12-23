import javax.swing.*;
import java.awt.*;

public class SchrumpfendesRechteck {
    int x;
    int y;
    boolean isDone;

    public static void main(String[] args) {
        SchrumpfendesRechteck app = new SchrumpfendesRechteck();
        app.show();
    }
    public void show(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,270);
        frame.setVisible(true);
        MyPanel myPanel = new MyPanel();
        frame.add(myPanel);
        for (int i = 0; i < 126; ++i, ++y, x+=2 ){
            frame.repaint();
            try{
                Thread.sleep(50);
            }catch (Exception e){e.printStackTrace();}
        }
        isDone = true;
        JLabel LbErledigt = new JLabel("Erledigt! :-)");
        frame.add(BorderLayout.CENTER, LbErledigt);
        frame.repaint();
    }
    class MyPanel extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.white);
            if (!isDone) {g.fillRect(0,0,500,250);}
            g.setColor(Color.black);
            g.fillRect(x,y,500 - x * 2,250 - y * 2);
        }
    }
}