/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facproject;

/**
 *
 * @author Bios
 */
public abstract class ThreeDShape extends Shape {
    
   public abstract double getVolume();

    public ThreeDShape() {
    }

    public ThreeDShape(String color) {
        super(color);
    }
   
    
    
}
