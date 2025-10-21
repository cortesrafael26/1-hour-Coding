package day7;

public abstract class Shape {
    /*
    Exercise 1: Upcasting and Method Overriding
    Create a Shape class with a method draw().
    Create two subclasses, Circle and Square, extending Shape.
    Override the draw() method in both Circle and Square to print a specific message for each shape (e.g., "Drawing a circle," "Drawing a square").
    In a main method:
    Create a Circle object and a Square object.
    Upcast both objects to Shape references.
    Call the draw() method on the Shape references. Observe which draw() method is invoked.
    */
    public abstract void draw();
}
