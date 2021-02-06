
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter count = new Counter();
        System.out.println(count.value());

        count.increase();
        System.out.println(count.value());

        count.increase(-10);
        System.out.println(count.value());

        count.decrease(-5);
        System.out.println(count.value());
        count.decrease();

        System.out.println(count.value());

        Counter cuenta = new Counter(500);
        cuenta.decrease(100);
        System.out.println(cuenta.value());

    }
}
