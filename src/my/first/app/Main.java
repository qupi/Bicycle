/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.first.app;

/**
 *
 * @author quang.tran
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome To My First Application");
        Bicycle bikeOne = new Bicycle();
        Bicycle bikeTwo = new Bicycle();
        
        // Biker 001 start the bicyle with mininum configuration
        bikeOne.startTheBicyle ("Biker 001",1,1);
        bikeOne.increaseGear(4);
        bikeOne.increaseGear(2); //error because exceed max gear.
    }
}
