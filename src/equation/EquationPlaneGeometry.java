/**
 * This application is focused to help students to reduce their time in answering assignments and also practice my java programming skills
 * @author SamuelAaronFelipe
 * v
 */
package equation;

import java.util.Scanner;

// This is the Plane Geometry class that contains the various methods that has the respective equations
public class EquationPlaneGeometry {
    
    Scanner userInput = new Scanner(System.in);
    
    // This method receives input of the length of a side of an equilateral triangle to give a result of its perimeter
    public double eTriangleP() {
        System.out.println("1. Perimeter of an Equilateral Triangle");
        System.out.print("Input length of side: ");
        double side = userInput.nextDouble();
        double perimeter;    
        
        perimeter = 3 * side;
        System.out.println("The perimeter of your triangle is " + perimeter);
        
        return perimeter;
    }
    
    // This method receives input of one side that has equal length and another side of an isoceles triangle to give a result of its perimeter
    public double iTriangleP() {
        System.out.println("2. Perimeter of an Isoceles Triangle");
        System.out.print("Input length of one of the two sides that are equal in length: ");
        double iSide = userInput.nextDouble();
        System.out.print("Input length of the remaining side: ");
        double side = userInput.nextDouble();
        double perimeter;    
        
        perimeter = (2 * iSide) * side;
        System.out.println("The perimeter of your triangle is " + perimeter);
        
        return perimeter;
    }
    
    // This method receives input of the length of each side of a scalene triangle to give a result of its perimeter
    public double sTriangleP() {
        System.out.println("3. Perimeter of an Scalene Triangle");
        System.out.print("Input length of the first side: ");
        double aSide = userInput.nextDouble();
        System.out.print("Input length of the second side: ");
        double bSide = userInput.nextDouble();
        System.out.print("Input length of the remaining side: ");
        double cSide = userInput.nextDouble();
        double perimeter;    
        
        perimeter =  aSide + bSide + cSide;
        System.out.println("The perimeter of your triangle is " + perimeter);
        
        return perimeter;
    }
    
    // This method receives input of the length of a side of a square to give a result of its perimeter
    public double squareP() {
        System.out.println("4. Perimeter of an Square");
        System.out.print("Input length of side: ");
        double side = userInput.nextDouble();
        double perimeter;    
        
        perimeter = 4 * side;
        System.out.println("The perimeter of your square is " + perimeter);
        System.out.println("The perimeter of a rhombus will have the same value if it has the same length of sides.");
        
        return perimeter;
    }
    
    // This method receives input of the lenghth of the longer side and the shorter side of a rectangle to give a result of its perimeter
    public double rectangleP() {
        System.out.println("5. Perimeter of a Rectangle");
        System.out.print("Input length of shorter side: ");
        double aSide = userInput.nextDouble();
        System.out.print("Input length of longer side: ");
        double bSide = userInput.nextDouble();
        double perimeter;    
        
        perimeter = (2 * aSide) + (2 * bSide);
        System.out.println("The perimeter of your rhombus is " + perimeter);
        System.out.println("The perimeter of a kite and a parallelogram will have the same value if it has the same length of sides.");
        
        return perimeter;
    }
    
    // This method receives input of one side that has equal length, long side, and a short side of an isoceles trapezoid to give a result of its perimeter
    public double iTrapezoidP() {
        System.out.println("6. Perimeter of a Isoceles Trapezoid");
        System.out.print("Input length of one of the two sides that are equal in length: ");
        double iSide = userInput.nextDouble();
        System.out.print("Input length of shorter side: ");
        double aSide = userInput.nextDouble();
        System.out.print("Input length of the remaining side: ");
        double bSide = userInput.nextDouble();
        double perimeter;    
        
        perimeter = (2 * iSide) + aSide + bSide;
        System.out.println("The perimeter of your rhombus is " + perimeter);
        
        return perimeter;
    }
    
    // This method receives input of the length each side of a trapezoid to give a result of its perimeter
    public double trapezoidP() {
        System.out.println("7. Perimeter of a Trapezoid");
        System.out.print("Input length of the first side: ");
        double aSide = userInput.nextDouble();
        System.out.print("Input length of the second side: ");
        double bSide = userInput.nextDouble();
        System.out.print("Input length of the third side: ");
        double cSide = userInput.nextDouble();
        System.out.print("Input length of the remaining side: ");
        double dSide = userInput.nextDouble();
        double perimeter;    
        
        perimeter = aSide + bSide + cSide + dSide;
        System.out.println("The perimeter of your trapezoid is " + perimeter);
        
        return perimeter;
    }
    
    // This method receives input of the number of sides and the length of the side of a polygon to give a result of its perimeter
    public double polygonP() {
        System.out.println("8. Perimeter of a Polygon");
        System.out.println("Input the number of sides of the polygon: ");
        double nSide = userInput.nextDouble();
        System.out.println("Input length of a side: ");
        double side = userInput.nextDouble();
        double perimeter;
        
        perimeter = nSide * side;
        System.out.println("The perimeter of your polygon is " + perimeter);
        
        return perimeter;
    }
    
    /* public double circleC() {
        System.out.println("9. ");
        
        return;
    } */
}