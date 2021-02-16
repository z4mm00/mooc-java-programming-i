import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> gifts;

    public Package() {
        gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int totalWeight() {
        int totWeight = 0;
        for(Gift gift : gifts) {
            totWeight = totWeight + gift.getWeight();
        }
        return totWeight;
    }
}
