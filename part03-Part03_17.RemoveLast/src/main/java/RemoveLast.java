
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList <String> strings = new ArrayList<>();
        strings.add("Sam");
        strings.add("Kiks");
        strings.add("Last");
        System.out.println(strings);
        System.out.println("Now deleting last");
        removeLast(strings);
        System.out.println(strings);
    }

    public static void removeLast(ArrayList <String> strings) {
        if (strings.size() == 0) {
        } else {
            int lastIndex = strings.size() - 1;
            strings.remove(lastIndex);
        }
    }
}
