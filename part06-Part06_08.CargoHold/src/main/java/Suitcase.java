import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private final int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if ((item.getWeight() + this.totalWeight()) <= maxWeight) {
            items.add(item);
        }
    }

    public void printItems(){
        for(Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int fullWeight = 0;
        for(Item item : items){
            fullWeight += item.getWeight();
        }
        return fullWeight;
    }

    public Item heaviestItem() {
        if(items.isEmpty()) {
            return null;
        }

        Item heavy = items.get(0);
        for(Item item : items) {
            if(heavy.getWeight() < item.getWeight()) {
                heavy = item;
            }
        }
        return heavy;
    }

    public String toString() {
        String outputFormat = "";

        if(items.size() == 0) {
            outputFormat = "no items (0 kg)";
        }

        if(items.size() == 1) {
            outputFormat = "1 item (" + this.totalWeight() + " kg)";
        }

        if (items.size() > 1) {
            outputFormat = items.size() + " items (" + this.totalWeight() + " kg)";
        }
        return outputFormat;
    }

}
