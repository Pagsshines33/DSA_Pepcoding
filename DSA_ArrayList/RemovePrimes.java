import java.util.*;

public class RemovePrimes {
    public static boolean isPrime(int val){
        for(int div = 2; div*div <= val ; div++){
            if(val%div == 0){
                return false;
            }
        }
        return true;
    }


    public static void Solution(ArrayList<Integer> l1){
        for(int i= l1.size()-1; i>=0;i--){
            int val = l1.get(i);
            if(isPrime(val)==true){
                l1.remove(i);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Integer> l1 = new ArrayList<>();
        for(int i =0; i<n ;i++){
            l1.add(sc.nextInt());
        }
        Solution(l1);
        System.out.println(l1);
        sc.close();
    }
    
}
