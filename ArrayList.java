import java.io.*; 
import java.util.List;
  
class ArrayList { 
    public static void main(String[] args) 
    { 
        List<Integer> al = new ArrayList<Integer>(); 
        al.add(10); 
        al.add(20); 
        al.add(30); 
        al.add(40); 
  
        Object[] objects = al.toArray(); 
  
        // Printing array of objects 
        for (Object obj : objects) 
            System.out.print(obj + " "); 
    } 
}

