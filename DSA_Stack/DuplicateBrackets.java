import java.util.*;

public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        System.out.println("Enter the expression: ");

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {

                if (!st.isEmpty() && st.peek() == '(') {
                    System.out.println("True");
                    sc.close();
                    return;
                }

                while (!st.isEmpty() && st.peek() != '(') {
                    st.pop();
                }

                if (!st.isEmpty()) {
                    st.pop(); // remove '('
                }

            } else {
                st.push(ch);
            }
        }

        System.out.println("False");
        sc.close();
    }
}