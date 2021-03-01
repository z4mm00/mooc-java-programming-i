public class Bird {

    private String name;
    private String nameInLatin;
    private int observationCount;

    public Bird (String name, String nameInLatin) {
        this.name = name;
        this.nameInLatin = nameInLatin;
        this.observationCount = 0;
    }

    public String getName () {
        return name;
    }

    public String getNameInLatin () {
        return nameInLatin;
    }

    public int getObservationCount () {
        return observationCount;
    }

    public void addObservation () {
        observationCount ++;
    }

    public String toString () {
        return name + " (" + nameInLatin + "): " + observationCount + " observations";
    }
}
