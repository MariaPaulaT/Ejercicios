package LinkedList;
/*Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false. */

import java.util.HashMap;

class ListNode1 {
      int val;
      ListNode1 next;
      ListNode1(int x) {
          val = x;
          next = null;
      }

  }
 
public class HasCycle {
    
    public static boolean hasCycle(ListNode1 head){
        boolean answer = false;
        HashMap <Integer, Boolean> mapa = new HashMap<Integer, Boolean>();
        int index =0;
        ListNode1 actual = head;
        if (head == null){
            return false;
        }
        while (answer == false && actual.next != null){
            if (!mapa.containsKey(actual.val)){
            mapa.put(actual.val, false);}
            else{
                answer = true;
            }
            actual = actual.next;
        }
        System.out.println(answer);
     
        return answer;
    }

    public boolean hasCycle2(ListNode1 head) {
        if(head==null)return false;
        ListNode1 n1=head,n2=head.next;

        while(n1!=n2){
            if(n2==null || n2.next==null)
                return false;
            n1=n1.next; 
            n2=n2.next.next;
        }
        return true;
        
    }

    public static void main(String[] args) {
        ListNode1 nodo = new ListNode1(1);
        ListNode1 nodo1 = new ListNode1(2);
        ListNode1 nodo2 = new ListNode1(3);
        ListNode1 nodo3 = new ListNode1(4);
        nodo.next = nodo1;
        nodo1.next = nodo2;
        nodo2.next = nodo3;
        nodo3.next = nodo2;

        hasCycle(nodo);


    }
}
