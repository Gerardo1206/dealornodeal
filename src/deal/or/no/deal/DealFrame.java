/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deal.or.no.deal;

import java.awt.Image;
import java.awt.Toolkit;
import Tipografias.Fuentes;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author ceivg
 */
public class DealFrame extends javax.swing.JFrame implements ActionListener {
    public static ArrayList<String>value=new ArrayList<>();
    public JButton yc;
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Images/icono.png"));


        return retValue;
    }
    
    
    
    /**
     * Creates new form DealFrame
     */
    Fuentes tip;
    public DealFrame() {
        value.add("1");
        value.add("2");
        value.add("5");
        value.add("10");
        value.add("25");
        value.add("50");
        value.add("75");
        value.add("100");
        value.add("200");
        value.add("300");
        value.add("400");
        value.add("500");
        value.add("750");
        value.add("1,000");
        value.add("5,000");
        value.add("10,000");
        value.add("25,000");
        value.add("50,000");
        value.add("75,000");
        value.add("100,000");
        value.add("200,000");
        value.add("300,000");
        value.add("400,000");
        value.add("500,000");
        value.add("750,000");
        value.add("1,000,000");
        
        initComponents();
        tip = new Fuentes();
        jLabel14.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel22.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel25.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel26.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel34.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel37.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel44.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel45.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel46.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel47.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel48.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel49.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel50.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel51.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel52.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel53.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel56.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel57.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel60.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel61.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel62.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel63.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel66.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel67.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel68.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel69.setFont(tip.fuente(tip.RIO, 0, 20));
        lblMsg.setFont(tip.fuente(tip.RIO, 0, 24));
        jLabel70.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel71.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel72.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel73.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel74.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel75.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel76.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel77.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel78.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel79.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel80.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel81.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel82.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel83.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel15.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel23.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel27.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel28.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel35.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel38.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel54.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel55.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel58.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel59.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel64.setFont(tip.fuente(tip.RIO, 0, 20));       
        jLabel65.setFont(tip.fuente(tip.RIO, 0, 20));
        jLabel1.setFont(tip.fuente(tip.RIO, 0, 17));
        btn21.setIcon(setIcono("/Images/21a.png",btn21));
        btn21.setRolloverIcon(setIcono("/Images/21b.png",btn21));
        btn2.setIcon(setIcono("/Images/2a.png",btn2));
        btn2.setRolloverIcon(setIcono("/Images/2b.png",btn2));
        btn1.setIcon(setIcono("/Images/1a.png",btn1));
        btn1.setRolloverIcon(setIcono("/Images/1b.png",btn1));
        btn3.setIcon(setIcono("/Images/3a.png",btn3));
        btn3.setRolloverIcon(setIcono("/Images/3b.png",btn3));
        btn4.setIcon(setIcono("/Images/4a.png",btn4));
        btn4.setRolloverIcon(setIcono("/Images/4b.png",btn4));
        btn5.setIcon(setIcono("/Images/5a.png",btn5));
        btn5.setRolloverIcon(setIcono("/Images/5b.png",btn5));
        btn6.setIcon(setIcono("/Images/6a.png",btn6));
        btn6.setRolloverIcon(setIcono("/Images/6b.png",btn6));
        btn7.setIcon(setIcono("/Images/7a.png",btn7));
        btn7.setRolloverIcon(setIcono("/Images/7b.png",btn7));
        btn8.setIcon(setIcono("/Images/8a.png",btn8));
        btn8.setRolloverIcon(setIcono("/Images/8b.png",btn8));
        btn9.setIcon(setIcono("/Images/9a.png",btn9));
        btn9.setRolloverIcon(setIcono("/Images/9b.png",btn9));
        btn10.setIcon(setIcono("/Images/10a.png",btn10));
        btn10.setRolloverIcon(setIcono("/Images/10b.png",btn10));
        btn11.setIcon(setIcono("/Images/11a.png",btn11));
        btn11.setRolloverIcon(setIcono("/Images/11b.png",btn11));
        btn12.setIcon(setIcono("/Images/12a.png",btn12));
        btn12.setRolloverIcon(setIcono("/Images/12b.png",btn12));
        btn13.setIcon(setIcono("/Images/13a.png",btn13));
        btn13.setRolloverIcon(setIcono("/Images/13b.png",btn13));
        btn14.setIcon(setIcono("/Images/14a.png",btn14));
        btn14.setRolloverIcon(setIcono("/Images/14b.png",btn14));
        btn15.setIcon(setIcono("/Images/15a.png",btn15));
        btn15.setRolloverIcon(setIcono("/Images/15b.png",btn15));
        btn16.setIcon(setIcono("/Images/16a.png",btn16));
        btn16.setRolloverIcon(setIcono("/Images/16b.png",btn16));
        btn17.setIcon(setIcono("/Images/17a.png",btn17));
        btn17.setRolloverIcon(setIcono("/Images/17b.png",btn17));
        btn18.setIcon(setIcono("/Images/18a.png",btn18));
        btn18.setRolloverIcon(setIcono("/Images/18b.png",btn18));
        btn19.setIcon(setIcono("/Images/19a.png",btn19));
        btn19.setRolloverIcon(setIcono("/Images/19b.png",btn19));
        btn20.setIcon(setIcono("/Images/20a.png",btn20));
        btn20.setRolloverIcon(setIcono("/Images/20b.png",btn20));
        btn22.setIcon(setIcono("/Images/22a.png",btn22));
        btn22.setRolloverIcon(setIcono("/Images/22b.png",btn22));
        btn23.setIcon(setIcono("/Images/23a.png",btn23));
        btn23.setRolloverIcon(setIcono("/Images/23b.png",btn23));
        btn24.setIcon(setIcono("/Images/24a.png",btn24));
        btn24.setRolloverIcon(setIcono("/Images/24b.png",btn24));
        btn25.setIcon(setIcono("/Images/25a.png",btn25));
        btn25.setRolloverIcon(setIcono("/Images/25b.png",btn25));
        btn26.setIcon(setIcono("/Images/26a.png",btn26));
        btn26.setRolloverIcon(setIcono("/Images/26b.png",btn26));
        btn27.setIcon(setIcono("/Images/yc.png",btn27));
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn10.addActionListener(this);
        btn11.addActionListener(this);
        btn12.addActionListener(this);
        btn13.addActionListener(this);
        btn14.addActionListener(this);
        btn15.addActionListener(this);
        btn16.addActionListener(this);
        btn17.addActionListener(this);
        btn18.addActionListener(this);
        btn19.addActionListener(this);
        btn20.addActionListener(this);
        btn21.addActionListener(this);
        btn22.addActionListener(this);
        btn23.addActionListener(this);
        btn24.addActionListener(this);
        btn25.addActionListener(this);
        btn26.addActionListener(this);
    }   


    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        customPanel75 = new custom.CustomPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        customPanel2 = new custom.CustomPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        customPanel100 = new custom.CustomPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        customPanel5 = new custom.CustomPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        customPanel25 = new custom.CustomPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        customPanel500 = new custom.CustomPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        customPanel50 = new custom.CustomPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        customPanel400 = new custom.CustomPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        customPanel200 = new custom.CustomPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        customPanel10 = new custom.CustomPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        customPanel750 = new custom.CustomPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        customPanel300 = new custom.CustomPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        customPanel1 = new custom.CustomPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn27 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        customPanel100000 = new custom.CustomPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        customPanel5000 = new custom.CustomPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        customPanel200000 = new custom.CustomPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        customPanel10000 = new custom.CustomPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        customPanel50000 = new custom.CustomPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        customPanel750000 = new custom.CustomPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        customPanel75000 = new custom.CustomPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        customPanel500000 = new custom.CustomPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        customPanel300000 = new custom.CustomPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        customPanel25000 = new custom.CustomPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        customPanel1000000 = new custom.CustomPanel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        customPanel400000 = new custom.CustomPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        customPanel1000 = new custom.CustomPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Deal or no deal");
        setBackground(getForeground());
        setIconImage(getIconImage());

        customPanel75.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel48.setText("75");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel49.setText("$");

        javax.swing.GroupLayout customPanel75Layout = new javax.swing.GroupLayout(customPanel75);
        customPanel75.setLayout(customPanel75Layout);
        customPanel75Layout.setHorizontalGroup(
            customPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel75Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel75Layout.setVerticalGroup(
            customPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel75Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)))
        );

        customPanel2.setBackground(new java.awt.Color(0, 0, 0));
        customPanel2.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel22.setText("2");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel34.setText("$");

        javax.swing.GroupLayout customPanel2Layout = new javax.swing.GroupLayout(customPanel2);
        customPanel2.setLayout(customPanel2Layout);
        customPanel2Layout.setHorizontalGroup(
            customPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel2Layout.setVerticalGroup(
            customPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel2Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(customPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        customPanel100.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel50.setText("100");

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel51.setText("$");

        javax.swing.GroupLayout customPanel100Layout = new javax.swing.GroupLayout(customPanel100);
        customPanel100.setLayout(customPanel100Layout);
        customPanel100Layout.setHorizontalGroup(
            customPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel100Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel100Layout.setVerticalGroup(
            customPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel100Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)))
        );

        customPanel5.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel44.setText("5");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel45.setText("$");

        javax.swing.GroupLayout customPanel5Layout = new javax.swing.GroupLayout(customPanel5);
        customPanel5.setLayout(customPanel5Layout);
        customPanel5Layout.setHorizontalGroup(
            customPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel5Layout.setVerticalGroup(
            customPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)))
        );

        customPanel25.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel52.setText("25");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel53.setText("$");

        javax.swing.GroupLayout customPanel25Layout = new javax.swing.GroupLayout(customPanel25);
        customPanel25.setLayout(customPanel25Layout);
        customPanel25Layout.setHorizontalGroup(
            customPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel25Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel25Layout.setVerticalGroup(
            customPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel25Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53)))
        );

        customPanel500.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel66.setText("500");

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel67.setText("$");

        javax.swing.GroupLayout customPanel500Layout = new javax.swing.GroupLayout(customPanel500);
        customPanel500.setLayout(customPanel500Layout);
        customPanel500Layout.setHorizontalGroup(
            customPanel500Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel500Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel500Layout.setVerticalGroup(
            customPanel500Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel500Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel500Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67)))
        );

        customPanel50.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel46.setText("50");

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel47.setText("$");

        javax.swing.GroupLayout customPanel50Layout = new javax.swing.GroupLayout(customPanel50);
        customPanel50.setLayout(customPanel50Layout);
        customPanel50Layout.setHorizontalGroup(
            customPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel50Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel50Layout.setVerticalGroup(
            customPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel50Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47)))
        );

        customPanel400.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel60.setText("400");

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel61.setText("$");

        javax.swing.GroupLayout customPanel400Layout = new javax.swing.GroupLayout(customPanel400);
        customPanel400.setLayout(customPanel400Layout);
        customPanel400Layout.setHorizontalGroup(
            customPanel400Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel400Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel400Layout.setVerticalGroup(
            customPanel400Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel400Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel400Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61)))
        );

        customPanel200.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel68.setText("200");

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel69.setText("$");

        javax.swing.GroupLayout customPanel200Layout = new javax.swing.GroupLayout(customPanel200);
        customPanel200.setLayout(customPanel200Layout);
        customPanel200Layout.setHorizontalGroup(
            customPanel200Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel200Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jLabel68)
                .addContainerGap())
        );
        customPanel200Layout.setVerticalGroup(
            customPanel200Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel200Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel200Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69)))
        );

        customPanel10.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel25.setText("10");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel37.setText("$");

        javax.swing.GroupLayout customPanel10Layout = new javax.swing.GroupLayout(customPanel10);
        customPanel10.setLayout(customPanel10Layout);
        customPanel10Layout.setHorizontalGroup(
            customPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel10Layout.setVerticalGroup(
            customPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)))
        );

        customPanel750.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel63.setText("$");

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel62.setText("750");
        jLabel62.setPreferredSize(new java.awt.Dimension(105, 25));

        javax.swing.GroupLayout customPanel750Layout = new javax.swing.GroupLayout(customPanel750);
        customPanel750.setLayout(customPanel750Layout);
        customPanel750Layout.setHorizontalGroup(
            customPanel750Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel750Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel750Layout.setVerticalGroup(
            customPanel750Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel750Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel750Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        customPanel300.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel56.setText("300");

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel57.setText("$");

        javax.swing.GroupLayout customPanel300Layout = new javax.swing.GroupLayout(customPanel300);
        customPanel300.setLayout(customPanel300Layout);
        customPanel300Layout.setHorizontalGroup(
            customPanel300Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel300Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel300Layout.setVerticalGroup(
            customPanel300Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel300Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel300Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57)))
        );

        customPanel1.setBackground(new java.awt.Color(0, 0, 0));
        customPanel1.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel14.setText("1");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel26.setText("$");

        javax.swing.GroupLayout customPanel1Layout = new javax.swing.GroupLayout(customPanel1);
        customPanel1.setLayout(customPanel1Layout);
        customPanel1Layout.setHorizontalGroup(
            customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel1Layout.setVerticalGroup(
            customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("YOUR CASE");

        btn27.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn27.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn27.setBorderPainted(false);
        btn27.setContentAreaFilled(false);
        btn27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn27MouseEntered(evt);
            }
        });
        btn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(customPanel75, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(customPanel100, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(customPanel200, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(customPanel300, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(customPanel400, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(customPanel500, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(customPanel750, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(customPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(customPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(customPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(customPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(customPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(customPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPanel75, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPanel100, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPanel200, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPanel300, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPanel400, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPanel500, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPanel750, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        customPanel100000.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel54.setText("100,000");

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel55.setText("$");

        javax.swing.GroupLayout customPanel100000Layout = new javax.swing.GroupLayout(customPanel100000);
        customPanel100000.setLayout(customPanel100000Layout);
        customPanel100000Layout.setHorizontalGroup(
            customPanel100000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel100000Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel100000Layout.setVerticalGroup(
            customPanel100000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel100000Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel100000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55)))
        );

        customPanel5000.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel23.setText("5,000");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel35.setText("$");

        javax.swing.GroupLayout customPanel5000Layout = new javax.swing.GroupLayout(customPanel5000);
        customPanel5000.setLayout(customPanel5000Layout);
        customPanel5000Layout.setHorizontalGroup(
            customPanel5000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel5000Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel5000Layout.setVerticalGroup(
            customPanel5000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel5000Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(customPanel5000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        customPanel200000.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel58.setText("200,000");

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel59.setText("$");

        javax.swing.GroupLayout customPanel200000Layout = new javax.swing.GroupLayout(customPanel200000);
        customPanel200000.setLayout(customPanel200000Layout);
        customPanel200000Layout.setHorizontalGroup(
            customPanel200000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel200000Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel200000Layout.setVerticalGroup(
            customPanel200000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel200000Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel200000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59)))
        );

        customPanel10000.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel64.setText("10,000");

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel65.setText("$");

        javax.swing.GroupLayout customPanel10000Layout = new javax.swing.GroupLayout(customPanel10000);
        customPanel10000.setLayout(customPanel10000Layout);
        customPanel10000Layout.setHorizontalGroup(
            customPanel10000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel10000Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel10000Layout.setVerticalGroup(
            customPanel10000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel10000Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel10000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65)))
        );

        customPanel50000.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel70.setText("50,000");

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel71.setText("$");

        javax.swing.GroupLayout customPanel50000Layout = new javax.swing.GroupLayout(customPanel50000);
        customPanel50000.setLayout(customPanel50000Layout);
        customPanel50000Layout.setHorizontalGroup(
            customPanel50000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel50000Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel50000Layout.setVerticalGroup(
            customPanel50000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel50000Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel50000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71)))
        );

        customPanel750000.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel72.setText("750,000");

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel73.setText("$");

        javax.swing.GroupLayout customPanel750000Layout = new javax.swing.GroupLayout(customPanel750000);
        customPanel750000.setLayout(customPanel750000Layout);
        customPanel750000Layout.setHorizontalGroup(
            customPanel750000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel750000Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel750000Layout.setVerticalGroup(
            customPanel750000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel750000Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel750000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73)))
        );

        customPanel75000.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel74.setText("75,000");

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel75.setText("$");

        javax.swing.GroupLayout customPanel75000Layout = new javax.swing.GroupLayout(customPanel75000);
        customPanel75000.setLayout(customPanel75000Layout);
        customPanel75000Layout.setHorizontalGroup(
            customPanel75000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel75000Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel75)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel75000Layout.setVerticalGroup(
            customPanel75000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel75000Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel75000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75)))
        );

        customPanel500000.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel76.setText("500,000");

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel77.setText("$");

        javax.swing.GroupLayout customPanel500000Layout = new javax.swing.GroupLayout(customPanel500000);
        customPanel500000.setLayout(customPanel500000Layout);
        customPanel500000Layout.setHorizontalGroup(
            customPanel500000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel500000Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel500000Layout.setVerticalGroup(
            customPanel500000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel500000Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel500000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77)))
        );

        customPanel300000.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel78.setText("300,000");

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel79.setText("$");

        javax.swing.GroupLayout customPanel300000Layout = new javax.swing.GroupLayout(customPanel300000);
        customPanel300000.setLayout(customPanel300000Layout);
        customPanel300000Layout.setHorizontalGroup(
            customPanel300000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel300000Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel300000Layout.setVerticalGroup(
            customPanel300000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel300000Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel300000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79)))
        );

        customPanel25000.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel27.setText("25,000");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel38.setText("$");

        javax.swing.GroupLayout customPanel25000Layout = new javax.swing.GroupLayout(customPanel25000);
        customPanel25000.setLayout(customPanel25000Layout);
        customPanel25000Layout.setHorizontalGroup(
            customPanel25000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel25000Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel25000Layout.setVerticalGroup(
            customPanel25000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel25000Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel25000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)))
        );

        customPanel1000000.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel80.setText("$");

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel81.setText("1,000,000");
        jLabel81.setPreferredSize(new java.awt.Dimension(105, 25));

        javax.swing.GroupLayout customPanel1000000Layout = new javax.swing.GroupLayout(customPanel1000000);
        customPanel1000000.setLayout(customPanel1000000Layout);
        customPanel1000000Layout.setHorizontalGroup(
            customPanel1000000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel1000000Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel1000000Layout.setVerticalGroup(
            customPanel1000000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel1000000Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel1000000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        customPanel400000.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel82.setText("400,000");

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel83.setText("$");

        javax.swing.GroupLayout customPanel400000Layout = new javax.swing.GroupLayout(customPanel400000);
        customPanel400000.setLayout(customPanel400000Layout);
        customPanel400000Layout.setHorizontalGroup(
            customPanel400000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel400000Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel400000Layout.setVerticalGroup(
            customPanel400000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel400000Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel400000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel83)))
        );

        customPanel1000.setPreferredSize(new java.awt.Dimension(145, 35));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel15.setText("1,000");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel28.setText("$");

        javax.swing.GroupLayout customPanel1000Layout = new javax.swing.GroupLayout(customPanel1000);
        customPanel1000.setLayout(customPanel1000Layout);
        customPanel1000Layout.setHorizontalGroup(
            customPanel1000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel1000Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customPanel1000Layout.setVerticalGroup(
            customPanel1000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel1000Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(customPanel1000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customPanel25000, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customPanel50000, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customPanel75000, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customPanel100000, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customPanel200000, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customPanel300000, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customPanel400000, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customPanel500000, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customPanel750000, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customPanel1000000, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customPanel1000, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customPanel5000, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customPanel10000, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customPanel1000, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPanel5000, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPanel10000, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(customPanel25000, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPanel50000, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPanel75000, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPanel100000, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPanel200000, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPanel300000, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPanel400000, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPanel500000, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPanel750000, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPanel1000000, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/2.png"))); // NOI18N

        btn2.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn2.setBorderPainted(false);
        btn2.setContentAreaFilled(false);
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2MouseEntered(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn21.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn21.setBorderPainted(false);
        btn21.setContentAreaFilled(false);
        btn21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn21MouseEntered(evt);
            }
        });
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1MouseEntered(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn3.setBorderPainted(false);
        btn3.setContentAreaFilled(false);
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn3MouseEntered(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn4.setBorderPainted(false);
        btn4.setContentAreaFilled(false);
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn4MouseEntered(evt);
            }
        });
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn5.setBorderPainted(false);
        btn5.setContentAreaFilled(false);
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn5MouseEntered(evt);
            }
        });
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn6.setBorderPainted(false);
        btn6.setContentAreaFilled(false);
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn6MouseEntered(evt);
            }
        });
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn8.setBorderPainted(false);
        btn8.setContentAreaFilled(false);
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn8MouseEntered(evt);
            }
        });
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn7.setBorderPainted(false);
        btn7.setContentAreaFilled(false);
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn7MouseEntered(evt);
            }
        });
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn9.setBorderPainted(false);
        btn9.setContentAreaFilled(false);
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn9MouseEntered(evt);
            }
        });
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn10.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn10.setBorderPainted(false);
        btn10.setContentAreaFilled(false);
        btn10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn10MouseEntered(evt);
            }
        });
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn12.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn12.setBorderPainted(false);
        btn12.setContentAreaFilled(false);
        btn12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn12MouseEntered(evt);
            }
        });
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn13.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn13.setBorderPainted(false);
        btn13.setContentAreaFilled(false);
        btn13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn13MouseEntered(evt);
            }
        });
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn11.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn11.setBorderPainted(false);
        btn11.setContentAreaFilled(false);
        btn11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn11MouseEntered(evt);
            }
        });
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn20.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn20.setBorderPainted(false);
        btn20.setContentAreaFilled(false);
        btn20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn20MouseEntered(evt);
            }
        });
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btn19.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn19.setBorderPainted(false);
        btn19.setContentAreaFilled(false);
        btn19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn19MouseEntered(evt);
            }
        });
        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn19ActionPerformed(evt);
            }
        });

        btn18.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn18.setBorderPainted(false);
        btn18.setContentAreaFilled(false);
        btn18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn18MouseEntered(evt);
            }
        });
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });

        btn17.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn17.setBorderPainted(false);
        btn17.setContentAreaFilled(false);
        btn17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn17MouseEntered(evt);
            }
        });

        btn16.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn16.setBorderPainted(false);
        btn16.setContentAreaFilled(false);
        btn16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn16MouseEntered(evt);
            }
        });

        btn15.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn15.setBorderPainted(false);
        btn15.setContentAreaFilled(false);
        btn15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn15MouseEntered(evt);
            }
        });

        btn14.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn14.setBorderPainted(false);
        btn14.setContentAreaFilled(false);
        btn14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn14MouseEntered(evt);
            }
        });

        btn22.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn22.setBorderPainted(false);
        btn22.setContentAreaFilled(false);
        btn22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn22MouseEntered(evt);
            }
        });

        btn23.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn23.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn23.setBorderPainted(false);
        btn23.setContentAreaFilled(false);
        btn23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn23MouseEntered(evt);
            }
        });

        btn24.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn24.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn24.setBorderPainted(false);
        btn24.setContentAreaFilled(false);
        btn24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn24MouseEntered(evt);
            }
        });
        btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn24ActionPerformed(evt);
            }
        });

        btn25.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn25.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn25.setBorderPainted(false);
        btn25.setContentAreaFilled(false);
        btn25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn25MouseEntered(evt);
            }
        });
        btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn25ActionPerformed(evt);
            }
        });

        btn26.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        btn26.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn26.setBorderPainted(false);
        btn26.setContentAreaFilled(false);
        btn26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn26MouseEntered(evt);
            }
        });
        btn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn26ActionPerformed(evt);
            }
        });

        lblMsg.setBackground(new java.awt.Color(0, 0, 0));
        lblMsg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblMsg.setForeground(new java.awt.Color(255, 255, 255));
        lblMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMsg.setText("SELECT YOUR CASE");
        lblMsg.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(95, 95, 95)))))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 969, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn1, btn2, btn21, btn3, btn4, btn5, btn6});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn21, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(btn22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn1, btn2, btn21, btn3, btn4, btn5, btn6});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2MouseEntered

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn21MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn21MouseEntered

    private void btn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1MouseEntered

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn3MouseEntered

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn4MouseEntered

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn5MouseEntered

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn6MouseEntered

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn8MouseEntered

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn7MouseEntered

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn9MouseEntered

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn10MouseEntered

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn12MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn12MouseEntered

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn13MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn13MouseEntered

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn11MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn11MouseEntered

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn20MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn20MouseEntered

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn19MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn19MouseEntered

    private void btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn19ActionPerformed

    private void btn18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn18MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn18MouseEntered

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn18ActionPerformed

    private void btn17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn17MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn17MouseEntered

    private void btn16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn16MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn16MouseEntered

    private void btn15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn15MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn15MouseEntered

    private void btn14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn14MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn14MouseEntered

    private void btn22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn22MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn22MouseEntered

    private void btn23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn23MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn23MouseEntered

    private void btn24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn24MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn24MouseEntered

    private void btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn24ActionPerformed

    private void btn25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn25MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn25MouseEntered

    private void btn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn25ActionPerformed

    private void btn26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn26MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn26MouseEntered

    private void btn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn26ActionPerformed

    private void btn27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn27MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn27MouseEntered

    private void btn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn27ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn21ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DealFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DealFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DealFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DealFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DealFrame().setVisible(true);
            }
        });
        
        
        
    }

    public Icon setIcono(String a,JButton b){
        ImageIcon icon = new ImageIcon(getClass().getResource(a));
        int anc = b.getWidth();
        int alt = b.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(anc, alt, Image.SCALE_DEFAULT));
        return icono;
    }
    
    public static Integer i=0;
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private custom.CustomPanel customPanel1;
    private custom.CustomPanel customPanel10;
    private custom.CustomPanel customPanel100;
    private custom.CustomPanel customPanel1000;
    private custom.CustomPanel customPanel10000;
    private custom.CustomPanel customPanel100000;
    private custom.CustomPanel customPanel1000000;
    private custom.CustomPanel customPanel2;
    private custom.CustomPanel customPanel200;
    private custom.CustomPanel customPanel200000;
    private custom.CustomPanel customPanel25;
    private custom.CustomPanel customPanel25000;
    private custom.CustomPanel customPanel300;
    private custom.CustomPanel customPanel300000;
    private custom.CustomPanel customPanel400;
    private custom.CustomPanel customPanel400000;
    private custom.CustomPanel customPanel5;
    private custom.CustomPanel customPanel50;
    private custom.CustomPanel customPanel500;
    private custom.CustomPanel customPanel5000;
    private custom.CustomPanel customPanel50000;
    private custom.CustomPanel customPanel500000;
    private custom.CustomPanel customPanel75;
    private custom.CustomPanel customPanel750;
    private custom.CustomPanel customPanel75000;
    private custom.CustomPanel customPanel750000;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblMsg;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1){
            evaluarjuego(btn1,"1");
        }
        if(e.getSource()==btn2){
            evaluarjuego(btn2,"2");
        }
        if(e.getSource()==btn3){
            evaluarjuego(btn3,"3");
        }
        if(e.getSource()==btn4){
            evaluarjuego(btn4,"4");
        }
        if(e.getSource()==btn5){
            evaluarjuego(btn5,"5");
        }
        if(e.getSource()==btn6){
            evaluarjuego(btn6,"6");
        }
        if(e.getSource()==btn7){
            evaluarjuego(btn7,"7");
        }
        if(e.getSource()==btn8){
            evaluarjuego(btn8,"8");
        }
        if(e.getSource()==btn9){
            evaluarjuego(btn9,"9");
        }
        if(e.getSource()==btn10){
            evaluarjuego(btn10,"10");
        }
        if(e.getSource()==btn11){
            evaluarjuego(btn11,"11");
        }
        if(e.getSource()==btn12){
            evaluarjuego(btn12,"12");
        }
        if(e.getSource()==btn13){
            evaluarjuego(btn13,"13");
        }
        if(e.getSource()==btn14){
            evaluarjuego(btn14,"14");
        }
        if(e.getSource()==btn15){
            evaluarjuego(btn15,"15");
        }
        if(e.getSource()==btn16){
            evaluarjuego(btn16,"16");
        }
        if(e.getSource()==btn17){
            evaluarjuego(btn17,"17");
        }
        if(e.getSource()==btn18){
            evaluarjuego(btn18,"18");
        }
        if(e.getSource()==btn19){
            evaluarjuego(btn19,"19");
        }
        if(e.getSource()==btn20){
            evaluarjuego(btn20,"20");
        }
        if(e.getSource()==btn21){
            evaluarjuego(btn21,"21");
        }
        if(e.getSource()==btn22){
            evaluarjuego(btn22,"22");
        }
        if(e.getSource()==btn23){
            evaluarjuego(btn23,"23");
        }
        if(e.getSource()==btn24){
            evaluarjuego(btn24,"24");
        }
        if(e.getSource()==btn25){
            evaluarjuego(btn25,"25");
        }
        if(e.getSource()==btn26){
            evaluarjuego(btn26,"26");
        }
        
        
    }
    
    public void evaluarjuego(JButton a,String b){
        switch(i){
                case 0:jugar(a,b);
                yc=a;
                i++;
                break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                case 12:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    int pos=((int) (Math.random() * value.size()));
                    apagar(value.get(pos));
                    JOptionPane.showMessageDialog(this, value.get(pos),"case", 0);
                    value.remove(pos);
                    a.setVisible(false); 
                    i++;
                break;
                case 6:
                case 11:
                case 15:
                case 18:
                case 20:
                case 21:
                case 22:
                case 23:
                    pos=((int) (Math.random() * value.size()));
                    apagar(value.get(pos));
                    JOptionPane.showMessageDialog(this, value.get(pos),"case", 0);
                    a.setVisible(false);
                    value.remove(pos);
                    Integer oferta=calcularoferta();
                    oferta=oferta/value.size()-1;
                    int respuesta=JOptionPane.showConfirmDialog(this, "La banca ofrece:"+oferta,"Oferta de la banca",JOptionPane.YES_NO_OPTION);
                    if(respuesta==0){
                        JOptionPane.showMessageDialog(this,"Felicidades Ganaste :$"+oferta ,"fin del juego", 0);
                        i=-1;
                        resetcase();
                    }
                    
                    i++;
                    break;
                case 24:
                    pos=((int) (Math.random() * value.size()));
                    JOptionPane.showMessageDialog(this, value.get(pos),"case", 0);
                    apagar(value.get(pos));
                    value.remove(pos);
                    a.setVisible(false);
                    oferta=calcularoferta();
                    oferta=oferta/value.size()-1;
                    respuesta=JOptionPane.showConfirmDialog(this, "La banca ofrece:"+oferta,"Oferta de la banca",JOptionPane.YES_NO_OPTION);
                    if(respuesta==0){
                        JOptionPane.showMessageDialog(this,"Felicidades Ganaste:$ "+oferta ,"fin del juego", 0);
                        i=0;
                        resetcase();
                    }i++;
                    respuesta=JOptionPane.showConfirmDialog(this, "¿Deseas quedarte tu maletin?","Utimo maletin",JOptionPane.YES_NO_OPTION);
                    if(respuesta==0){
                        JOptionPane.showMessageDialog(this,"Felicidades ganaste: $"+ value.get(0),"case", 0);
                        i=0;
                        resetcase();
                    }else{
                        JOptionPane.showMessageDialog(this,"Felicidades ganaste: $"+ value.get(1),"case", 0);
                        i=0;
                        resetcase();
                    }
                    break;
                case 25:i=0;
                    resetcase();
                    break;
            }
    
    }
    
    public void jugar (JButton a, String b){
        a.setVisible(false);
        String d="/Images/"+b+"a.png";
        System.out.println(d);
        btn27.setIcon(setIcono(d,btn27));
        lblMsg.setText("Open a case");
    }
    public void resetcase(){
        value.clear();
        value.add("1");
        value.add("2");
        value.add("5");
        value.add("10");
        value.add("25");
        value.add("50");
        value.add("75");
        value.add("100");
        value.add("200");
        value.add("300");
        value.add("400");
        value.add("500");
        value.add("750");
        value.add("1,000");
        value.add("5,000");
        value.add("10,000");
        value.add("25,000");
        value.add("50,000");
        value.add("75,000");
        value.add("100,000");
        value.add("200,000");
        value.add("300,000");
        value.add("400,000");
        value.add("500,000");
        value.add("750,000");
        value.add("1,000,000");
        btn1.setVisible(true);
        btn2.setVisible(true);
        btn3.setVisible(true);
        btn4.setVisible(true);
        btn5.setVisible(true);
        btn6.setVisible(true);
        btn7.setVisible(true);
        btn8.setVisible(true);
        btn9.setVisible(true);
        btn10.setVisible(true);
        btn11.setVisible(true);
        btn12.setVisible(true);
        btn13.setVisible(true);
        btn14.setVisible(true);
        btn15.setVisible(true);
        btn16.setVisible(true);
        btn17.setVisible(true);
        btn18.setVisible(true);
        btn19.setVisible(true);
        btn20.setVisible(true);
        btn21.setVisible(true);
        btn22.setVisible(true);
        btn23.setVisible(true);
        btn24.setVisible(true);
        btn25.setVisible(true);
        btn26.setVisible(true);
        btn27.setIcon(setIcono("/Images/yc.png",btn27));
        lblMsg.setText("Select your case");
                customPanel1.clean2();
                customPanel10.clean2();
                customPanel100.clean2();
                customPanel1000.clean2();
                customPanel10000.clean2();
                customPanel100000.clean2();
                customPanel1000000.clean2();
                customPanel2.clean2();
                customPanel200.clean2();
                customPanel200000.clean2();
                customPanel25.clean2();
                customPanel25000.clean2();
                customPanel300.clean2();
                customPanel300000.clean2();
                customPanel400.clean2();
                customPanel400000.clean2();
                customPanel5.clean2();
                customPanel50.clean2();
                customPanel500.clean2();
                customPanel5000.clean2();
                customPanel50000.clean2();
                customPanel500000.clean2();
                customPanel75.clean2();
                customPanel750.clean2();
                customPanel75000.clean2();
                customPanel750000.clean2();
        }
    public void apagar(String a){
        System.out.println(a);
        switch (a){
            case "1":
                customPanel1.clean();
                break;   
            case "10":
                customPanel10.clean();
                break;
            case "100":
                customPanel100.clean();
                break;
            case "1,000":
                customPanel1000.clean();
                break;
            case "10,000":
                customPanel10000.clean();
                break;
            case "100,000":
                customPanel100000.clean();
                break;
            case "1,000,000":
                customPanel1000000.clean();
                break;
            case "2":
                customPanel2.clean();
                break;
            case "200":
                customPanel200.clean();
                break;
            case "200,000":
                customPanel200000.clean();
                break;    
            case "25":
                customPanel25.clean();
                break;
            case "25,000":
                customPanel25000.clean();
                break;
            case "300":
                customPanel300.clean();
                break;
            case "300,000":
                customPanel300000.clean();
                break;
            case "400":
                customPanel400.clean();
                break;
            case "400,000":
                customPanel400000.clean();
                break;  
            case "5":
                customPanel5.clean();
                break;
            case "50":
                customPanel50.clean();
                break;
            case "500":
                customPanel500.clean();
                break;
             case "5,000":
                customPanel5000.clean();
                break;  
            case "50,000":
                customPanel50000.clean();
                break;
            case "500,000":
                customPanel500000.clean();
                break;
            case "75":
                customPanel75.clean();
                break;
            case "750":
                customPanel750.clean();
                break;
            case "75,000":
                customPanel75000.clean();
                break;  
            case "750,000":
                customPanel750000.clean();
                break;
        }
    }
        public Integer calcularoferta(){
        int i=0;
        Integer a=0;
        while(i<value.size()){
            switch (value.get(i)){
            case "1":
                a+=1;
                break;   
            case "10":
                a+=10;
                break;
            case "100":
                a+=100;
                break;
            case "1,000":
                a+=1000;
                break;
            case "10,000":
                a+=10000;
                break;
            case "100,000":
                a+=100000;
                break;
            case "1,000,000":
                a+=1000000;
                break;
            case "2":
                a+=2;
                break;
            case "200":
                a+=200;
                break;
            case "200,000":
                a+=200000;
                break;    
            case "25":
                a+=25;
                break;
            case "25,000":
                a+=25000;
                break;
            case "300":
                a+=300;
                break;
            case "300,000":
                a+=300000;
                break;
            case "400":
                a+=400;
                break;
            case "400,000":
                a+=400000;
                break;  
            case "5":
                a+=5;
                break;
            case "50":
                a+=50;
                break;
            case "500":
                a+=500;
                break;
             case "5,000":
                a+=5000;
                break;  
            case "50,000":
                a+=50000;
                break;
            case "500,000":
                a+=500000;
                break;
            case "75":
                a+=75;
                break;
            case "750":
                a+=750;
                break;
            case "75,000":
                a+=75000;
                break;  
            case "750,000":
                a+=750000;
                break;
        }
            i++;
        }
            System.out.println("///"+a);
        return a;
    }
         
}
