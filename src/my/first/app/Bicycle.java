/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.first.app;

/**
 *
 * @author Administrator
 */
public class Bicycle {
    
    /*
    * Definding state
    */
    int speed, cadence,gear = 0; // current informtion of object
    int maxGear = 5;
    int minGear = 0;
        
    /*
    * Definding behavior
    */
    void startTheBicyle (String firstName, int firstGear, int firstCadence) {
        // Print out Biker Name; start with Gear #; start with Cadence #
        System.out.println("--- START A BICYLE ---\nBiker Name: " + firstName + "\nGear: " + firstGear + "\nCadence: " + firstCadence + "\n--- START A BICYLE --- DONE");
    }
        
    void increaseGear (int increment){
        if (gear + increment < maxGear) {
            gear = increment + gear;
            System.out.println("--- GEAR INCREASMENT ---");
            System.out.println("Gear is increased. Now is " + gear);
            System.out.println("--- GEAR INCREASMENT --- DONE");
            } else System.out.println("Gear will be exceed if increased " + increment + " number more.");
        }
}
