import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Binary {

    public static void main(String[] args){
        System.out.println(decimalToBinary(6));
    }

    public static LinkedList<Integer> decimalToBinary(int decimal){
        LinkedList<Integer> binary = new LinkedList<>();
        while(decimal>0){
            int remainder = decimal%2;
            binary.push(remainder);
            decimal /=2;
        }
        System.out.println("binary: " + binary);
        return binary;
    }

}
