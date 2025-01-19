/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Multiplayer implements MouseListener {
    JFrame frame;
    JLabel p1;
    JLabel p2;
    JLabel p3;
    JLabel p4;
    JLabel p5;
    JLabel p6;
    JLabel p7;
    JLabel p8;
    JLabel l_fb1;
    JLabel l_fb2;
    JLabel l_fb3;
    JLabel l_fb4;
    JLabel l_fb5;
    JLabel l_fb6;
    JLabel l_fb7;
    JLabel l_fb8;
    JLabel r_fb1;
    JLabel r_fb2;
    JLabel r_fb3;
    JLabel r_fb4;
    JLabel r_fb5;
    JLabel r_fb6;
    JLabel r_fb7;
    JLabel r_fb8;
    JLabel l_s1;
    JLabel l_s2;
    JLabel l_s3;
    JLabel l_s4;
    JLabel l_s5;
    JLabel l_s6;
    JLabel l_s7;
    JLabel l_s8;
    JLabel r_s1;
    JLabel r_s2;
    JLabel r_s3;
    JLabel r_s4;
    JLabel r_s5;
    JLabel r_s6;
    JLabel r_s7;
    JLabel r_s8;
    JLabel selector;
    JLabel back;
    ImageIcon image_p1;
    ImageIcon image_p2;
    ImageIcon image_p3; 
    ImageIcon image_p4;
    ImageIcon image_p5;
    ImageIcon image_p6;
    ImageIcon image_p7;
    ImageIcon image_p8;
    ImageIcon image_l_fb1;
    ImageIcon image_l_fb2;
    ImageIcon image_l_fb3;
    ImageIcon image_l_fb4;
    ImageIcon image_l_fb5;
    ImageIcon image_l_fb6;
    ImageIcon image_l_fb7;
    ImageIcon image_l_fb8;
    ImageIcon image_r_fb1;
    ImageIcon image_r_fb2;
    ImageIcon image_r_fb3;
    ImageIcon image_r_fb4;
    ImageIcon image_r_fb5;
    ImageIcon image_r_fb6;
    ImageIcon image_r_fb7;
    ImageIcon image_r_fb8;
    ImageIcon image_l_s1;
    ImageIcon image_l_s2;
    ImageIcon image_l_s3;
    ImageIcon image_l_s4;
    ImageIcon image_l_s5;
    ImageIcon image_l_s6;
    ImageIcon image_l_s7;
    ImageIcon image_l_s8;
    ImageIcon image_r_s1;
    ImageIcon image_r_s2;
    ImageIcon image_r_s3;
    ImageIcon image_r_s4;
    ImageIcon image_r_s5;
    ImageIcon image_r_s6;
    ImageIcon image_r_s7;
    ImageIcon image_r_s8;
    ImageIcon image_selector;
    ImageIcon image_back;
    ImageIcon bg;
    ImageIcon img;
    
    
    public Multiplayer(){
        bg=new ImageIcon("Project_Assets/bg_cyc_mp.png");
        img=new ImageIcon(bg.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT));
        
        image_p1=new ImageIcon("Project_Assets/p1.png");
        img=new ImageIcon(image_p1.getImage().getScaledInstance(147, 147, Image.SCALE_DEFAULT));
        p1=new JLabel(img);
        
        image_p2=new ImageIcon("Project_Assets/p2.png");
        img=new ImageIcon(image_p2.getImage().getScaledInstance(147, 147, Image.SCALE_DEFAULT));
        p2=new JLabel(img);
        
        image_p3=new ImageIcon("Project_Assets/p3.png");
        img=new ImageIcon(image_p3.getImage().getScaledInstance(147, 147, Image.SCALE_DEFAULT));
        p3=new JLabel(img);
        
        image_p4=new ImageIcon("Project_Assets/p4.png");
        img=new ImageIcon(image_p4.getImage().getScaledInstance(147, 147, Image.SCALE_DEFAULT));
        p4=new JLabel(img);
        
        image_p5=new ImageIcon("Project_Assets/p5.png");
        img=new ImageIcon(image_p5.getImage().getScaledInstance(147, 147, Image.SCALE_DEFAULT));
        p5=new JLabel(img);
        
        image_p6=new ImageIcon("Project_Assets/p6.png");
        img=new ImageIcon(image_p6.getImage().getScaledInstance(147, 147, Image.SCALE_DEFAULT));
        p6=new JLabel(img);
        
        image_p7=new ImageIcon("Project_Assets/p7.png");
        img=new ImageIcon(image_p7.getImage().getScaledInstance(147, 147, Image.SCALE_DEFAULT));
        p7=new JLabel(img);
        
        image_p8=new ImageIcon("Project_Assets/p8.png");
        img=new ImageIcon(image_p8.getImage().getScaledInstance(147, 147, Image.SCALE_DEFAULT));
        p8=new JLabel(img);
        
        image_selector=new ImageIcon("Project_Assets/selector.png");
        img=new ImageIcon(image_selector.getImage().getScaledInstance(147, 147, Image.SCALE_DEFAULT));
        selector=new JLabel(img);
        
        image_l_fb1=new ImageIcon("Project_Assets/l_fb1.png");
        img=new ImageIcon(image_l_fb1.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT));
        l_fb1=new JLabel(img);
        
        image_l_fb2=new ImageIcon("Project_Assets/l_fb2.png");
        img=new ImageIcon(image_l_fb2.getImage().getScaledInstance(800, 465, Image.SCALE_DEFAULT));
        l_fb2=new JLabel(img);
        
        image_l_fb3=new ImageIcon("Project_Assets/l_fb3.png");
        img=new ImageIcon(image_l_fb3.getImage().getScaledInstance(800, 465, Image.SCALE_DEFAULT));
        l_fb3=new JLabel(img);
        
        image_l_fb4=new ImageIcon("Project_Assets/l_fb4.png");
        img=new ImageIcon(image_l_fb4.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT));
        l_fb4=new JLabel(img);
        
        image_l_fb5=new ImageIcon("Project_Assets/l_fb5.png");
        img=new ImageIcon(image_l_fb5.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT));
        l_fb5=new JLabel(img);
        
        image_l_fb6=new ImageIcon("Project_Assets/l_fb6.png");
        img=new ImageIcon(image_l_fb6.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT));
        l_fb6=new JLabel(img);
        
        image_l_fb7=new ImageIcon("Project_Assets/l_fb7.png");
        img=new ImageIcon(image_l_fb7.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT));
        l_fb7=new JLabel(img);
        
        image_l_fb8=new ImageIcon("Project_Assets/l_fb8.png");
        img=new ImageIcon(image_l_fb8.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT));
        l_fb8=new JLabel(img);
        
        image_r_fb1=new ImageIcon("Project_Assets/r_fb1.png");
        img=new ImageIcon(image_r_fb1.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT));
        r_fb1=new JLabel(img);
        
        image_r_fb2=new ImageIcon("Project_Assets/r_fb2.png");
        img=new ImageIcon(image_r_fb2.getImage().getScaledInstance(800, 465, Image.SCALE_DEFAULT));
        r_fb2=new JLabel(img);
        
        image_r_fb3=new ImageIcon("Project_Assets/r_fb3.png");
        img=new ImageIcon(image_r_fb3.getImage().getScaledInstance(800, 465, Image.SCALE_DEFAULT));
        r_fb3=new JLabel(img);
        
        image_r_fb4=new ImageIcon("Project_Assets/r_fb4.png");
        img=new ImageIcon(image_r_fb4.getImage().getScaledInstance(800, 465, Image.SCALE_DEFAULT));
        r_fb4=new JLabel(img);
        
        image_r_fb5=new ImageIcon("Project_Assets/r_fb5.png");
        img=new ImageIcon(image_r_fb5.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT));
        r_fb5=new JLabel(img);
        
        image_r_fb6=new ImageIcon("Project_Assets/r_fb6.png");
        img=new ImageIcon(image_r_fb6.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT));
        r_fb6=new JLabel(img);
        
        image_r_fb7=new ImageIcon("Project_Assets/r_fb7.png");
        img=new ImageIcon(image_r_fb7.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT));
        r_fb7=new JLabel(img);
        
        image_r_fb8=new ImageIcon("Project_Assets/r_fb8.png");
        img=new ImageIcon(image_r_fb8.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT));
        r_fb8=new JLabel(img);
        
        image_r_s1=new ImageIcon("Project_Assets/p2_selector.png");
        img=new ImageIcon(image_r_s1.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        r_s1=new JLabel(img);
        
        image_r_s2=new ImageIcon("Project_Assets/p2_selector.png");
        img=new ImageIcon(image_r_s2.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        r_s2=new JLabel(img);
        
        image_r_s3=new ImageIcon("Project_Assets/p2_selector.png");
        img=new ImageIcon(image_r_s3.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        r_s3=new JLabel(img);
        
        image_r_s4=new ImageIcon("Project_Assets/p2_selector.png");
        img=new ImageIcon(image_r_s4.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        r_s4=new JLabel(img);
        
        image_r_s5=new ImageIcon("Project_Assets/p2_selector.png");
        img=new ImageIcon(image_r_s5.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        r_s5=new JLabel(img);
        
        image_r_s6=new ImageIcon("Project_Assets/p2_selector.png");
        img=new ImageIcon(image_r_s6.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        r_s6=new JLabel(img);
        
        image_r_s7=new ImageIcon("Project_Assets/p2_selector.png");
        img=new ImageIcon(image_r_s7.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        r_s7=new JLabel(img);
        
        image_r_s8=new ImageIcon("Project_Assets/p2_selector.png");
        img=new ImageIcon(image_r_s8.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        r_s8=new JLabel(img);
        
        image_l_s1=new ImageIcon("Project_Assets/p1_selector.png");
        img=new ImageIcon(image_l_s1.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        l_s1=new JLabel(img);
        
        image_l_s2=new ImageIcon("Project_Assets/p1_selector.png");
        img=new ImageIcon(image_l_s2.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        l_s2=new JLabel(img);
        
        image_l_s3=new ImageIcon("Project_Assets/p1_selector.png");
        img=new ImageIcon(image_l_s3.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        l_s3=new JLabel(img);
        
        image_l_s4=new ImageIcon("Project_Assets/p1_selector.png");
        img=new ImageIcon(image_l_s4.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        l_s4=new JLabel(img);
        
        image_l_s5=new ImageIcon("Project_Assets/p1_selector.png");
        img=new ImageIcon(image_l_s5.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        l_s5=new JLabel(img);
        
        image_l_s6=new ImageIcon("Project_Assets/p1_selector.png");
        img=new ImageIcon(image_l_s6.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        l_s6=new JLabel(img);
        
        image_l_s7=new ImageIcon("Project_Assets/p1_selector.png");
        img=new ImageIcon(image_l_s7.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        l_s7=new JLabel(img);
        
        image_l_s8=new ImageIcon("Project_Assets/p1_selector.png");
        img=new ImageIcon(image_l_s8.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        l_s8=new JLabel(img);
        
        image_back=new ImageIcon("Project_Assets/btn_back.png");
        img=new ImageIcon(image_back.getImage().getScaledInstance(180, 45, Image.SCALE_DEFAULT));
        back=new JLabel(img);
        
        frame=new JFrame("Math Game");
        img=new ImageIcon(bg.getImage().getScaledInstance(1540, 850, Image.SCALE_DEFAULT));
        frame.setContentPane(new JLabel(img));
    }
    
    public void setFrame(){
        frame.setLayout(new GraphPaperLayout(new Dimension(35, 18)));
        frame.add(l_s1, new Rectangle(9, 6, 5, 5));
        frame.add(l_s2, new Rectangle(13, 6, 5, 5));
        frame.add(l_s3, new Rectangle(17, 6, 5, 5));
        frame.add(l_s4, new Rectangle(21, 6, 5, 5));
        frame.add(l_s5, new Rectangle(9, 10, 5, 5));
        frame.add(l_s6, new Rectangle(13, 10, 5, 5));
        frame.add(l_s7, new Rectangle(17, 10, 5, 5));
        frame.add(l_s8, new Rectangle(21, 10, 5, 5));
        frame.add(r_s1, new Rectangle(9, 6, 5, 5));
        frame.add(r_s2, new Rectangle(13, 6, 5, 5));
        frame.add(r_s3, new Rectangle(17, 6, 5, 5));
        frame.add(r_s4, new Rectangle(21, 6, 5, 5));
        frame.add(r_s5, new Rectangle(9, 10, 5, 5));
        frame.add(r_s6, new Rectangle(13, 10, 5, 5));
        frame.add(r_s7, new Rectangle(17, 10, 5, 5));
        frame.add(r_s8, new Rectangle(21, 10, 5, 5));
        frame.add(p1, new Rectangle(10, 7, 3, 3));
        frame.add(p2, new Rectangle(14, 7, 3, 3));
        frame.add(p3, new Rectangle(18, 7, 3, 3));
        frame.add(p4, new Rectangle(22, 7, 3, 3));
        frame.add(p5, new Rectangle(10, 11, 3, 3));
        frame.add(p6, new Rectangle(14, 11, 3, 3));
        frame.add(p7, new Rectangle(18, 11, 3, 3));
        frame.add(p8, new Rectangle(22, 11, 3, 3));
        frame.add(l_fb1, new Rectangle(1, 6, 7, 10));
        frame.add(l_fb2, new Rectangle(1, 6, 7, 10));
        frame.add(l_fb3, new Rectangle(1, 6, 7, 10));
        frame.add(l_fb4, new Rectangle(1, 6, 7, 10));
        frame.add(l_fb5, new Rectangle(1, 6, 7, 10));
        frame.add(l_fb6, new Rectangle(1, 6, 7, 10));
        frame.add(l_fb7, new Rectangle(1, 6, 7, 10));
        frame.add(l_fb8, new Rectangle(1, 6, 7, 10));
        frame.add(r_fb1, new Rectangle(27, 6, 7, 10));
        frame.add(r_fb2, new Rectangle(27, 6, 7, 10));
        frame.add(r_fb3, new Rectangle(27, 6, 7, 10));
        frame.add(r_fb4, new Rectangle(27, 6, 7, 10));
        frame.add(r_fb5, new Rectangle(27, 6, 7, 10));
        frame.add(r_fb6, new Rectangle(27, 6, 7, 10));
        frame.add(r_fb7, new Rectangle(27, 6, 7, 10));
        frame.add(r_fb8, new Rectangle(27, 6, 7, 10));
        frame.add(back, new Rectangle(0, 0, 7, 2));
        
        frame.setUndecorated(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        frame.setSize(frame.getMaximumSize());
        frame.setResizable(true);
        frame.setLocation(0,0);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        l_fb1.setVisible(false);
        l_fb2.setVisible(false);
        l_fb3.setVisible(false);
        l_fb4.setVisible(false);
        l_fb5.setVisible(false);
        l_fb6.setVisible(false);
        l_fb7.setVisible(false);
        l_fb8.setVisible(false);
        r_fb1.setVisible(false);
        r_fb2.setVisible(false);
        r_fb3.setVisible(false);
        r_fb4.setVisible(false);
        r_fb5.setVisible(false);
        r_fb6.setVisible(false);
        r_fb7.setVisible(false);
        r_fb8.setVisible(false);
        l_s1.setVisible(false);
        l_s2.setVisible(false);
        l_s3.setVisible(false);
        l_s4.setVisible(false);
        l_s5.setVisible(false);
        l_s6.setVisible(false);
        l_s7.setVisible(false);
        l_s8.setVisible(false);
        r_s1.setVisible(false);
        r_s2.setVisible(false);
        r_s3.setVisible(false);
        r_s4.setVisible(false);
        r_s5.setVisible(false);
        r_s6.setVisible(false);
        r_s7.setVisible(false);
        r_s8.setVisible(false);
        
        addListeners();
    }
    
    public void addListeners(){
        p1.addMouseListener(this);
        p2.addMouseListener(this);
        p3.addMouseListener(this);
        p4.addMouseListener(this);
        p5.addMouseListener(this);
        p6.addMouseListener(this);
        p7.addMouseListener(this);
        p8.addMouseListener(this);
        back.addMouseListener(this);
    }
    
    public static void main(String[] args){
        Multiplayer run = new Multiplayer();
        run.setFrame();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON1){
            if(e.getSource() == p1){
                l_fb1.setVisible(true);
                l_fb2.setVisible(false);
                l_fb3.setVisible(false);
                l_fb4.setVisible(false);
                l_fb5.setVisible(false);
                l_fb6.setVisible(false);
                l_fb7.setVisible(false);
                l_fb8.setVisible(false);
                l_s1.setVisible(true);
                l_s2.setVisible(false);
                l_s3.setVisible(false);
                l_s4.setVisible(false);
                l_s5.setVisible(false);
                l_s6.setVisible(false);
                l_s7.setVisible(false);
                l_s8.setVisible(false);
            }
            else if(e.getSource() == p2){
                l_fb1.setVisible(false);
                l_fb2.setVisible(true);
                l_fb3.setVisible(false);
                l_fb4.setVisible(false);
                l_fb5.setVisible(false);
                l_fb6.setVisible(false);
                l_fb7.setVisible(false);
                l_fb8.setVisible(false);
                l_s1.setVisible(false);
                l_s2.setVisible(true);
                l_s3.setVisible(false);
                l_s4.setVisible(false);
                l_s5.setVisible(false);
                l_s6.setVisible(false);
                l_s7.setVisible(false);
                l_s8.setVisible(false);
            }
            else if(e.getSource() == p3){
                l_fb1.setVisible(false);
                l_fb2.setVisible(false);
                l_fb3.setVisible(true);
                l_fb4.setVisible(false);
                l_fb5.setVisible(false);
                l_fb6.setVisible(false);
                l_fb7.setVisible(false);
                l_fb8.setVisible(false);
                l_s1.setVisible(false);
                l_s2.setVisible(false);
                l_s3.setVisible(true);
                l_s4.setVisible(false);
                l_s5.setVisible(false);
                l_s6.setVisible(false);
                l_s7.setVisible(false);
                l_s8.setVisible(false);
            }
            else if(e.getSource() == p4){
                l_fb1.setVisible(false);
                l_fb2.setVisible(false);
                l_fb3.setVisible(false);
                l_fb4.setVisible(true);
                l_fb5.setVisible(false);
                l_fb6.setVisible(false);
                l_fb7.setVisible(false);
                l_fb8.setVisible(false);
                l_s1.setVisible(false);
                l_s2.setVisible(false);
                l_s3.setVisible(false);
                l_s4.setVisible(true);
                l_s5.setVisible(false);
                l_s6.setVisible(false);
                l_s7.setVisible(false);
                l_s8.setVisible(false);
            }
            else if(e.getSource() == p5){
                l_fb1.setVisible(false);
                l_fb2.setVisible(false);
                l_fb3.setVisible(false);
                l_fb4.setVisible(false);
                l_fb5.setVisible(true);
                l_fb6.setVisible(false);
                l_fb7.setVisible(false);
                l_fb8.setVisible(false);
                l_s1.setVisible(false);
                l_s2.setVisible(false);
                l_s3.setVisible(false);
                l_s4.setVisible(false);
                l_s5.setVisible(true);
                l_s6.setVisible(false);
                l_s7.setVisible(false);
                l_s8.setVisible(false);
            }
            else if(e.getSource() == p6){
                l_fb1.setVisible(false);
                l_fb2.setVisible(false);
                l_fb3.setVisible(false);
                l_fb4.setVisible(false);
                l_fb5.setVisible(false);
                l_fb6.setVisible(true);
                l_fb7.setVisible(false);
                l_fb8.setVisible(false);
                l_s1.setVisible(false);
                l_s2.setVisible(false);
                l_s3.setVisible(false);
                l_s4.setVisible(false);
                l_s5.setVisible(false);
                l_s6.setVisible(true);
                l_s7.setVisible(false);
                l_s8.setVisible(false);
            }
            else if(e.getSource() == p7){
                l_fb1.setVisible(false);
                l_fb2.setVisible(false);
                l_fb3.setVisible(false);
                l_fb4.setVisible(false);
                l_fb5.setVisible(false);
                l_fb6.setVisible(false);
                l_fb7.setVisible(true);
                l_fb8.setVisible(false);
                l_s1.setVisible(false);
                l_s2.setVisible(false);
                l_s3.setVisible(false);
                l_s4.setVisible(false);
                l_s5.setVisible(false);
                l_s6.setVisible(false);
                l_s7.setVisible(true);
                l_s8.setVisible(false);
            }
            else if(e.getSource() == p8){
                l_fb1.setVisible(false);
                l_fb2.setVisible(false);
                l_fb3.setVisible(false);
                l_fb4.setVisible(false);
                l_fb5.setVisible(false);
                l_fb6.setVisible(false);
                l_fb7.setVisible(false);
                l_fb8.setVisible(true);
                l_s1.setVisible(false);
                l_s2.setVisible(false);
                l_s3.setVisible(false);
                l_s4.setVisible(false);
                l_s5.setVisible(false);
                l_s6.setVisible(false);
                l_s7.setVisible(false);
                l_s8.setVisible(true);
            }
            else if(e.getSource() == back){
                Main_Menu run = new Main_Menu();
                Point p=frame.getLocation();
                run.setFrame();
                run.frame.setLocation(p);
                frame.dispose();
            }
        }
        else if(e.getButton() == MouseEvent.BUTTON3){
            if(e.getSource() == p1){
                r_fb1.setVisible(true);
                r_fb2.setVisible(false);
                r_fb3.setVisible(false);
                r_fb4.setVisible(false);
                r_fb5.setVisible(false);
                r_fb6.setVisible(false);
                r_fb7.setVisible(false);
                r_fb8.setVisible(false);
                r_s1.setVisible(true);
                r_s2.setVisible(false);
                r_s3.setVisible(false);
                r_s4.setVisible(false);
                r_s5.setVisible(false);
                r_s6.setVisible(false);
                r_s7.setVisible(false);
                r_s8.setVisible(false);
            }
            else if(e.getSource() == p2){
                r_fb1.setVisible(false);
                r_fb2.setVisible(true);
                r_fb3.setVisible(false);
                r_fb4.setVisible(false);
                r_fb5.setVisible(false);
                r_fb6.setVisible(false);
                r_fb7.setVisible(false);
                r_fb8.setVisible(false);
                r_s1.setVisible(false);
                r_s2.setVisible(true);
                r_s3.setVisible(false);
                r_s4.setVisible(false);
                r_s5.setVisible(false);
                r_s6.setVisible(false);
                r_s7.setVisible(false);
                r_s8.setVisible(false);
            }
            else if(e.getSource() == p3){
                r_fb1.setVisible(false);
                r_fb2.setVisible(false);
                r_fb3.setVisible(true);
                r_fb4.setVisible(false);
                r_fb5.setVisible(false);
                r_fb6.setVisible(false);
                r_fb7.setVisible(false);
                r_fb8.setVisible(false);
                r_s1.setVisible(false);
                r_s2.setVisible(false);
                r_s3.setVisible(true);
                r_s4.setVisible(false);
                r_s5.setVisible(false);
                r_s6.setVisible(false);
                r_s7.setVisible(false);
                r_s8.setVisible(false);
            }
            else if(e.getSource() == p4){
                r_fb1.setVisible(false);
                r_fb2.setVisible(false);
                r_fb3.setVisible(false);
                r_fb4.setVisible(true);
                r_fb5.setVisible(false);
                r_fb6.setVisible(false);
                r_fb7.setVisible(false);
                r_fb8.setVisible(false);
                r_s1.setVisible(false);
                r_s2.setVisible(false);
                r_s3.setVisible(false);
                r_s4.setVisible(true);
                r_s5.setVisible(false);
                r_s6.setVisible(false);
                r_s7.setVisible(false);
                r_s8.setVisible(false);
            }
            else if(e.getSource() == p5){
                r_fb1.setVisible(false);
                r_fb2.setVisible(false);
                r_fb3.setVisible(false);
                r_fb4.setVisible(false);
                r_fb5.setVisible(true);
                r_fb6.setVisible(false);
                r_fb7.setVisible(false);
                r_fb8.setVisible(false);
                r_s1.setVisible(false);
                r_s2.setVisible(false);
                r_s3.setVisible(false);
                r_s4.setVisible(false);
                r_s5.setVisible(true);
                r_s6.setVisible(false);
                r_s7.setVisible(false);
                r_s8.setVisible(false);
            }
            else if(e.getSource() == p6){
                r_fb1.setVisible(false);
                r_fb2.setVisible(false);
                r_fb3.setVisible(false);
                r_fb4.setVisible(false);
                r_fb5.setVisible(false);
                r_fb6.setVisible(true);
                r_fb7.setVisible(false);
                r_fb8.setVisible(false);
                r_s1.setVisible(false);
                r_s2.setVisible(false);
                r_s3.setVisible(false);
                r_s4.setVisible(false);
                r_s5.setVisible(false);
                r_s6.setVisible(true);
                r_s7.setVisible(false);
                r_s8.setVisible(false);
            }
            else if(e.getSource() == p7){
                r_fb1.setVisible(false);
                r_fb2.setVisible(false);
                r_fb3.setVisible(false);
                r_fb4.setVisible(false);
                r_fb5.setVisible(false);
                r_fb6.setVisible(false);
                r_fb7.setVisible(true);
                r_fb8.setVisible(false);
                r_s1.setVisible(false);
                r_s2.setVisible(false);
                r_s3.setVisible(false);
                r_s4.setVisible(false);
                r_s5.setVisible(false);
                r_s6.setVisible(false);
                r_s7.setVisible(true);
                r_s8.setVisible(false);
            }
            else if(e.getSource() == p8){
                r_fb1.setVisible(false);
                r_fb2.setVisible(false);
                r_fb3.setVisible(false);
                r_fb4.setVisible(false);
                r_fb5.setVisible(false);
                r_fb6.setVisible(false);
                r_fb7.setVisible(false);
                r_fb8.setVisible(true);
                r_s1.setVisible(false);
                r_s2.setVisible(false);
                r_s3.setVisible(false);
                r_s4.setVisible(false);
                r_s5.setVisible(false);
                r_s6.setVisible(false);
                r_s7.setVisible(false);
                r_s8.setVisible(true);
            }
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}

