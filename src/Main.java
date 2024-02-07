import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));

    }

    public static boolean checkForPalindrome(String text) {
        String cleanText =  text.replaceAll("[,?.'! ]", "");
        String[] cleanArr = cleanText.split("");
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        Stack<String> stack3 = new Stack<>();
        for( String character: cleanArr){
            stack1.push(character.toLowerCase());
            stack2.push(character.toLowerCase());
        }
        for(String character: cleanArr){
            String theCharacter = stack2.pop();
            stack3.push(theCharacter.toLowerCase());
        }

        return stack1.equals(stack3);
    }




}