package Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void reverse(Character[] a, int i, int j){
        int s = i;
        int e = j;
        while(s<e){
            Character temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }

    } 
        public static void rotate(Character[]a, int k){
            k = k % a.length;
            if(k<0){
                k = k + a.length;
            }
            reverse(a, 0, a.length-k-1);
            reverse(a, a.length-k, a.length-1);
            reverse(a, 0, a.length-1);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements:");
        int n = sc.nextInt();
        Character [] a = new Character[n];
        System.out.println("Enter the elements:");
        for(int i =0; i< a.length; i++){
            a[i] = sc.next().charAt(0);
        }
        System.out.println("Enter the no. of times u need to rotate:");
        int k = sc.nextInt();
        rotate(a,k);
        System.out.println("Rotated Array:");
        for(int i =0; i<a.length;i++){
            System.out.println(a[i]);
        }
        sc.close();   
    }
}
