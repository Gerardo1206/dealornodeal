package custom;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class CustomPanel extends JPanel {
    
    
    @Override
    public void paint(Graphics g){
        Image image = new ImageIcon(getClass().getResource("/Images/a.png")).getImage();
        g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
    public void clean(){
        Graphics a=this.getGraphics();
        Image img = new ImageIcon(getClass().getResource("/Images/b.png")).getImage();
        a.drawImage(img, 0 ,0, this.getWidth(),this.getHeight(),this);
        setOpaque(false);
        super.paint(a);
    }
    public void clean2(){
        Graphics a=this.getGraphics();
        Image img = new ImageIcon(getClass().getResource("/Images/a.png")).getImage();
        a.drawImage(img, 0 ,0, this.getWidth(),this.getHeight(),this);
        setOpaque(false);
        super.paint(a);
    
    }
}
