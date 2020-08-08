import java.util.*;
public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
       // throw new UnsupportedOperationException("Waiting to be implemented.");
        
        Set<String> hs = new HashSet<>();
        
        for(String str: names1){
            hs.add(str);
        }
		
		 for(String str: names2){
            hs.add(str);
        }
        
        
         String[] array = new String[hs.size()];
         hs.toArray(array);
        
        return array;
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}