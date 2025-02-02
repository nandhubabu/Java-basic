import java.util.*;

public class Tokenizer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input;
        int sum =0;

        System.out.println("Enter a String");
        input = sc.nextLine();

        System.out.println("Integers used in The string :");
        StringTokenizer st = new StringTokenizer(input);

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            try {
                int num = Integer.parseInt(token);
                System.out.println(num);
                sum += num;
            } catch (Exception e) {
                // Ignore tokens that are not integers
            }
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
