import java.util.Scanner;

public class StudentMarks {

    // ---------- Part 1 ----------
    // Method accepts marks directly as an array literal — no named array
    // is created by the caller. Java still builds an array under the hood
    // (that's the only way to pass a variable-length group of ints), but
    // the caller never assigns it to a variable.
    static int totalMarks(int[] marks) {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum;
    }

    // ---------- Part 3 ----------
    // Prints a jagged array where each row (department) can have a
    // different number of columns (subjects).
    static void printDepartmentMarks(String[] deptNames, int[][] deptMarks) {
        for (int d = 0; d < deptMarks.length; d++) {
            System.out.print(deptNames[d] + ": ");
            int total = 0;
            for (int s = 0; s < deptMarks[d].length; s++) {
                System.out.print(deptMarks[d][s]);
                total += deptMarks[d][s];
                if (s != deptMarks[d].length - 1) System.out.print(", ");
            }
            System.out.println("  -> Total = " + total + ", Subjects = " + deptMarks[d].length);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------- Part 1: pass 5 marks directly, no named array ----------
        System.out.println("=== Part 1: Total of 5 marks passed directly ===");
        int total1 = totalMarks(new int[]{85, 90, 78, 92, 88});
        System.out.println("Total marks = " + total1);
        System.out.println();

        // ---------- Part 2: 3 students x 3 subjects, user input, tabular ----------
        System.out.println("=== Part 2: Marks of 3 students in 3 subjects ===");
        int numStudents = 3;
        int numSubjects = 3;
        int[][] studentMarks = new int[numStudents][numSubjects];

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter marks for Student " + (i + 1) + ", Subject " + (j + 1) + ": ");
                studentMarks[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMarks Table:");
        System.out.printf("%-12s", "Student");
        for (int j = 0; j < numSubjects; j++) {
            System.out.printf("Sub%-6d", (j + 1));
        }
        System.out.println("Total");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-12s", "Student " + (i + 1));
            int rowTotal = 0;
            for (int j = 0; j < numSubjects; j++) {
                System.out.printf("%-9d", studentMarks[i][j]);
                rowTotal += studentMarks[i][j];
            }
            System.out.println(rowTotal);
        }
        System.out.println();

        // ---------- Part 3: departments with different subject counts (jagged array) ----------
        System.out.println("=== Part 3: Marks by department (different subject counts) ===");
        String[] deptNames = {"Science", "Commerce", "Arts"};
        int[][] deptMarks = new int[3][];
        deptMarks[0] = new int[]{88, 76, 91, 84};       // Science: 4 subjects
        deptMarks[1] = new int[]{79, 85, 90};           // Commerce: 3 subjects
        deptMarks[2] = new int[]{92, 87};               // Arts: 2 subjects

        printDepartmentMarks(deptNames, deptMarks);

        sc.close();
    }
}