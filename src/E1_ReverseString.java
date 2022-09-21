import java.util.Stack;

public class E1_ReverseString {

    public static void main(String[] args) {
        String myStr = "StringToReverse";
        System.out.println(myStr +"\nReversed: "+ ReverseString(myStr));
    }
    public static String ReverseString(String str) {
        Stack<Character> stack = new Stack<Character>();

        //Push into the stack each char
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        char[] reverseString = new char[str.length()];
        int i = 0;
        //Pop the chars from the Stack
        while (!stack.isEmpty()) {
            reverseString[i] = stack.pop();
            i++;
        }
        String strReversed = new String(reverseString);
        return strReversed;
    }
}
