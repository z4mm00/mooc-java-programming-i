import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> list;

    public TodoList() {
        list = new ArrayList<>();
    }

    public void add(String task) {
        list.add(task);
    }

    public void remove(int number) {
        list.remove(number-1);
    }

    public void print() {
        int index = 0;
        while(index < list.size()) {
            System.out.println((index+1) + ":" + list.get(index));
            index++;
        }
    }


}

