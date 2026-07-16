package Arrays;
public class SpanOfArray {
    public static void main(String[] args) {
        int[] arr = {2,3,9,10,25,6};
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        int span = max - min;
        System.out.print(span);
  
    } 
}
