import java.util.*;

public class SetExample {
    public static void main(String[] args){
        Set<String> setExample = new HashSet<>();
        setExample.add("A");
        setExample.add("B");
        setExample.add("C");

        System.out.println("Set: " + setExample);

        Set<String> setExample2 = new HashSet<>();
        setExample2.add("A");
        setExample2.add("B");
        setExample2.add("C");
        setExample2.add("D");
        setExample2.add("E");

        System.out.println("Set2: " + setExample2);

        setExample.addAll(setExample2);
        System.out.println("Set: " + setExample);

        setExample.removeAll(setExample2);
        System.out.println("Set: " + setExample);

        setExample.retainAll(setExample2);
        System.out.println("Set: " + setExample);

    }
}
