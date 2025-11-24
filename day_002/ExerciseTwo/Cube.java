package day2.ExerciseTwo;

public class Cube extends Shape3D {
    private double edge;

    public Cube(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(getEdge(), 3);
    }

    @Override double calculateSurfaceArea() {
        return 6.0 * Math.pow(getEdge(), 2);
    }
}
