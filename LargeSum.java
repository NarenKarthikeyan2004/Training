import java.math.BigInteger;

public class LargeSum {
    public static void main(String[] args) {
        String a = "999888777666555444333222111";
        String b = "999888777666555444333222111";
        BigInteger number1 = new BigInteger(a);
        BigInteger number2 = new BigInteger(b);
        BigInteger sum = number1.add(number2);
        String result = sum.toString();
        System.out.println("The sum is: " + result);
    }
}
