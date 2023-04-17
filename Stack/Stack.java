package Stack;
import java.util.ArrayList;
public class Stack {
    private ArrayList<Integer> arrayList;

    public Stack (int size){
        arrayList = new ArrayList<>();
    }

    public void push(int value) {
        arrayList.add(value);

      }

      public void pop(){
        if(!isEmpty()){
        int size=arrayList.size()-1;
       arrayList.remove(size);
      }
      }

      public int size() {
        return arrayList.size();
      }

      public int peek() {
        if (isEmpty()) {
          throw new RuntimeException("Stack underflow");
        }
        return arrayList.get(size()-1);
      }

      public boolean isEmpty() {

        return arrayList.size() == 0;
      }
    
      public static void main(String[] args) {
        Stack sta = new Stack(5);
        sta.push(1);
        System.out.println(sta.peek());
        sta.push(2);
        System.out.println(sta.peek());
        sta.push(3);
        
        System.out.println(sta.peek());
        sta.push(4);
        System.out.println(sta.peek());
        sta.pop();
        
        System.out.println(sta.peek());
        sta.pop();
        
        System.out.println(sta.peek());
        sta.pop();
        
        System.out.println(sta.peek());

      }
}
