public class ShortCircuit{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        int max = (a > b) & (a > c) ? a : ((b > c) ? b : c);

        System.out.println("The maximum number is: " + max);
    }
}
