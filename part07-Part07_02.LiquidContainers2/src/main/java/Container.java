public class Container {

    private int amount;
    private int liters;

    public Container () {
        amount = 0;
        liters = 0;
    }
// It returns the amount of liquid in a container as an integer.
    public int contains () {
        return liters;
    }
// It adds the amount of liquid given as a parameter to the container.
// the amount is negative, no liquid is added. A container can hold a maximum
// of 100 units of liquid.
    public void add (int amount) {
        if (amount > 0) {
            liters += amount;
            if (liters > 100) {
                liters = 100;
            }
        }
    }
// which removes the amount of liquid given as a parameter from the container.
// If the amount is negative, no liquid is removed.
// A container can never hold less than 0 units of liquid.
    public void remove (int amount) {
        if (amount > 0) {
            liters -= amount;
            if (liters < 0) {
                liters = 0;
            }
        }
    }

// It returns the container as a string formatted
// "amount of liquid/100".
    public String toString() {
        return liters + "/100";
    }
}
