
import java.util.Map;
import java.util.HashMap;


public class StateCapitals {
    
    public static void main (String[] args){
    
    Map <String, String> countries= new HashMap<>();
    
    countries.put("Alabama", "Montgomery");
    countries.put("Alaska", "Juneou");
    countries.put("Arizona", "Phoenix");
    countries.put("Arkansas", "Little Rock");
    
        for(String i: countries.keySet()){
        System.out.println(i + "_" + countries.get(i));

        }
    }       
}   