public class Archive {
    private String identifier;
    private String name;

    public Archive(String newIdentifier, String newName) {
        this.identifier = newIdentifier;
        this.name = newName;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object compared) {  //Equals method created to compare if Archive objets are equal
        if(this == compared) {
            return true;
        }
        if(!(compared instanceof Archive)) {
            return false;
        }
        Archive comparedArchive = (Archive) compared;
        if(this.identifier.equals(comparedArchive.identifier)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return identifier + ": " + name;
    }
}
