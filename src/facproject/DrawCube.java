/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facproject;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author Bios
 */
public class DrawCube extends JFrame {
    
    private double side;
    
    public DrawCube(double side)
    {
        this.side=side;
        this.setTitle("samuel");
        this.setSize(600,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
     public void paint(Graphics g)
    {
        
        g.setColor(Color.BLACK);
        drawCube(g, 300, 250, (int)this.side);
     
    }
        public void drawCube(Graphics g, int x, int y, int size) {
       
        int shift = size / 3; 

    
        g.drawRect(x, y, size, size);
        

        g.drawRect(x + shift, y - shift, size, size);

        
        g.drawLine(x, y, x + shift, y - shift);//ul
        
        
        g.drawLine(x + size, y, x + size + shift, y - shift);//ur
        
        
        g.drawLine(x, y + size, x + shift, y + size - shift);//dl
        
        
        g.drawLine(x + size, y + size, x + size + shift, y + size - shift);//dr
    }
    
}
