package day2.ExerciseTwo;

public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(6);
        Cube cube = new Cube(7);

        double sphereVolume = sphere.calculateVolume();
        double sphereArea = sphere.calculateSurfaceArea();
        double cubeVolume = cube.calculateVolume();
        double cubeArea = cube.calculateSurfaceArea();
        
        System.out.printf("The sphere's volume is %.2f%n", sphereVolume);
        System.out.printf("The sphere's area is %.2f%n%n", sphereArea);
        System.out.printf("The cube's volume is %.2f%n", cubeVolume);
        System.out.printf("The cube's area is %.2f%n", cubeArea);
    }
}
