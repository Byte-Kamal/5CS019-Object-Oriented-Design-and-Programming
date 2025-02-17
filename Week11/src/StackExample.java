import java.util.Stack;

public class StackExample {
    public static void main(String[] args){
        Stack<String> stackExample = new Stack<>();
        stackExample.push("A");
        stackExample.push("B");
        stackExample.push("C");

        System.out.println("Pop Item: " + stackExample.pop());
        stackExample.push("D");
        stackExample.push("E");
        stackExample.peek();

        System.out.println("Stack: " + stackExample);
    }
}
