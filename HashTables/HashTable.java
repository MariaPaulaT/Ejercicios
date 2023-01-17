package Ejercicios.HashTables;

 import java.util.LinkedList;
class Entry<K, V> {
	
	K key;
	V value;
	
	//Constructor, Time O(1), Space O(1)
	public Entry(K key, V val) {
		this.key = key;
		this.value = val;
	}
	
	//Check equality of entry,compare value not object, Time O(1), Space O(1)
	public boolean equals(Entry<K, V> entry) {
		if (!this.key.equals(entry.key))
			return false;
		return this.value.equals(entry.value);
	}
	
	//Override, Time O(1), Space O(1)
	@Override 
	public String toString() {
		return "(" + key.toString() + ", " + value.toString() + ")";
	}	
}
public class HashTable<K, V> {
	
	private int maxSize;
	private LinkedList<Entry<K, V>>[] buckets; 
	//Constructor, Time O(1), Space O(m), m is max size
	@SuppressWarnings("unchecked")
	public HashTable(int capacity) {
		maxSize = capacity;
		buckets = ((LinkedList<Entry<K, V>>[]) new LinkedList[maxSize]);		
	}

    //Calculate hashcode by key, Time O(1), Space O(1)
	public int hashFunc(K key) {
		return Integer.parseInt(key.toString()) % maxSize;
	}

    //Add an entry, Time O(1), Space O(1) 
	public void put(K key, V value) {
		int x = hashFunc(key);
		if (buckets[x] == null) 
			buckets[x] = new LinkedList<Entry<K, V>>();
		LinkedList<Entry<K, V>> list = buckets[x];	
		Entry<K, V> entry = new Entry<K, V>(key, value);
		list.add(entry);
	}

    //Delete all entries by key, Time O(n), Space O(n), n is max length of list in bucket
    public void delete(K key) {
        int x = hashFunc(key);
        if (buckets[x] == null)
        	return;
        LinkedList<Entry<K, V>> list = buckets[x];
        LinkedList<Entry<K, V>> list2 = new LinkedList<>(); //copy to another list
        for (Entry<K, V> entry : list) {
        	if (!entry.key.equals(key)) {
                list2.add(entry);
        	}
        }
        buckets[x] = (list2.size() == 0) ? null: new LinkedList<>(list2); 
    }

    //Return first found value by key, Time O(n), Space O(1), n is max length of list in bucket
	public V get(K key) {
		int x = hashFunc(key);
		if (buckets[x] == null) 
			return null;
		LinkedList<Entry<K, V>> list = buckets[x];
		for (Entry<K, V> entry : list) {
			if (entry.key.equals(key)) 
				return entry.value;
		}		
		return null;		
	}

    

    //Print the whole hash table, Call printList, Time O(m*n), Space O(1), 
    //m is size of buckets, n is max list size 
    public void print() {
    	for (int i = 0; i < maxSize; i++) {    		
    		LinkedList<Entry<K, V>> list = buckets[i];
    		if (list != null)
    			printList(list);
    	}
    }
    
    //Print list in one bucket, Time O(n), Space O(1), n is list size 
    private void printList(LinkedList<Entry<K, V>> list) {
    	for (Entry<K, V> entry : list)
			System.out.print(entry + " ");
		System.out.println();
    }
}   
