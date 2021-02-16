import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stackList;

    public Stack() {
        this.stackList = new ArrayList<>();
    }

    public boolean isEmpty() {
        if(stackList.size() == 0) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        int topElement = stackList.size() - 1;
        stackList.add(topElement + 1, value);
    }

    public ArrayList<String> values() {
            return stackList;
    }

    public String take() {
        int topElement = stackList.size() - 1;
        String valueTop = stackList.get(topElement);
        stackList.remove(topElement);
        return  valueTop;
    }
}
