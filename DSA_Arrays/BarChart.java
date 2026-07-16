package Arrays;
import java.util.Scanner;
public class BarChart{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no. of elements to be entered:");
        int n = scan.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        int max = arr[0];
        for(int i =0; i<n; i++){
            if (arr[i]> max){
                max = arr[i];
            }
        }

        for(int floor = max; floor>=1; floor--){
            for(int i =0; i< n; i++){
                if (arr[i]>=floor){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        scan.close();
    }

}