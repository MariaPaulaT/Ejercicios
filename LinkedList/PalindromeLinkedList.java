package LinkedList;

import java.util.ArrayList;

/*Given the head of a singly linked list, return true if it is a 
palindrome or false otherwise. */

/** Definition for singly-linked list. */
  class ListNode {
  int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class PalindromeLinkedList {


    public static boolean palindrome (ListNode nodo){
        //Put everything on an array
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int len =0;
        boolean answer = false;
        while(nodo.next != null){
            nums.add(nodo.val);
            len++;
        }

        int j = len;
        for(int i =0; i<len/2; i++){
            if (j == i){
                answer = true;
                j--;
            }else{
                System.out.println("falsw");
                return false;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        ListNode nodo = new ListNode(1);
        ListNode nodo1 = new ListNode(2);
        ListNode nodo2 = new ListNode(3);
        ListNode nodo3 = new ListNode(4);
        nodo.next = nodo1;
        nodo1.next = nodo2;
        nodo2.next = nodo3;
        nodo3.next = nodo2;

        palindrome(nodo);


    }
}
