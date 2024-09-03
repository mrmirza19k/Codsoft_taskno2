import java.util.Scanner;
public class GradeCalculator {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Total number of subjects: ");
                int subject_number = scanner.nextInt();
                double[] marks = new double[subject_number];
                for (int i = 0; i < subject_number; i++) {
                        System.out.print("Marks obtained in subject " + (i + 1) + " out of 100: ");
                        marks[i] = scanner.nextDouble();
                }
                double totalMarks = 0;
                for (int i = 0; i < subject_number; i++) {
                        totalMarks += marks[i];
                }
                double average = totalMarks / subject_number;
                String grade = calculateGrade(average);
                System.out.println("\n--- Results ---");
                System.out.println("Total Marks: " + totalMarks);
                System.out.println("Average Percentage: " + String.format("%.2f", average) + "%");
                System.out.println("Grade: " + grade);
                scanner.close();
        }
        private static String calculateGrade(double percentage) {
                if (percentage >= 90) {
                        return "O";
                }
                else if (percentage >= 80) {
                        return "A+";
                } else if (percentage >= 70) {
                        return "A";
                } else if (percentage >= 60) {
                        return "B";
                } else if (percentage >= 50) {
                        return "C";
                } else if(percentage>=33){
                        return "D";
                } else {
                        return "F";
                }
        }
}