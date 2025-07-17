import java.util.List;
import java.util.ArrayList;

public class GradeEquation {
    public static List<String> gradeEquation(List<Double> gpas) {
        List<String> grades = new ArrayList<>();
        for (Double gpa : gpas) {
            if (gpa >= 4.0) {
                grades.add("A+");
            } else if (gpa >= 3.7) {
                grades.add("A");
            } else if (gpa >= 3.3) {
                grades.add("A-");
            } else if (gpa >= 3.0) {
                grades.add("B+");
            } else if (gpa >= 2.7) {
                grades.add("B");
            } else if (gpa >= 2.3) {
                grades.add("B-");
            } else if (gpa >= 2.0) {
                grades.add("C+");
            } else if (gpa >= 1.7) {
                grades.add("C");
            } else if (gpa >= 1.3) {
                grades.add("C-");
            } else if (gpa >= 1.0) {
                grades.add("D+");
            } else