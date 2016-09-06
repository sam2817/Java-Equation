/**
 * This application is focused to help students to reduce their time in answering assignments and also practice my java programming skills
 * @author SamuelAaronFelipe
 * v
 */
package equation;

// This class holds the menus to be displayed on the command line
public class EquationView {
    
    // This is the main menu.
    public void menu() {
        System.out.println("\nEquations");
            System.out.println("1. Physics");
            System.out.println("2. Plane Geometry");
            System.out.println("0. <Quit>");
            System.out.println("***********************************************************************");
            System.out.print("Please enter the following number to select the respective subject: ");
    }
    
    // This is the menu for the Physics equations
    public void menuPhysics() {
        System.out.println("\nEquations");
            System.out.println("1. Speed = Distance / Time (Metric)");
            System.out.println("2. Speed = Distance / Time (Imperial)");
            System.out.println("3. Acceleration = Speed / Time (Metric)");
            System.out.println("4. Acceleration = Speed / Time (Imperial)");
            System.out.println("5. Force = Mass * Acceleration (Metric)");
            System.out.println("6. Force = Mass * Acceleration (Imperial)");
            System.out.println("7. Weight = Mass * Gravitational Acceleration (Metric)");
            System.out.println("8. Weight = Mass * Gravitational Acceleration (Imperial)");
            System.out.println("9. Work = Force * Distance (Metric)");
            System.out.println("10. Work = Force * Distance (Imperial)");
            System.out.println("11. Power = Work / Time (Metric)");
            System.out.println("12. Power = Work / Time (Imperial)");
            System.out.println("13. Pressure = Force / Area (Metric)");
            System.out.println("14. Pressure = Force / Area (Imperial)");
            System.out.println("0. <Quit>");
            System.out.println("***********************************************************************");
            System.out.print("Please enter the following number to select the respective equation: ");
    }
    
    // This is the menu for the Plane Geometry equations
    public void menuPlaneGeometry() {
        System.out.println("\nEquations");
            System.out.println("1. Perimeter of an Equilateral Triangle");
            System.out.println("2. Perimeter of an Isoceles Triangle");
            System.out.println("3. Perimeter of a Scalene Triangle");
            System.out.println("4. Perimeter of a Square");
            System.out.println("5. Perimeter of a Rectangle");
            System.out.println("6. Perimeter of a Isoceles Trapezoid");
            System.out.println("7. Perimeter of a Trapezoid");
            System.out.println("6. Perimeter of a Polygon");
            System.out.println("7. Circumference of a Circle");
            System.out.println("8. Area of a Triangle");
            System.out.println("9. Area of a Square");
            System.out.println("10. Area of a Rectangle");
            System.out.println("11. Area of a Polygon");
            System.out.println("12. Area of a Circle");
            System.out.println("0. <Quit>");
            System.out.println("***********************************************************************");
            System.out.print("Please enter the following number to select the respective equation: ");
    }
    
    // This is the menu for the Solid Geometry equations
    public void menuSolidGeometry() {
        
    }
}