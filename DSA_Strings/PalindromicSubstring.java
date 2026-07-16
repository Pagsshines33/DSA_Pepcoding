import java.util.Scanner;

public class PalindromicSubstring {
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i <= j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);

            if(c1 != c2){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;   
    }

    public static void solution(String str){
        for(int i=0; i<str.length(); i++){
            for(int j= i+1; j<=str.length(); j++){
                String ss = str.substring(i,j);
                if (isPalindrome(ss)){
                    System.out.println(ss);
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        solution(str);
        SC.close();
    }

  
}

