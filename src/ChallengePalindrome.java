import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ChallengePalindrome {
    public static void main(String[] args) {
        System.out.print(isPalindrome("ayse"));

    }


    public static boolean isPalindrome(String text){
        String cleanText =  text.replaceAll("[,?.'! ]", "");
        String[] cleanArr = cleanText.split("");
        Stack stack = new Stack<>();
        Queue queue = new LinkedList();
        for(String character: cleanArr){
            stack.push(character);
            queue.add(character);
        }
        while(!queue.isEmpty()){
            Object c = queue.remove();
            Object cStack = stack.pop();
            if(!c.equals(cStack)){
                return false;
            }
        }
        return true;

    }



}
