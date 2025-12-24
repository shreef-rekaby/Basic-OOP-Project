/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facproject;

import java.util.Date;

/**
 *
 * @author Bios
 */
public abstract class Shape implements Drawable {
    private Date dateCreated;
    private String color;

    public Shape() {
        this.dateCreated=new Date();
        this.color="black";
    }

    public Shape(String color) {
        this.dateCreated=new Date();
        this.color = color;
    }
    
    public Date getDateCreated()
    {
        return this.dateCreated;
    }
    
    
    public abstract double getPerimeter();
    public abstract double getArea();
    
        
    
    
    
}
