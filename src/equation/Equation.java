/**
 * This application is focused to help students to reduce their time in answering assignments and also practice my java programming skills
 * @author SamuelAaronFelipe
 * v
 */
package equation;

import java.util.InputMismatchException;
import java.util.Scanner;

// This is the main class that holds the main method only
public class Equation {
    
    // This is the main method that hold the logic of the application
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        EquationPhysics physics = new EquationPhysics();
        EquationPlaneGeometry geometry = new EquationPlaneGeometry();
        EquationView display = new EquationView();
        
        int number;
        int numberPhy;
        int numberPGeo;
        
        while(true) {
            display.menu();
            
            try {
                number = input.nextInt();
                
                if(number == 1) {
                
                    while(true) {
                        display.menuPhysics();

                        try {
                            numberPhy = input.nextInt();

                            if (numberPhy == 1) physics.speedM();                            
                            if (numberPhy == 2) physics.speedI();                           
                            if (numberPhy == 3) physics.accelerationM();                               
                            if (numberPhy == 4) physics.accelerationI();                
                            if (numberPhy == 5) physics.forceM();                               
                            if (numberPhy == 6) physics.forceI();               
                            if (numberPhy == 7) physics.weightM();                              
                            if (numberPhy == 8) physics.weightI();               
                            if (numberPhy == 9) physics.workM();               
                            if (numberPhy == 10) physics.workI();                            
                            if (numberPhy == 11) physics.powerM();               
                            if (numberPhy == 12) physics.powerI();                              
                            if (numberPhy == 13) physics.pressureM();                               
                            if (numberPhy == 14) physics.pressureI();                               
                            if (numberPhy == 0) break;                
                        }

                        catch(InputMismatchException e) {
                            System.out.println("\nError!");
                            input.next();
                        }
                    }    
                }
                
                if(number == 2) {
                    while(true) {
                        display.menuPlaneGeometry();
                        
                        try {
                            numberPGeo = input.nextInt();
                            
                            if(numberPGeo == 1) geometry.eTriangleP();
                            if(numberPGeo == 2) geometry.iTriangleP();
                            if(numberPGeo == 3) geometry.sTriangleP();
                            if(numberPGeo == 4) geometry.squareP();
                            if(numberPGeo == 5) geometry.rectangleP();
                            if(numberPGeo == 6) geometry.iTrapezoidP();
                            if(numberPGeo == 7) geometry.trapezoidP();
                            if(numberPGeo == 8) geometry.polygonP();
                            if(numberPGeo == 0) break; 
                        }
                        catch(InputMismatchException e) {
                            System.out.println("\nError!");
                            input.next();
                        }
                    }
                }
                
                if(number == 0) {
                    break;
                }
            }
            
            catch(InputMismatchException e) {
                System.out.println("\nError!");
                input.next();
            }
        }
    }
}