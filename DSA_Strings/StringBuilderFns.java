public class StringBuilderFns {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

        char ch = sb.charAt(0);
        System.out.println(ch);

        sb.setCharAt(0, 'd');
        System.out.println(sb);

        sb.insert(2,'y');
        System.out.println(sb);

        sb.deleteCharAt(2);
        System.out.println(sb);

        sb.append('g');
        System.out.println(sb);

        sb.length();
        System.out.println(sb.length());


    }
    
}
