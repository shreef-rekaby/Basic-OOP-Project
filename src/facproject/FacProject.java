/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class FacProject {

    public static void main(String[] args) {

        File file = new File("input.txt");
        Scanner in = null;

        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
           System.out.println("");
           return; 
        }

    
        if (!in.hasNextInt()) {
            System.out.println("error ");
            
            return;
        }

        int sz = in.nextInt();

        
        if (sz < 0) {
            System.out.println("error ");
            
            return; 
        }
        
         if (sz < 2) {
            System.out.println("error ");
            
            return; 
        }
        

        Drawable[] arr = new Drawable[sz];

        for (int i = 0; i < arr.length; i++) {


            String shape = in.next();

            if (shape.equalsIgnoreCase("circle")) {
                if (in.hasNextDouble()) {
                    double rad = in.nextDouble();
                    if (rad >= 0) {
                        arr[i] = new Circle(rad);
                        new DrawCircle(rad);
                    } else {
                        System.out.println(" Radius cannot be negative for circle");
                    }
                } else {
                    System.out.println("you enter invalid  radius ");
                    in.next(); 
                }
            } 
            else if (shape.equalsIgnoreCase("cube")) {
                if (in.hasNextDouble()) {
                    double side = in.nextDouble();
                    if (side >= 0) {
                        arr[i] = new Cube(side);
                        new DrawCube(side);
                    } else {
                        System.out.println("Side cannot be negative for cube ");
                    }
                } else {
                    System.out.println("you enter invalid  side ");
                     in.next(); 
                }
            } 
            else {
               in.nextDouble();
               System.out.println(" Unknown shape");
            }
        }

        
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i] instanceof Circle) {
                    sum += ((Circle) arr[i]).getArea();
                } else if (arr[i] instanceof Cube) {
                    sum += ((Cube) arr[i]).getArea();
                }
            }
        }

        
        try {
           PrintStream outfile = new PrintStream("sumAreas.txt");
            outfile.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("error");
           
        } 
      
    }
}

