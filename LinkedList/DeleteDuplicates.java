package LinkedList;

 class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2() {}
    ListNode2(int val) { this.val = val; }
    ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
  }

public class DeleteDuplicates {
    
    public static void main(String[] args) {
        ListNode2 nodo = new ListNode2(1);
        ListNode2 nodo1 = new ListNode2(1);
        ListNode2 nodo2 = new ListNode2(2);
        ListNode2 nodo3 = new ListNode2(4);
        ListNode2 nodo4 = new ListNode2(4);
        nodo.next = nodo1;
        nodo1.next = nodo2;
        nodo2.next = nodo3;
        nodo3.next= nodo4;

        deleteDuplicates(nodo);

    }
    
    
   
    public static ListNode2 deleteDuplicates(ListNode2 nodo) {
           
        ListNode2 actual = nodo;
        ListNode2 siguiente = actual.next;
        while(actual.next!= null){
            int primero = actual.val;
            int segundo = actual.next.val;
            if (primero == segundo){
                if(siguiente.next != null){
                actual.next = siguiente.next;
                }else{
                    actual.next=null;
                }
            }
            
            if(actual.next != null){

                actual = actual.next;
            }
            if(siguiente.next != null){

                siguiente= actual.next;
            }
        }
        System.out.println(nodo.val);
        System.out.println(nodo.next.val);
        System.out.println(nodo.next.next.val);
        
        System.out.println(nodo.next.next.next.val);

        return nodo;
    }
   
}
