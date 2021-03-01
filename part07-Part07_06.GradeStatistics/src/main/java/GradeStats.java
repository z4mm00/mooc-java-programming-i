import java.util.ArrayList;

public class GradeStats {

    private ArrayList<Integer> pointTotals;

    public GradeStats () {
        pointTotals = new ArrayList<>();
    }

    public void add (int points) {
        pointTotals.add(points);
    }

    public double pointAverage () {
        int sum = 0;
        for (Integer points : pointTotals) {
            sum = sum + points;
        }
        double average = (sum * 1.0) / pointTotals.size();
        return average;
    }

    public double pointAveragePassing () {
        int sum = 0;
        int count = 0;
        for (Integer points : pointTotals) {
            if (points >= 50) {
                sum = sum + points;
                count ++;
            }
        }
        if (count == 0) {
            return 0;
        }
        double average = (sum * 1.0) / count;
        return average;
    }

    public double passPercentage () {
        int passing = 0;
        for (Integer points : pointTotals) {
            if (points >= 50) {
                passing++;
            }
        }
        double percentage = (100.0 * passing) / pointTotals.size();
        return percentage;
    }

    public int[] gradeDistribution () {
        int[] listOfGrades = new int[6];
        int grade = 0;
        for (Integer points : pointTotals) {
            if (points < 50) {
                listOfGrades[0] += 1;
                continue;
            }
            if (points < 60) {
                listOfGrades[1] += 1;
                continue;
            }
            if (points < 70) {
                listOfGrades[2] += 1;
                continue;
            }
            if (points < 80) {
                listOfGrades[3] += 1;
                continue;
            }
            if (points < 90) {
                listOfGrades[4] += 1;
                continue;
            }
            if (points >= 90) {
                listOfGrades[5] += 1;
                continue;
            }
        }
        return  listOfGrades;
    }

}
