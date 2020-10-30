 import java.util.*;
import java.lang.*;

/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
       return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String s: array){
        if(s.equals(value))
            return true;
    }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int y = array.length-1;
        String [] reversed = new String[array.length];
        for(int i =0; i<=array.length-1; i++){
        reversed[i] = array[y];
        y--;
        }
        return reversed;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for (int i=0;i<array.length;i++){
       if (array[i].equals(array[array.length - i - 1])) return true;
    }
    return false;
}
      

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        Map<String,Integer> map = new HashMap<String, Integer>();
        for (char ch = 'A'; ch <= 'Z'; ch++) 
        map.put(String.valueOf(ch), 0); 
        for(String s : array){
            for(int i = 0; i<s.length(); i++){
                char c = s.charAt(i);
                char cUpperCase = Character.toUpperCase(c);
                String cToString = String.valueOf(cUpperCase);
                map.put(cToString, map.get(cToString) + 1);
                
                
            }
        }
    
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int check = 0;
        for(int i = 0; i<array.length; i++){
        if(array[i].equals(value)){
            check ++;
        }
        }
        return check;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String [] removed = new String[array.length-1];
        int x = 0;
        for(int i = 0; i<array.length; i++){
        if(!array[i].equals(valueToRemove)){
        removed[x]= array[i];
        x++;
        }
        }
        return removed;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int x = 0;
        // To get the string without duplicates size
        for(int i = 1; i<array.length-1; i++){
        
        if(!array[i].equals(array[x])){
         x++;   
        }
        else{
        
        }
    }
    String [] removedConsec = new String[x];   
    int y = 0;
    for(int z = 1; z<array.length-1; z++){
        if(!array[z].equals(array[y])){
         removedConsec[y] = array[y];   
        y++;
        }
        else{
        removedConsec[y] = array[z];
        y++;
        }
    }
    return removedConsec;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
