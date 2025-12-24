/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facproject;

import java.awt.Color;
import java.awt.Graphics;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;

/**
 *
 * @author Bios
 */
public class DrawCircle extends JFrame{
    
    private double radius;
    public DrawCircle(double radius)
    {
        this.radius=radius;
        this.setTitle("samuel");
        this.setSize(600,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
    }
    @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.black);
       
        double diameter=radius*2;
        

        g.drawOval(300,300 ,(int)diameter,(int) diameter);
        
        
       
    }
   
    
}
