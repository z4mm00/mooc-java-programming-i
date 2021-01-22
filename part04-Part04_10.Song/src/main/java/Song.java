public class Song {
    private String name;
    private int lengthSecs; //Seconds

    public Song(String name, int length) {
        this.lengthSecs = length;
        this.name = name;
    }

    public String name() {
        return this.name;
    }

    public int length() {
        return this.lengthSecs;
    }


}
