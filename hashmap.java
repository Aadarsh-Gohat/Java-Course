import java.util.HashMap;
public class hashmap{
    public static void main(String args[])
    {
        HashMap<Integer,String> hs=new HashMap<Integer,String>();
        hs.put(1,"aadi");
        hs.put(2,"adarsh");
        hs.put(3,"aman");
        hs.put(4,"abhi");
        System.out.println();
        System.out.println(hs.get(3));
        System.out.println(hs.remove(2)); //add key which item want to remove
        System.out.println(hs);
        System.out.println(hs.getOrDefault(3,"unknown"));
        System.out.println(hs.getOrDefault(2,"unknown string"));
        System.out.println(hs.size());

// Loop Through a HashMap

// Loop through the items of a HashMap with a for-each loop.

// Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:


        System.out.println("below is the keys iteration");


        for(int i:hs.keySet()){
             System.out.println(i);
        }
        System.out.println();
        System.out.println("below is the value iteration");


        for(String i:hs.values()){
             System.out.println(i);
        }
        System.out.println();

// using both key and value pairs with for each loop

        for(int i:hs.keySet()){
            System.out.println("keys "+i+" values "+hs.get(i));
        }
        System.out.println();

        hs.clear();
        System.out.println(hs);
    }
}