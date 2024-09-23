
import java.util.LinkedHashMap;
import java.util.*;


class LRU {
    LinkedHashMap<Integer, Integer> lhm;
    private final int CAPACITY;

    LRU(int capacity){
        CAPACITY=capacity;
        lhm = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) { 
        protected boolean removeEldestEntry(Map.Entry eldest) 
        { 
            return size() > CAPACITY; 
        } 
    }; 
    }
    void setValue(Integer key, Integer value){
        lhm.put(key, value);
        System.out.println("Seting the (key, " +  
             "value) : (" + key + ", " + value + ")"); 
    }

    Integer getValue(Integer key){
         System.out.println("Fetching value for the Key:"+key);
         Integer get=lhm.getOrDefault(key, -1);
         return get;
         
    }
    void getHashMap(){
        System.out.println("FullHashmap:"+ lhm);
    }
    public static void main(String args[]){
        LRU l1= new LRU(2);
        l1.setValue(1, 3);
        l1.setValue(2, 4);
        l1.getValue(2);
        l1.getHashMap();

        l1.setValue(3, 6);
        l1.getValue(2);

        l1.getHashMap();

        l1.setValue(4, 6);
        l1.getValue(1);
        l1.getHashMap();
        

    }

}