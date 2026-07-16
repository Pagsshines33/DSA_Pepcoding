public class StringSplit {
    public static void main(String[] args) {
        String s = "abc def ghi jkl mno pqr stu vwx";
        String[] parts = s.split(" ");
        for(int i = 0; i< parts.length; i++){
            System.out.println(parts[i]);
        } 
    }
    
}
