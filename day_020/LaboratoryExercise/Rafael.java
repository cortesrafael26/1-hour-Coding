package com.mycompany.cortes;

/**
 *
 * @author Cortes, Rafael Louise D. | CS201A
 */
public class Rafael extends Cortes {
    String additionalFact1 = "My favorite color is Red.";
    String additionalFact2 = "My favorite food is Fried Chicken.";
    
    @Override // Method Overriding
    void printFacts() {
        super.printFacts(); // Called the superclass' original printFacts() method.
        System.out.println(additionalFact1);
        System.out.println(additionalFact2);
    }
}
