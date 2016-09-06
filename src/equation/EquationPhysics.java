/**
 * This application is focused to help students to reduce their time in answering assignments and also practice my java programming skills
 * @author SamuelAaronFelipe
 * v
 */
package equation;

import java.util.Scanner;

// This is the Physics class that contains the various methods that has the respective equations
public class EquationPhysics {
    
    Scanner userInput = new Scanner(System.in);

    // This method receives input of distance and time to give a result of the speed in metric units
    public double speedM() {
        System.out.println("1. Speed = Distance / Time (Metric)");
        System.out.print("Input distance in meters(m): ");
        double distanceMS = userInput.nextDouble();
        System.out.print("Input time in seconds(s): ");
        double time = userInput.nextDouble();
        double speedMS;
        
        speedMS = distanceMS / time;
        System.out.println("The speed is " + speedMS + "m/s");
        
        return speedMS;
    }
    
    // This method receives input of distance and time to give a result of the speed in english units
    public double speedI() {
        System.out.println("2. Speed = Distance / Time (Imperial)");
        System.out.print("Input distance in feet(ft): ");
        double distanceIS = userInput.nextDouble();
        System.out.print("Input time in seconds(s): ");
        double time = userInput.nextDouble();
        double speedIS;
        
        speedIS = distanceIS / time;
        System.out.println("The speed is " + speedIS + "ft/s");
        
        return speedIS;
    }
    
    // This method receives input of speed and time to give a result of the acceleration rate in metric units
    public double accelerationM() {
        System.out.println("3. Acceleration = Speed / Time (Metric)");
        System.out.print("Input speed in meters per second(m/s): ");
        double speedMS = userInput.nextDouble();
        System.out.print("Input time in seconds(s): ");
        double time = userInput.nextDouble();
        double accelerationMS;
        
        accelerationMS = speedMS / time;
        System.out.println("The acceleration rate is " + accelerationMS + "m/s\u00b2");
        
        return accelerationMS;
    }
    
    // This method receives input of speed and time to give a result of the acceleration rate in english units
    public double accelerationI() {
        System.out.println("4. Acceleration = Speed / Time (Imperial)");
        System.out.print("Input speed in feet per second(ft/s): ");
        double speedIS = userInput.nextDouble();
        System.out.print("Input time in seconds(s): ");
        double time = userInput.nextDouble();
        double accelerationIS;
        
        accelerationIS = speedIS / time;
        System.out.println("The acceleration rate is " + accelerationIS + "ft/s\u00b2");
        
        return accelerationIS;
    }
    
    // This method receives input of acceleration rate and mass to give a result of the force exerted in metric units
    public double forceM() {
        System.out.println("5. Force = Mass * Acceleration (Metric)");
        System.out.print("Input acceleration in meters per second-squared(m/s\u00b2): ");
        double accelerationMS = userInput.nextDouble();
        System.out.print("Input mass in kilograms(kg): ");
        double massMS = userInput.nextDouble();
        double forceMS;
        
        forceMS = massMS * accelerationMS;
        System.out.println("The force exerted is " + forceMS + "N");
        
        return forceMS;
    }
    
    // This method receives input of acceleration rate and mass to give a result of the force exerted in english units
    public double forceI() {
        System.out.println("6. Force = Mass * Acceleration (Imperial)");
        System.out.print("Input acceleration in feet per second-squared(ft/s\u00b2): ");
        double accelerationIS = userInput.nextDouble();
        System.out.print("Input mass in pound-mass(lb-m): ");
        double massIS = userInput.nextDouble();
        double forceIS;
        
        forceIS = massIS * accelerationIS;
        System.out.println("The force exerted is " + forceIS + "lb-f");
        
        return forceIS;
    }
    
    // This method receives input of mass to give a result of the weight in metric units
    public double weightM() {
        System.out.println("7. Weight = Mass * Gravitational Acceleration (Metric)");
        double gravitationalAccelerationMS = 9.80665;
        System.out.print("Input mass in kilograms(kg): ");
        double massMS = userInput.nextDouble();
        double weightMS;
        
        weightMS = massMS * gravitationalAccelerationMS;
        System.out.println("The weight is " + weightMS + "N");
        
        return weightMS;
    }
    
    // This method receives input of mass to give a result of the weight in english units
    public double weightI() {
        System.out.println("8. Weight = Mass * Gravitational Acceleration (Imperial)");
        double gravitationalAccelerationIS = 32.174;
        System.out.print("Input mass in pound-mass(lb-m): ");
        double massIS = userInput.nextDouble();
        double weightIS;
        
        weightIS = massIS * gravitationalAccelerationIS;
        System.out.println("The weight is " + weightIS + "lb-f");
        
        return weightIS;
    }
    
    // This method receives input of force exerted and distance to give a result of the work done in metric units
    public double workM() {
        System.out.println("9. Work = Force * Distance (Metric)");
        System.out.print("Input force in Newtons(N): ");
        double forceMS = userInput.nextDouble();
        System.out.print("Input distance in meters(m): ");
        double distance = userInput.nextDouble();
        double workMS;
        
        workMS = forceMS * distance;
        System.out.println("The work done is: " + workMS + "J");
        
        return workMS;
    }
    
    // This method receives input of force exerted and distance to give a result of the work done in english units
    public double workI() {
        System.out.println("10. Work = Force * Distance (Imperial)");
        System.out.print("Input force in pound-force(lb-f): ");
        double forceIS = userInput.nextDouble();
        System.out.print("Input distance in feet(ft): ");
        double distance = userInput.nextDouble();
        double workIS;
        
        workIS = forceIS * distance;
        System.out.println("The work done is: " + workIS + "ft\u00b7lb-f");
        
        return workIS;
    }
    
    // This method receives input of work done and time to give a result of the work done in metric units
    public double powerM() {
        System.out.println("11. Power = Work / Time (Metric)");
        System.out.print("Input work in Joule(J): ");
        double workMS = userInput.nextDouble();
        System.out.print("Input time in seconds(s): ");
        double time = userInput.nextDouble();
        double powerMS;
        
        powerMS = workMS / time;
        System.out.println("The power is " + powerMS + "W");
        
        return powerMS;
    }
    
    // This method receives input of work done and time to give a result of the work done in english units
    public double powerI() {
        System.out.println("12. Power = Work / Time (Imperial)");
        System.out.print("Input work in foot-pound(ft\u00b7lb-f): ");
        double workIS = userInput.nextDouble();
        System.out.print("Input time in minutes(min): ");
        double time = userInput.nextDouble();
        double powerIS;
        
        powerIS = workIS / time;
        System.out.println("The power is " + powerIS / 32572 + "hp");
        
        return powerIS;
    }
    
    // This method receives input of force exerted and area to give a result of the work done in metric units
    public double pressureM() {
        System.out.println("13. Pressure = Force / Area (Metric)");
        System.out.print("Input force in Newtons(N): ");
        double forceMS = userInput.nextDouble();
        System.out.print("Input area square-meters(m\u00b2): ");
        double areaMS = userInput.nextDouble();
        double pressureMS;
        
        pressureMS = forceMS / areaMS;
        System.out.println("The pressure exerted is: " + pressureMS + "Pa");
        
        return pressureMS;
    }
    
    // This method receives input of force exerted and area to give a result of the work done in english units
    public double pressureI() {
        System.out.println("14. Pressure = Force / Area (Imperial)");
        System.out.print("Input force in pound-force(lb-f): ");
        double forceIS = userInput.nextDouble();
        System.out.print("Input area in square-inches(in\u00b2): ");
        double areaIS = userInput.nextDouble();
        double pressureIS;
        
        pressureIS = forceIS / areaIS;
        System.out.println("The pressure exerted is: " + pressureIS + "psi");
        
        return pressureIS;
    }
}