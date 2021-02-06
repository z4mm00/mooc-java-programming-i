
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared) {
        if(this == compared) { // To check the variables are located in the same address position
            return true;
        }

        if(!(compared instanceof Song)) { // To check if the compared object is not a Song instance
            return false;
        }

        Song comparedSong = (Song) compared;  // To convert the object into a Song object
        if(this.name.equals(comparedSong.name) &&  // To compare object variables one by one
           this.artist == comparedSong.artist &&
           this.durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
