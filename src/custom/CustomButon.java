/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custom;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author ceivg
 */
public class CustomButon extends JButton {
    @Override
    public void paint(Graphics g){
        Image image = new ImageIcon(getClass().getResource("/Images/3.png")).getImage();
        g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
    public void paint(Graphics g,Image a){
        g.drawImage(a, 0, 0, getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
    
}
