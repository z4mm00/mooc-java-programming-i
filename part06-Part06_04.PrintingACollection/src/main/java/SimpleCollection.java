
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public  String toString() {
        String printOut = "The collection " + name;
        String finalString = "";
        if(elements.isEmpty()) {
            finalString = printOut + " is empty.";
        }

        if(!elements.isEmpty()){
            int count = elements.size();
            if(count == 1) {
                String stringElements = "";
                for(String element : elements) {
                    stringElements = stringElements + element;
                }
                finalString = printOut +  " has 1 element:\n" + stringElements;
            }
            if(count >= 2) {
                String stringElements = "";
                for(String element : elements) {
                    stringElements = stringElements + element + "\n";
                }
                finalString = printOut +  " has " + count + " elements:\n" + stringElements;
            }
        }
        return finalString;
    }
    
}
