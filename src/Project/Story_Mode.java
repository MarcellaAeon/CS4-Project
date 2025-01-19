/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Story_Mode implements MouseListener {
    JFrame frame;
    JLabel p1;
    JLabel p2;
    JLabel p3;
    JLabel p4;
    JLabel p5;
    JLabel p6;
    JLabel p7;
    JLabel p8;
    JLabel fb1;
    JLabel fb2;
    JLabel fb3;
    JLabel fb4;
    JLabel fb5;
    JLabel fb6;
    JLabel fb7;
    JLabel fb8;
    JLabel b1;
    JLabel b2;
    JLabel b3;
    JLabel s1;
    JLabel s2;
    JLabel s3;
    JLabel s4;
    JLabel s5;
    JLabel s6;
    JLabel s7;
    JLabel s8;
    JLabel back;
    ImageIcon image_p1;
    ImageIcon image_p2;
    ImageIcon image_p3; 
    ImageIcon image_p4;
    ImageIcon image_p5;
    ImageIcon image_p6;
    ImageIcon image_p7;
    ImageIcon image_p8;
    ImageIcon image_fb1;
    ImageIcon image_fb2;
    ImageIcon image_fb3;
    ImageIcon image_fb4;
    ImageIcon image_fb5;
    ImageIcon image_fb6;
    ImageIcon image_fb7;
    ImageIcon image_fb8; 
    ImageIcon image_b1;
    ImageIcon image_b2;
    ImageIcon image_b3;
    ImageIcon image_s1;
    ImageIcon image_s2;
    ImageIcon image_s3;
    ImageIcon image_s4;
    ImageIcon image_s5;
    ImageIcon image_s6;
    ImageIcon image_s7;
    ImageIcon image_s8;
    ImageIcon image_back;
    ImageIcon bg;
    ImageIcon img;
    
    
    public Story_Mode(){
        bg=new ImageIcon("Project_Assets/bg_cyc_sm.png");
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
        
        image_s1=new ImageIcon("Project_Assets/selector.png");
        img=new ImageIcon(image_s1.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        s1=new JLabel(img);
        
        image_s2=new ImageIcon("Project_Assets/selector.png");
        img=new ImageIcon(image_s2.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        s2=new JLabel(img);
        
        image_s3=new ImageIcon("Project_Assets/selector.png");
        img=new ImageIcon(image_s3.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        s3=new JLabel(img);
        
        image_s4=new ImageIcon("Project_Assets/selector.png");
        img=new ImageIcon(image_s4.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        s4=new JLabel(img);
        
        image_s5=new ImageIcon("Project_Assets/selector.png");
        img=new ImageIcon(image_s5.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        s5=new JLabel(img);
        
        image_s6=new ImageIcon("Project_Assets/selector.png");
        img=new ImageIcon(image_s6.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        s6=new JLabel(img);
        
        image_s7=new ImageIcon("Project_Assets/selector.png");
        img=new ImageIcon(image_s7.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        s7=new JLabel(img);
        
        image_s8=new ImageIcon("Project_Assets/selector.png");
        img=new ImageIcon(image_s8.getImage().getScaledInstance(145, 155, Image.SCALE_DEFAULT));
        s8=new JLabel(img);
        
        image_fb1=new ImageIcon("Project_Assets/l_fb1.png");
        img=new ImageIcon(image_fb1.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT));
        fb1=new JLabel(img);
        
        image_fb2=new ImageIcon("Project_Assets/l_fb2.png");
        img=new ImageIcon(image_fb2.getImage().getScaledInstance(800, 465, Image.SCALE_DEFAULT));
        fb2=new JLabel(img);
        
        image_fb3=new ImageIcon("Project_Assets/l_fb3.png");
        img=new ImageIcon(image_fb3.getImage().getScaledInstance(800, 465, Image.SCALE_DEFAULT));
        fb3=new JLabel(img);
        
        image_fb4=new ImageIcon("Project_Assets/l_fb4.png");
        img=new ImageIcon(image_fb4.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT));
        fb4=new JLabel(img);
        
        image_fb5=new ImageIcon("Project_Assets/l_fb5.png");
        img=new ImageIcon(image_fb5.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT));
        fb5=new JLabel(img);
        
        image_fb6=new ImageIcon("Project_Assets/l_fb6.png");
        img=new ImageIcon(image_fb6.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT));
        fb6=new JLabel(img);
        
        image_fb7=new ImageIcon("Project_Assets/l_fb7.png");
        img=new ImageIcon(image_fb7.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT));
        fb7=new JLabel(img);
        
        image_fb8=new ImageIcon("Project_Assets/l_fb8.png");
        img=new ImageIcon(image_fb8.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT));
        fb8=new JLabel(img);
        
        image_b1=new ImageIcon("Project_Assets/b1.png");
        img=new ImageIcon(image_b1.getImage().getScaledInstance(147, 147, Image.SCALE_DEFAULT));
        b1=new JLabel(img);
        
        image_b2=new ImageIcon("Project_Assets/b2.png");
        img=new ImageIcon(image_b2.getImage().getScaledInstance(147, 147, Image.SCALE_DEFAULT));
        b2=new JLabel(img);
        
        image_b3=new ImageIcon("Project_Assets/b3.png");
        img=new ImageIcon(image_b3.getImage().getScaledInstance(147, 147, Image.SCALE_DEFAULT));
        b3=new JLabel(img);
        
        image_back=new ImageIcon("Project_Assets/btn_back.png");
        img=new ImageIcon(image_back.getImage().getScaledInstance(180, 45, Image.SCALE_DEFAULT));
        back=new JLabel(img);
        
        frame=new JFrame("Math Game");
        img=new ImageIcon(bg.getImage().getScaledInstance(1540, 850, Image.SCALE_DEFAULT));
        frame.setContentPane(new JLabel(img));
    }
    
    public void setFrame(){
        frame.setLayout(new GraphPaperLayout(new Dimension(35, 18)));
        frame.add(s1, new Rectangle(9, 6, 5, 5));
        frame.add(s2, new Rectangle(13, 6, 5, 5));
        frame.add(s3, new Rectangle(17, 6, 5, 5));
        frame.add(s4, new Rectangle(21, 6, 5, 5));
        frame.add(s5, new Rectangle(9, 10, 5, 5));
        frame.add(s6, new Rectangle(13, 10, 5, 5));
        frame.add(s7, new Rectangle(17, 10, 5, 5));
        frame.add(s8, new Rectangle(21, 10, 5, 5));
        frame.add(p1, new Rectangle(10, 7, 3, 3));
        frame.add(p2, new Rectangle(14, 7, 3, 3));
        frame.add(p3, new Rectangle(18, 7, 3, 3));
        frame.add(p4, new Rectangle(22, 7, 3, 3));
        frame.add(p5, new Rectangle(10, 11, 3, 3));
        frame.add(p6, new Rectangle(14, 11, 3, 3));
        frame.add(p7, new Rectangle(18, 11, 3, 3));
        frame.add(p8, new Rectangle(22, 11, 3, 3));
        frame.add(fb1, new Rectangle(1, 6, 7, 10));
        frame.add(fb2, new Rectangle(1, 6, 7, 10));
        frame.add(fb3, new Rectangle(1, 6, 7, 10));
        frame.add(fb4, new Rectangle(1, 6, 7, 10));
        frame.add(fb5, new Rectangle(1, 6, 7, 10));
        frame.add(fb6, new Rectangle(1, 6, 7, 10));
        frame.add(fb7, new Rectangle(1, 6, 7, 10));
        frame.add(fb8, new Rectangle(1, 6, 7, 10));
        frame.add(b1, new Rectangle(23, 6, 7, 10));
        frame.add(b2, new Rectangle(23, 6, 7, 10));
        frame.add(b3, new Rectangle(23, 6, 7, 10));
        frame.add(back, new Rectangle(0, 0, 7, 2));
        
        frame.setUndecorated(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        frame.setSize(frame.getMaximumSize());
        frame.setResizable(true);
        frame.setLocation(0,0);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        fb1.setVisible(false);
        fb2.setVisible(false);
        fb3.setVisible(false);
        fb4.setVisible(false);
        fb5.setVisible(false);
        fb6.setVisible(false);
        fb7.setVisible(false);
        fb8.setVisible(false);
        b1.setVisible(true);
        b2.setVisible(false);
        b3.setVisible(false);
        s1.setVisible(false);
        s2.setVisible(false);
        s3.setVisible(false);
        s4.setVisible(false);
        s5.setVisible(false);
        s6.setVisible(false);
        s7.setVisible(false);
        s8.setVisible(false);
        
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
        Story_Mode run = new Story_Mode();
        run.setFrame();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == p1){
            fb1.setVisible(true);
            fb2.setVisible(false);
            fb3.setVisible(false);
            fb4.setVisible(false);
            fb5.setVisible(false);
            fb6.setVisible(false);
            fb7.setVisible(false);
            fb8.setVisible(false);
            s1.setVisible(true);
            s2.setVisible(false);
            s3.setVisible(false);
            s4.setVisible(false);
            s5.setVisible(false);
            s6.setVisible(false);
            s7.setVisible(false);
            s8.setVisible(false);
            
        }
        else if(e.getSource() == p2){
            fb1.setVisible(false);
            fb2.setVisible(true);
            fb3.setVisible(false);
            fb4.setVisible(false);
            fb5.setVisible(false);
            fb6.setVisible(false);
            fb7.setVisible(false);
            fb8.setVisible(false);
            s1.setVisible(false);
            s2.setVisible(true);
            s3.setVisible(false);
            s4.setVisible(false);
            s5.setVisible(false);
            s6.setVisible(false);
            s7.setVisible(false);
            s8.setVisible(false);
        }
        else if(e.getSource() == p3){
            fb1.setVisible(false);
            fb2.setVisible(false);
            fb3.setVisible(true);
            fb4.setVisible(false);
            fb5.setVisible(false);
            fb6.setVisible(false);
            fb7.setVisible(false);
            fb8.setVisible(false);
            s1.setVisible(false);
            s2.setVisible(false);
            s3.setVisible(true);
            s4.setVisible(false);
            s5.setVisible(false);
            s6.setVisible(false);
            s7.setVisible(false);
            s8.setVisible(false);
        }
        else if(e.getSource() == p4){
            fb1.setVisible(false);
            fb2.setVisible(false);
            fb3.setVisible(false);
            fb4.setVisible(true);
            fb5.setVisible(false);
            fb6.setVisible(false);
            fb7.setVisible(false);
            fb8.setVisible(false);
            s1.setVisible(false);
            s2.setVisible(false);
            s3.setVisible(false);
            s4.setVisible(true);
            s5.setVisible(false);
            s6.setVisible(false);
            s7.setVisible(false);
            s8.setVisible(false);
        }
        else if(e.getSource() == p5){
            fb1.setVisible(false);
            fb2.setVisible(false);
            fb3.setVisible(false);
            fb4.setVisible(false);
            fb5.setVisible(true);
            fb6.setVisible(false);
            fb7.setVisible(false);
            fb8.setVisible(false);
            s1.setVisible(false);
            s2.setVisible(false);
            s3.setVisible(false);
            s4.setVisible(false);
            s5.setVisible(true);
            s6.setVisible(false);
            s7.setVisible(false);
            s8.setVisible(false);
        }
        else if(e.getSource() == p6){
            fb1.setVisible(false);
            fb2.setVisible(false);
            fb3.setVisible(false);
            fb4.setVisible(false);
            fb5.setVisible(false);
            fb6.setVisible(true);
            fb7.setVisible(false);
            fb8.setVisible(false);
            s1.setVisible(false);
            s2.setVisible(false);
            s3.setVisible(false);
            s4.setVisible(false);
            s5.setVisible(false);
            s6.setVisible(true);
            s7.setVisible(false);
            s8.setVisible(false);
        }
        else if(e.getSource() == p7){
            fb1.setVisible(false);
            fb2.setVisible(false);
            fb3.setVisible(false);
            fb4.setVisible(false);
            fb5.setVisible(false);
            fb6.setVisible(false);
            fb7.setVisible(true);
            fb8.setVisible(false);
            s1.setVisible(false);
            s2.setVisible(false);
            s3.setVisible(false);
            s4.setVisible(false);
            s5.setVisible(false);
            s6.setVisible(false);
            s7.setVisible(true);
            s8.setVisible(false);
        }
        else if(e.getSource() == p8){
            fb1.setVisible(false);
            fb2.setVisible(false);
            fb3.setVisible(false);
            fb4.setVisible(false);
            fb5.setVisible(false);
            fb6.setVisible(false);
            fb7.setVisible(false);
            fb8.setVisible(true);
            s1.setVisible(false);
            s2.setVisible(false);
            s3.setVisible(false);
            s4.setVisible(false);
            s5.setVisible(false);
            s6.setVisible(false);
            s7.setVisible(false);
            s8.setVisible(true);
        }
        else if(e.getSource() == back){
            Main_Menu run = new Main_Menu();
            Point p=frame.getLocation();
            run.setFrame();
            run.frame.setLocation(p);
            frame.dispose();
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

