import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    public GradeStats statistics;
    private GradeStats myTest;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        statistics = new GradeStats();
        myTest = new GradeStats();
    }

    public void start () {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int point = Integer.valueOf(scanner.nextLine());
            if (point == -1) {
                break;
            }
            if (point >= 0 && point <= 100) {
                statistics.add(point);
            }
        }
        System.out.println("Point average (all): " + statistics.pointAverage());
        if (statistics.pointAveragePassing() == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + statistics.pointAveragePassing());
        }
        System.out.println("Pass percentage: " + statistics.passPercentage());
        System.out.println("Grade distribution: ");
        int[] listGraded = statistics.gradeDistribution();
        System.out.println("5: " + printStars(listGraded[5]));
        System.out.println("4: " + printStars(listGraded[4]));
        System.out.println("3: " + printStars(listGraded[3]));
        System.out.println("2: " + printStars(listGraded[2]));
        System.out.println("1: " + printStars(listGraded[1]));
        System.out.println("0: " + printStars(listGraded[0]));
    }

    public static String printStars (int count) {
        String stars = "";
        for (int i = 0; i < count; i ++) {
            stars += "*";
        }
        return stars;
    }
}
