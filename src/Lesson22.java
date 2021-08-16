import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Lesson22 {

    public static void main(String[] args) {


        // STACK example
        Stack<String> myStringStack = new Stack<>();

        myStringStack.push("Artjoms!");
        myStringStack.push("is");
        myStringStack.push("name");
        myStringStack.push("my");
        myStringStack.push("Hello");

        System.out.println(myStringStack.size());
        int stackSize = myStringStack.size();
        for (int i = 0; i < stackSize; i++) {
            System.out.println(myStringStack.pop());
        }


//        QUEUE EXAMPLE
        Queue<String> myStringQueue = new LinkedList<>();

        myStringQueue.add("It");
        myStringQueue.add("is");
        myStringQueue.add("a");
        myStringQueue.add("Wonderful");
        myStringQueue.add("day!");

        int myQueueLength = myStringQueue.size();

        for (int i = 0; i < myQueueLength; i++) {
            System.out.println(myStringQueue.remove());
        }


        // PALINDROME TASK

        // String stringToTest = "mom";
        // String stringToTest = "not a palindrome";
        // String stringToTest = "Madam";
        String stringToTest = "Ma - dam";

        stringToTest = stringToTest.replaceAll("[^a-zA-Z0-9]", "");
        if ( isPalindrome(stringToTest) ) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }

    static boolean isPalindrome(String possiblePalindrome) {

        Stack<String> myStack = new Stack<>();
        int halfTheLength = possiblePalindrome.length() / 2;

        for (int i = 0; i < halfTheLength ; i++) {
            myStack.push(Character.toString(possiblePalindrome.charAt(i)));
        }
        
        // odd
        if( possiblePalindrome.length() % 2 != 0 ) {
            halfTheLength++;
        }

        for (int i = halfTheLength; i < possiblePalindrome.length(); i++) {
            if ( !Character.toString(possiblePalindrome.charAt(i)).equalsIgnoreCase(myStack.pop()) ) {
                return false;
            }
        }
        return true;
        // return true/false;
    }
}
