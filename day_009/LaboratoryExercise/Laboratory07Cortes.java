package day9.LaboratoryExercise;

/**
 *
 * @author Cortes, Rafael Louise D. | CS101A
 */
public class Laboratory07Cortes {
    public static void main(String[] args) {
        // PROGRAM #1
        String p1_str = "Music Therapy";
        int p1_result = p1_str.indexOf('T');
        System.out.println("\nPROGRAM #1:");
        System.out.println(p1_result); // Output: 6

        // PROGRAM #2
        String p2_str1 = "Oro";
        String p2_str2 = "Plata";
        String p2_str3 = "Mata";
        int p2_result = p2_str1.compareTo(p2_str2);
        System.out.println("\nPROGRAM #2:");
        System.out.println(p2_result); // Output: -1

        // PROGRAM #3
        String p3_str1 = "Out";
        String p3_str2 = "Inside ";
        String p3_result1 = p3_str2.concat(p3_str1); // Output: Inside Out
        String p3_result2 = p3_str1.concat(p3_str2); // Output: OutInside
        System.out.println("\nPROGRAM #3:");
        System.out.printf("%s, %s%n", p3_result1, p3_result2); // Formatted Output

        // PROGRAM #4
        String p4_str1 = "Programming";
        String p4_str2 = "Coding";
        String p4_str3 = "Writing";
        int p4_result1 = p4_str2.compareTo(p4_str1); // Output: -13
        int p4_result2 = p4_str3.compareTo(p4_str1); // Output: 7
        int p4_result3 = p4_str2.compareTo(p4_str3); // Output: -20
        System.out.println("\nPROGRAM #4:");
        System.out.printf("%d, %d, %d%n", p4_result1, p4_result2, p4_result3); // Formatted Output
    }
}