public class Main {
    public static void main(String[] args) {
        // Define the pattern for each letter
        String[] N = {
            "*   *",
            "**  *",
            "* * *",
            "*  **",
            "*   *"
        };
        String[] A = {
            "  *  ",
            " * * ",
            "*****",
            "*   *",
            "*   *"
        };
        String[] R = {
            "**** ",
            "*   *",
            "**** ",
            "*  * ",
            "*   *"
        };
        String[] E = {
            "*****",
            "*    ",
            "**** ",
            "*    ",
            "*****"
        };
        String[] N2 = {
            "*   *",
            "**  *",
            "* * *",
            "*  **",
            "*   *"
        };

        // Print the pattern row by row
        for (int i = 0; i < 5; i++) {
            System.out.println(N[i] + " " + A[i] + " " + R[i] + " " + E[i] + " " + N2[i]);
        }
    }
}
