
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> examPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.examPoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.examPoints.add(points);
    }

    public double averageOfGrades() {
        double average = 0;
        double sumOfGrades = 0;
        if(grades.isEmpty()) {
            return -1;
        }
        for(Integer grade : grades) {
            sumOfGrades += grade;
        }
        average = sumOfGrades / grades.size();
        return  average;
    }

    public double averageOfPoints() {
        double average = 0;
        double sumOfPoints = 0;
        if(examPoints.isEmpty()) {
            return -1;
        }
        for(Integer point : examPoints) {
            sumOfPoints += point;
        }
        average = sumOfPoints / examPoints.size();
        return average;
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
