/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facproject;

/**
 *
 * @author Bios
 */
public class Circle extends Shape {

    private double radius;

  
    
    public double getRadius() {
        return radius;
    }

 
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius) {
        
        super("white");
        this.radius = radius;
        
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }
    
    
      @Override
   public String howToDraw()
   {
       return "circle";
   }
    
    @Override
   public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
   public double getArea() {
        return Math.PI*this.radius*this.radius;
    }
    

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
    
}
