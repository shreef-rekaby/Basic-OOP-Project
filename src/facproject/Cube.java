/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facproject;

/**
 *
 * @author Bios
 */
public class Cube extends ThreeDShape {
    
    private double side;

  
    public double getSide() {
        return side;
    }

    
    public void setSide(double side) {
        this.side = side;
    }

    public Cube(double side) {
        super("white");
        this.side = side;
        
        
    }

    public Cube(double side, String color) {
        super(color);
        this.side = side;
    }
    


    @Override
    public double getVolume() {
     return this.side*this.side*this.side;
    }

    @Override
    public String howToDraw() {
        return "cube";
    }

    @Override
   public double getPerimeter() {
      return 12*this.side;
    }

    @Override
   public double getArea() {
       return 6*this.side*this.side;
    }

    @Override
    public String toString() {
        return "Cube{" + "side=" + side + '}';
    }
    
    
    
}
