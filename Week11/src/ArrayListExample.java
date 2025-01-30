import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Programming");
        list.add("Language");

        for (String element : list) {
            System.out.println(element);
        }

    }
}
