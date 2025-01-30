import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("John");
        list.add("Doe");
        list.add("Jane");
        list.add("Smith");
        list.add("James");

        for (String element : list) {
            System.out.println(element);
        }
    }
}
