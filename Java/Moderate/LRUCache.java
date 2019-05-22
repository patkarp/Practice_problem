/**LRU Cache using LinkedHashMap
 * https://www.geeksforgeeks.org/design-a-data-structure-for-lru-cache/
 * removeEldestEntry() is overridden to impose a policy for removing old mappings when size goes beyond capacity.
 */
import java.util.*;
import java.io.*;
class LRUCache{
    LinkedHashMap<Integer, Integer> lhm;
    private final int CAPACITY;
    public LRUCache(int capacity){
        CAPACITY = capacity; 
        lhm = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) { 
            protected boolean removeEldestEntry(Map.Entry eldest) 
            { 
                return size() > CAPACITY; 
            } 
        }; 

    }
    //O(1)
    public int get(int key){
        System.out.println("Fetching value for the Key:"+key);
        return lhm.getOrDefault(key, -1);
    }

    public void set(int key, int value){
        System.out.println("Seting the (key, " +  
             "value) : (" + key + ", " + value + ")"); 
             lhm.put(key,value);
    }
    public static void main(String[]args){
        
        LRUCache cache = new LRUCache(2);//Capacity 2, anything above 2 would overide
        cache.set(1, 10);  
  
        cache.set(2, 20);  
        System.out.println("Value for the key: 1 is " +  
                           cache.get(1)); // returns 10 
  
        // evicts key 2 and store a key (3) with 
        // value 30 in the cache. 
        cache.set(3, 30);  
  
        System.out.println("Value for the key: 2 is " +  
                cache.get(2)); // returns -1 (not found) 
  
        // evicts key 1 and store a key (4) with 
        // value 40 in the cache. 
        cache.set(4, 40);  
        System.out.println("Value for the key: 1 is " + 
               cache.get(1)); // returns -1 (not found) 
        System.out.println("Value for the key: 3 is " +  
                           cache.get(3)); // returns 30 
        System.out.println("Value for the key: 4 is " + 
                           cache.get(4)); // return 40 

    }
}