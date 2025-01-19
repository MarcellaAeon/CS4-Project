/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main_Menu implements MouseListener {
    JFrame frame;
    JLabel sm;
    JLabel mp;
    JLabel credits;
    ImageIcon image_sm;
    ImageIcon image_mp;
    ImageIcon image_credits;
    ImageIcon bg;
    ImageIcon img;
    
    
    public Main_Menu(){
        bg=new ImageIcon("Project_Assets/bg_main_menu.png");
        
        image_sm=new ImageIcon("Project_Assets/btn_story_mode.png");
        img=new ImageIcon(image_sm.getImage().getScaledInstance(426, 240, Image.SCALE_DEFAULT));
        sm=new JLabel(img);
        
        image_mp=new ImageIcon("Project_Assets/btn_multiplayer.png");
        img=new ImageIcon(image_mp.getImage().getScaledInstance(426, 240, Image.SCALE_DEFAULT));
        mp=new JLabel(img);
        
        image_credits=new ImageIcon("Project_Assets/btn_credits.png");
        img=new ImageIcon(image_credits.getImage().getScaledInstance(426, 240, Image.SCALE_DEFAULT));
        credits=new JLabel(img);
        
        frame=new JFrame("Math Game");
        img=new ImageIcon(bg.getImage().getScaledInstance(1540, 850, Image.SCALE_DEFAULT));
        frame.setContentPane(new JLabel(img));
    }
    
    public void setFrame(){
        frame.setLayout(new GraphPaperLayout(new Dimension(35, 18)));
        frame.add(sm, new Rectangle(1,5,11,3));
        frame.add(mp, new Rectangle(1,9,11,3));
        frame.add(credits, new Rectangle(1,13,11,3));
        
        frame.setUndecorated(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        frame.setSize(frame.getMaximumSize());
        frame.setResizable(true);
        frame.setLocation(0,0);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        addListeners();
    }
    
    public void addListeners(){
        sm.addMouseListener(this);
        mp.addMouseListener(this);
        credits.addMouseListener(this);
    }
    
    public static void main(String[] args){
        Main_Menu run = new Main_Menu();
        run.setFrame();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == sm){
            Story_Mode run = new Story_Mode();
            Point p=frame.getLocation();
            run.setFrame();
            run.frame.setLocation(p);
            frame.dispose();
        }
        else if(e.getSource() == mp){
            Multiplayer run = new Multiplayer();
            Point p=frame.getLocation();
            run.setFrame();
            run.frame.setLocation(p);
            frame.dispose();
        }
        else if(e.getSource() == credits){
            Credits run = new Credits();
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