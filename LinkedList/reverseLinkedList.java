package LinkedList;

public class reverseLinkedList {

    public static void reverseList(LinkedList lista){
        LinkedList respuesta = new LinkedList();
        int index = lista.length-1;
        System.out.println(index);
        while(index != -1){
            respuesta.append(lista.get(index));
            System.out.println("gwsfcsd");
            index--;
        }

        respuesta.printList();
    }

    public static LinkedList reverseList2(LinkedList lista){
        if(lista.head.next==null){
            return lista;
        }
        Node first = lista.head;
        lista.tail = lista.head;
        Node second = first.next;
        while (second != null){
            Node actual = second.next;
            second.next = first;
            first = second;
            second = actual;
        }
        lista.head.next = null;
        lista.head = first;
        lista.printList();
        return lista;
    }
    
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();

        lista.append(1);
        lista.append(2);
        lista.append(3);
        lista.append(4);
        lista.append(5);

        lista.printList();

        reverseList2(lista);

    }
}
