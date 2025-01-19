/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Credits implements MouseListener {
    JFrame frame;
    JLabel names;
    
    public Credits(){
        frame = new JFrame();
        names = new JLabel("Names");
    }
    
    public void setFrame(){
        frame.setLayout(new GraphPaperLayout(new Dimension(35, 18)));
        frame.add(names, new Rectangle(1,5,11,3));
        
        frame.setUndecorated(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        frame.setSize(frame.getMaximumSize());
        frame.setResizable(true);
        frame.setLocation(0,0);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public static void main(String[] args){
        Credits run = new Credits();
        run.setFrame();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
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
