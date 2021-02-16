public class Gift {

    private String name;
    private int weight;

    public Gift(String newName, int newWeight) {
        this.name = newName;
        this.weight = newWeight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return name + " (" + weight + " kg)";
    }
}
