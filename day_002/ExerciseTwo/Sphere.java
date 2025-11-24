package day2.ExerciseTwo;

public class Sphere extends Shape3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateVolume() {
        return 4.0/3.0 * Math.PI * Math.pow(getRadius(), 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 4.0 * Math.PI * Math.pow(getRadius(), 2);
    }
}
