import java.util.*;

import java.util.Scanner;

public class AddLast {
        public static class Node{
            int data;
            Node next;
        }

        public static class LinkedList{
            Node head;
            Node tail;
            int size;

            void addLast(int val){
                Node temp = new Node();
                temp.data = val;
                temp.next = null;

                if(size == 0){
                    head = tail = temp;
                }else{
                    tail.next = temp;
                    tail = temp;
                }
                size++;
            }

            void display(){
                Node current = head;
                while(current != null){
                    System.out.println(current.data + " ");
                    current = current.next;
                }
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            LinkedList list = new LinkedList();

            System.out.println("Enter no. of nodes: ");
            int n = sc.nextInt();

            System.out.print("Enter the values: ");

            for(int i =0; i<n; i++){
                int value = sc.nextInt();
                list.addLast(value);
            }
            System.out.print("Linked List: ");
            list.display();

            sc.close();
    }
    
}
