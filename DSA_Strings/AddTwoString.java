public class AddTwoString {
    public static void main(String[] args){
        String s1 ="hello";
        String s2 ="world";
        String s3 = s1 + " " + s2;

        s1+= " ";
        s1+= 'w';
        s1+= '1';
        s1+= 10;
        System.out.println(s3);
        System.out.print(s1);
    }
    
}
