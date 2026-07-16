package Arrays;
import java.util.Scanner;

public class InverseArray {
    
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements:");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i< a.length; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i< a.length; i++){
            System.out.println(a[i]);
        }
        int[] inv = new int[a.length];
        for(int j=0; j< a.length; j++){
            int v = a[j];
            inv[v] = j;
        }
        for(int k = 0; k < a.length; k++){
            System.out.println(inv[k]);

        }
        sc.close();
    }
}

