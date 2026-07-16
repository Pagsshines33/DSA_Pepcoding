package Arrays;
import java.util.Scanner;
public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the no of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        int[] arr = new int[n];
        for(int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the no to be found:");
        int target = sc.nextInt();

        int index = -1;
        for(int i = 0; i<n; i++){
            if(arr[i]== target){
                index = i;
                break;
            }
        }
        if(index != -1) {
            System.out.println("Number found at index: " + index);
        } else {
            System.out.println("Number not found");
        }
        sc.close();
      }  
}
