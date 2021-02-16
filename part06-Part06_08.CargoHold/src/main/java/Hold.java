import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> hold;
    private int totalWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.hold = new ArrayList<>();
        this.totalWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if((suitcase.totalWeight() + this.totalWeight) <= maxWeight) {
            hold.add(suitcase);
            this.totalWeight += suitcase.totalWeight();
        }
    }

    public void printItems() {
        for(Suitcase suitcase : hold) {
            suitcase.printItems();
        }
    }

    public String toString() {
        String outputFormat = "";

        if(hold.size() == 0) {
            outputFormat = "no suitcases (0 kg)";
        }

        if(hold.size() == 1) {
            outputFormat = "1 suitcase (" + this.totalWeight + " kg)";
        }

        if (hold.size() > 1) {
            outputFormat = hold.size() + " suitcases (" + this.totalWeight + " kg)";
        }
        return outputFormat;
    }
}
