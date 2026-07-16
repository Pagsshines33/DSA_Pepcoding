import java.util.ArrayList;

class Intro{
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        System.out.println(list+"->"+list.size());
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list+"->"+list.size());

        list.add(1,100);
        System.out.println(list+"->"+list.size());

        int val = list.get(1);
        System.out.println(val);

        list.set(1,1000);
        System.out.println(list+"->"+list.size());

        list.remove(1);
        System.out.println(list+"->"+list.size());

        //string
        ArrayList <String> l2 = new ArrayList<>();
        l2.add("Hello");
        l2.add("Bye");
        l2.add("Goodnight!");
        System.out.println(l2 + "->" +l2.size());

        for(int i = 0; i < list.size(); i++){
            int value = list.get(i);
            System.out.println(value);
        }

        for(int val1 : list){
            System.out.println(val1);
        }
    }
}