package problem11_GradingStudents;

import java.util.Arrays;
import java.util.List;

public class GradingStudents {

    public static void main(String[] args) {
        System.out.println(gradingStudents(Arrays.asList(37, 52, 54, 53, 56, 97)));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        for (int i = 0; i < grades.size(); i++) {
            int grade = grades.get(i);
            int nextMultipleOf5 = (grade / 5 + 1) * 5;
            if (grade >= 38 && (nextMultipleOf5 - grade < 3)) {
                grades.set(i, nextMultipleOf5);
            }
        }
        return grades;
    }

}
