import java.util.List;
import java.util.LinkedList;
class collectionll {
    public static void main(String args[])
    {
      List<String> ob=new LinkedList<String>();
      ob.add("ada");
      ob.add("aman");
      ob.add("abhi");
      ob.add("aastha");
      ob.add(3,"third"); //its index no not position!
      ob.addFirst("nero");
      ob.addLast("kick");
      ob.addAll(4,ob);
      System.out.println(ob);

      System.out.println(ob.get(2));// always have to pass index!
      System.out.println(ob.getFirst());
      System.out.println(ob.getLast());
      System.out.println(ob.size());

      
      System.out.println(ob.set(2,"changed"));// it will return the value which is changing 
      System.out.println(ob);


      System.out.println(ob.remove(1));
      System.out.println(ob);
      System.out.println(ob.removeFirst());
      System.out.println(ob);
      System.out.println(ob.removeLast());
      System.out.println(ob);
      System.out.println(ob.remove("ada")); //it will remove element
      System.out.println(ob);


      System.out.println(ob.contains("kick"));
      System.out.println(ob);
      System.out.println(ob.contains("kich"));
      System.out.println(ob);
      System.out.println(ob.isEmpty());
      System.out.println(ob);

    }
}