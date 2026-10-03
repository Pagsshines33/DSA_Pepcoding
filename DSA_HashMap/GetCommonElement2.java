import java.util.*;

public class getCommonElement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1:");
        int n1 = sc.nextInt();
        System.out.println("Enter a1:");
        int[] a1 = new int[n1];
        for(int i =0; i< n1; i++){
            a1[i] = sc.nextInt();
        }
        System.out.println("Enter n2:");
        int n2 = sc.nextInt();
        System.out.println("Enter a2:");
        int[] a2 = new int[n2];
        for(int i =0; i< n1; i++){
            a2[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int val: a1){
            if(hmap.containsKey(val)){
                int of = hmap.get(val);
                int nf = of + 1;
                hmap.put(val, nf);
            }else{
                hmap.put(val, 1);
            }
        }

        for(int val: a2){
            if(hmap.containsKey(val)&& hmap.get(val)>0){
                System.out.println(val + " ");
                int of = hmap.get(val);
                int nf = of - 1;
                hmap.put(val, nf);
            }
        }
        sc.close();
    }
    
}
