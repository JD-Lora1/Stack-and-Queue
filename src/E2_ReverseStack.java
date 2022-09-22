import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class E2_ReverseStack {

    public static <T> void main(String[] args) {
        //Case 1
        ArrayList<Integer> objectsInt = new ArrayList<>();
        objectsInt.addAll(List.of(1,2,3,4,5,6,7));

        //Case 2
        ArrayList<String> objectsStr = new ArrayList<>();
        objectsStr.addAll(List.of("Hello",":)",":D", "Bye"));

        //Call the reverse Method to initialize the stack
        //Change the variable between: objectsStr and objectsInt or any ArrayList<>
        Stack<T> reversedStack = (Stack<T>) reverseStack(objectsStr);

        //Print the reversed stack
        System.out.print("\nReversed Stack: ");
        while (!reversedStack.isEmpty()) {
            System.out.print(reversedStack.pop());
            if (!reversedStack.isEmpty())
                System.out.print(", ");
        }
        System.out.println("");
    }

    //Generic Method <T>
    public static <T> Stack<T> reverseStack(ArrayList<T> objects){
        Stack<T> stack1 = new Stack<T>();
        Stack<T> stackReversed = new Stack<T>();

        //Enter the objects on the stack
        for (T obj : objects){
            stack1.push(obj);
        }

        //Pop the objects from the Stack1, and push it to the reversedStack.
        System.out.print("Input Stack: ");
        while (!stack1.isEmpty()) {
            //Print the current/input Stack.
            System.out.print(stackReversed.push(stack1.pop()));

            if (!stack1.isEmpty())
                System.out.print(", ");
        }

        return stackReversed;
    }
}
