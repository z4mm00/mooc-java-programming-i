
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if(this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int difference = (this.squares * this.pricePerSquare) - (compared.squares * compared.pricePerSquare);
        if(difference < 0) {
            return difference * (-1); // In case the difference comes in negative values
        }
        return difference;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int thisAptPrice = this.squares * this.pricePerSquare;
        int comparedAptPrice = compared.squares * compared.pricePerSquare;
        if(thisAptPrice > comparedAptPrice) {
            return true;
        }
        return false;
    }

}
